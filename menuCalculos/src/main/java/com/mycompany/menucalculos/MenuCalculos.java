package com.mycompany.menucalculos;

import java.util.Scanner;

public class MenuCalculos {
    private static Scanner tec = new Scanner(System.in);
    public static void main(String[] args) {
        int op;

        do{
            op = menu();
            switch(op){
                case 1:
                    oposto();
                    break;
                case 2:
                    sinal();
                    break;
            }
        }while(op != 3);
    }
    
    private static int menu(){
        System.out.println("MENU");
        System.out.println("--------");
        System.out.println("1- Oposto");
        System.out.println("2- Sinal");
        System.out.println("3- Sair");
        System.out.print("Opção: "); 
        return Integer.parseInt(tec.nextLine());
    }
    
    private static void oposto(){
        double n = input("Digite um número: ");
//      n = n - n * 2;
        System.out.println("O oposto é: " + -n);
    }
    
    private static void sinal(){
        double n = input("Digite um número: ");
        if(n > 0){
            System.out.println("O número é positivo");
        }else if(n < 0){
            System.out.println("O número é negativo");
        }else{
            System.out.println("Nulo");
        }
    }
    
    private static double input(String msg){
        System.out.print(msg);
        return Double.parseDouble(tec.nextLine());
    }
    
     
}
