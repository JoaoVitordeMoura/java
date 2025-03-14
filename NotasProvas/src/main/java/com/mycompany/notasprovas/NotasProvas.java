package com.mycompany.notasprovas;

import java.util.Scanner;

public class NotasProvas {
    private static Scanner tec = new Scanner(System.in);
    public static void main(String[] args) {
        int np = input("Informe o número de provas: ");
        double [] vetorNotas = new double[np];
        double total = 0;
        
        for(int i = 0; i < np; i++){
            vetorNotas[i] = inputDouble("Nota " + (i + 1) + ": "); 
            total += vetorNotas[i]; 
        }
        
        System.out.print("As notas foram: ");
        for(int i = 0; i < np; i++){
            if (i == 0){
                System.out.print(vetorNotas[i]);
            }else if (i == np - 1){
                System.out.print(" e " + vetorNotas[i] + ".");
            }else{
                System.out.print(" , " + vetorNotas[i]);
            }
            
        }
        
        System.out.println();
        System.out.println("A Média é: " + (total/np));
        
    }
    
    private static int input(String msg){
        System.out.print(msg);
        return Integer.parseInt(tec.nextLine());
    }
    
    private static double inputDouble(String msg){
        System.out.print(msg);
        return Double.parseDouble(tec.nextLine());
    }
}
