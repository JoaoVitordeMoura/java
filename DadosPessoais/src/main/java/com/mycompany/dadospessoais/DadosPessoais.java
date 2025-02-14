package com.mycompany.dadospessoais;

import java.util.Scanner;

public class DadosPessoais {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual seu nome?: ");
        String nome = teclado.nextLine();
        System.out.print("Seu endereço: ");
        String end = teclado.nextLine();
        System.out.print("Seu bairro?: ");
        String bairro = teclado.nextLine();
        System.out.print("CEP: ");
        String cep = teclado.nextLine();
        System.out.print("Cidade: ");
        String cdd = teclado.nextLine();
        System.out.print("UF: ");
        String uf = teclado.nextLine();
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + end);
        System.out.println("Bairro: " + bairro);
        System.out.println("CEP: " + cep);
        System.out.println("Cidade: " + cdd + "-" + uf);
    }
}
