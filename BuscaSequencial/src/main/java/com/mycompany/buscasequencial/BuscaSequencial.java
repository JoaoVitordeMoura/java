package com.mycompany.buscasequencial;

public class BuscaSequencial {
    public static void main(String[] args) {
        int tamanho = 10000000;
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = i + 1;
        }
        
        int numeroBuscado = 9999999;

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

