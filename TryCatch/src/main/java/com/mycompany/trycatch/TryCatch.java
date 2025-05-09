package com.mycompany.trycatch;

import com.github.joao.Prompt;

public class TryCatch {
    
    public static void main(String[] args) {
        double n1 = Prompt.inputDouble("Primeiro número: ");
        double n2 = Prompt.inputDouble("Segundo número: ");
        int n3 = Prompt.inputInt("Terceiro número: ");
        int n4 = Prompt.inputInt("Quarto número: ", 1, 10);
        String s = Prompt.inputString("Digite alguma palavra: " , 5);
        System.out.println("A primeira soma é: " + (n1 + n2));
        System.out.println("A segunda soma é: " + (n3 + n4));
        System.out.println(s);
    }
    
    
}
