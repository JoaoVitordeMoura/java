package com.mycompany.buscasarray;

public class BuscasArray {
    public static void main(String[] args) {
        int tamanho = 10000000;
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = i + 1;
        }

        int numeroBuscado = 9999999;

        int resultado = buscaBinaria(vetor, numeroBuscado);

        if (resultado != -1) {
            System.out.println("Número encontrado na posição: " + resultado + ", levando " + " etapas.");
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
