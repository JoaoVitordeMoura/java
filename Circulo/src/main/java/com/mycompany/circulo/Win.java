package com.mycompany.circulo;

import javax.swing.*;
import java.math.*;


public abstract class Win extends JFrame{
    protected double x, y, raio, angulo;
    
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
        setLocation(posX, posY);
        }
    
    protected abstract void setupComponents();
    
   
    protected void addCircle(JComponent...components){
        
        for(JComponent component : components){
            x = raio * Math.cos(angulo);
            y = raio * Math.sin(angulo);
            
            component.setSize(component.getPreferredSize());
            component.setLocation((int)Math.round(x) + 180, (int)Math.round(y) + 150);
            add(component);
            angulo += 0.52;
            
        }
            
            
        
        
    };
        
}


