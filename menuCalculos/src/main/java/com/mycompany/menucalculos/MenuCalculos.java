package com.mycompany.menucalculos;

import java.util.Scanner;

public class MenuCalculos {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int op;
        
        do{
            System.out.println("MENU");
            System.out.println("--------");
            System.out.println("1- Oposto");
            System.out.println("2- Sinal");
            System.out.println("3- Sair");
            System.out.print("Opção: ");
            op = Integer.parseInt(tec.nextLine());
        
            switch(op){
                case 1:
                    System.out.print("Digite um número: ");
                    double n = Double.parseDouble(tec.nextLine());
                    n = n - n * 2;
                    System.out.println("O oposto é: " + n);
                    break;
                case 2:
                    System.out.print("Digite um número: ");
                    n = Double.parseDouble(tec.nextLine());
                    if(n > 0){
                        System.out.println("O número é positivo");
                    }else if(n < 0){
                        System.out.println("O número é negativo");
                    }else{
                        System.out.println("Nulo");
                    }
                    break;
                case 3:
                    break;
            }
        }while(op != 3);
    }
}
