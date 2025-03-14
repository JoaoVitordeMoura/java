package com.mycompany.ronaldinhogaucho;

public class RonaldinhoGaucho {
    public static void main(String[] args) {
        int [][] ronaldinho = {
            {2005, 9, 2, 4, 6, 2},
            {2006, 0, 7, 6, 2, 4},
            {2007, 9, 8, 4, 0, 7, 3, 1}
        };
        
        for(int[] campeonato: ronaldinho){
            int ano = campeonato[0];
            int gols = 0;
            for(int i = 1; i < campeonato.length; i++){
                gols += campeonato[i];
            }
            double media =  (double)gols/(campeonato.length - 1);
            System.out.println(ano + ": " + media);
        }
        
    }
}
