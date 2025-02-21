package com.mycompany.nomeusuario;

import java.util.Scanner;

public class NomeUsuario {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        double n1 = Double.parseDouble(tec.nextLine());
        System.out.print("Segundo número: ");
        double n2 = Double.parseDouble(tec.nextLine());
        double soma = n1 + n2;
        double sub = n1 - n2;
        double mult = n1 * n2;
        double div = n1 / n2;
        
        System.out.printf("%.2f + %.2f = %.2f\n", n1 , n2 , soma);
        System.out.printf("%.2f - %.2f = %.2f\n", n1 , n2 , sub);
        System.out.printf("%.2f x %.2f = %.2f\n", n1 , n2 , mult);
        System.out.printf("%.2f : %.2f = %.2f\n", n1 , n2 , div);
//        System.out.println(n1 + " + " + n2 + " = " + soma);
//        System.out.println(n1 + " - " + n2 + " = " + sub);
//        System.out.println(n1 + " x " + n2 + " = " + mult);
//        System.out.println(n1 + " / " + n2 + " = " + div);
//        System.out.print("Seu nome: ");
//        String nome = tec.nextLine();
//        System.out.print("Endereço: ");
//        String end = tec.nextLine();
//        System.out.print("Bairro: ");
//        String bairro = tec.nextLine();
//        System.out.print("CEP: ");
//        String cep = tec.nextLine();
//        System.out.print("Cidade: ");
//        String cdd = tec.nextLine();
//        System.out.print("UF: ");
//        String uf = tec.nextLine();
//        
//        System.out.println("Nome: " + nome);
//        System.out.println("Endereço: " + end);
//        System.out.println("Bairro: " + bairro);
//        System.out.println("CEP: " + cep);
//        System.out.println("Cidade: " + cdd);
//        System.out.println("UF: " + uf);

      
        
        
    }
}
