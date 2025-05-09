package com.github.joao;

import java.util.Scanner;

public class Prompt {
    private static Scanner tec = new Scanner(System.in);
    
    public static double inputDouble(String msg){
        while(true){
            try{
                System.out.print(msg);
                return Double.parseDouble(tec.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Entrada inválida");
            }                       
        }
    }
    
    public static int inputInt(String msg){
        while(true){
            try{
                System.out.print(msg);
                return Integer.parseInt(tec.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Entrada inválida");
            }                       
        }
    }
    
    public static int inputInt(String msg, int min, int max){
        while(true){
            int n = inputInt(msg);
            if(n >= min && n <= max){
                return n;
            }else{
                System.out.println("intervalo inválido");
            }
        }
    }
    
    public static String inputString(String msg, int min){
        while(true){
            
            System.out.print(msg);
            String s = tec.nextLine().trim();
            
            if(s.length() >= min){
                return s;
            }else{
                System.out.println("Mínimo de caracteres: " + min);
            }                      
        }
    }
}
