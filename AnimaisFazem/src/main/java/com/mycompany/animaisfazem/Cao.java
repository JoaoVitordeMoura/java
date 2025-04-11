package com.mycompany.animaisfazem;

public class Cao extends Animal{
    public Cao(String nome){
        super(nome);
    }
    
    @Override
    public void falar(){
        System.out.println(getNome() + ": Au Au");
    }
}
