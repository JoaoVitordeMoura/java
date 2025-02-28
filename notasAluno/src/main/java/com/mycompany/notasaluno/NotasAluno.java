package com.mycompany.notasaluno;

import java.util.Scanner;

public class NotasAluno {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Qual sua nota?: ");
        double n = Double.parseDouble(tec.nextLine());
        
        while(n < 0 || n > 10){
            System.out.print("Qual sua nota?: ");
            n = Double.parseDouble(tec.nextLine());
        }
        
        if(n >= 9){
            System.out.println("Sua nota final é: " + n + ", A");
        }else if(n >= 8){
            System.out.println("Sua nota final é: " + n + ", B");
        }else if(n >= 7){
            System.out.println("Sua nota final é: " + n + ", C");
        }else{
            System.out.println("Sua nota final é: " + n + ", F");
        }
        
        //        System.out.print("Número que deseja saber se é primo: ");
//        double n = Double.parseDouble(tec.nextLine());
//        int count = 0;
//        
//        for(int i = 0;i <= n;i++){
//            double c = n % i;
//            if(c == 0){
//               count++;
//            }
//        }
//        
//        if(count > 2){
//            System.out.println("Não é primo");
//        }else{
//            System.out.println("É primo");
//        }
    }
}
