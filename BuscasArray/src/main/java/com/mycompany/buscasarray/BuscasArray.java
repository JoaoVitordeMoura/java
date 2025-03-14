package com.mycompany.buscasarray;

import java.util.Random;
import java.util.Arrays;

public class BuscasArray {
    public static void main(String[] args) {
        int tamanho = 1000000;
        int[] vetor = new int[tamanho];
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(100000);
        }
        
        Arrays.sort(vetor);

        int numeroBuscado = 456325;

        int resultado = buscaBinaria(vetor, numeroBuscado);

        if (resultado != -1) {
            System.out.println("Número encontrado na posição: " + resultado);
        } else {
            System.out.println("Número não encontrado.");
        }
    }

    public static int buscaBinaria(int[] vetor, int chave) {
        int esquerda = 0;
        int direita = vetor.length - 1;
        int count = 0;
        
        while (esquerda <= direita) {
            count++;
            int meio = esquerda + (direita - esquerda) / 2;

            if (vetor[meio] == chave) {
                return meio;
            }

            if (vetor[meio] > chave) {
                direita = meio - 1;
            }
    
            else {
                esquerda = meio + 1;
            }
        }

        return -1;
    }
}