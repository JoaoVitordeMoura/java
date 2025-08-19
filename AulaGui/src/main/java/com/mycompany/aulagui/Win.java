package com.mycompany.aulagui;

import javax.swing.JFrame;

public class Win extends JFrame {
    //Construtor
    public Win(int x, int y, int horizontal, int vertical, String titulo, int fechamento){
        setupFrame(x, y, horizontal, vertical, titulo, fechamento);
        setupComponents();
        setVisible(true);
    }
    public Win(){
        this(-1, -1, -1, -1, "Titulo", 0);
    }
    //Métodos
    private void setupFrame(int x, int y, int horizontal, int vertical, String titulo, int fechamento){
        setTitle(titulo);
        setDefaultCloseOperation(fechamento);
        setSize(horizontal, vertical);
        
        if (x == -1 && y == -1) setLocationByPlatform(true);
        else setLocation(x, y);
    }
    
    
    private void setupComponents(){
        
    }
}
