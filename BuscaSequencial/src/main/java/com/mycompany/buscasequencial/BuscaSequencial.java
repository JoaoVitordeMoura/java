package com.mycompany.buscasequencial;

import java.util.Random;
import java.util.Arrays;

public class BuscaSequencial {
    public static void main(String[] args) {
        int tamanho = 100000;
        int[] vetor = new int[tamanho];
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(100000);
        }
        
        Arrays.sort(vetor);
        
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetor[i]);
        }
                
        int numeroBuscado = 45159;

        int resultado = buscaSequencial(vetor, numeroBuscado);

        if (resultado != -1) {
            System.out.println("Número encontrado na posição: " + resultado);
        } else {
            System.out.println("Número não encontrado.");
        }
    }

    public static int buscaSequencial(int[] vetor, int chave) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == chave) {
                return i;
            }
        }
        return -1;
    }
}
