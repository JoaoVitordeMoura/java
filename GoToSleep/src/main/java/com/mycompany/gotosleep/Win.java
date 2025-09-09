package com.mycompany.gotosleep;

import javax.swing.JFrame;
import javax.swing.JComponent;

public abstract class Win extends JFrame{
    protected int x, y, gap;
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
    
    protected void addRow(JComponent...components){
        int h = 0;
        for(JComponent component : components){
            component.setLocation(x, y);
            
            component.setSize(component.getPreferredSize());
            
            add(component);
            
            x += component.getSize().width + gap;
            
            if(component.getSize().height > h){
            h = component.getSize().height;    
            }
            
            
        }
        x = gap;
        y += h + gap;
        
    };
        
}


