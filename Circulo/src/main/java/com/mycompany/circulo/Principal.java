package com.mycompany.circulo;

import javax.swing.*;

public class Principal extends Win{
    
    public JLabel S, E, J, A, B, e, M, V, I, N, D, O;
    
    public Principal(){
        super("Principal", 500, 300, 400, 300, JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    protected void setupComponents(){
        setLayout(null);          
          raio = 50;
          angulo = Math.PI / 2;
          
        S = new JLabel("S");
        E = new JLabel("E");
        J = new JLabel("J");
        A = new JLabel("A");
        B = new JLabel("B");
        e = new JLabel("E");
        M = new JLabel("M");
        V = new JLabel("V");
        I = new JLabel("I");
        N = new JLabel("N");
        D = new JLabel("D");
        O = new JLabel("O");
         addCircle(S, E, J, A, B, e, M, V, I, N, D, O);
    }
}
