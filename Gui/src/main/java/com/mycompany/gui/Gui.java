package com.mycompany.gui;

import javax.swing.JOptionPane;

public class Gui {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(
                null, "Qual o seu nome?" , "Nome" , JOptionPane.QUESTION_MESSAGE
        );
        
        if (nome == null){
            JOptionPane.showMessageDialog(
                    null, "ERRO, SEU COMPUTADOR VAI EXPLODIR, SEU BURRO", "ERRORS", JOptionPane.ERROR_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    null, "Bem vindo a wakanda " + nome , "WAKANDA PRA SENPRI", JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}
