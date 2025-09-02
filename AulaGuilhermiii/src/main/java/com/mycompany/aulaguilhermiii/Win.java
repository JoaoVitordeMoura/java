package com.mycompany.aulaguilhermiii;

import javax.swing.JFrame;

public abstract class Win extends JFrame{
    public Win(String titulo, int largura, int altura, int posX, int posY,int fechamento){
        setupFrame(titulo, largura, altura, posX, posY, fechamento);
        
        setupComponents();
        setVisible(true);
    }
    public Win(String titulo, int largura, int altura, int fechamento){
        this(titulo, largura, altura, -1, -1, fechamento);
    }
    
    private void setupFrame(String titulo, int largura, int altura, 
            int posX, int posY,int fechamento){
        setTitle(titulo);
        setDefaultCloseOperation(fechamento);
        setSize(largura, altura);
        if(posX == -1 && posY == -1) setLocationByPlatform(true);
        else setLocation(posX, posY);
        }
    protected abstract void setupComponents();
        
}

