package com.mycompany.animaisfazem;

public class Passaro extends Animal{
    public Passaro(String nome){
        super(nome);
    }
    
    @Override
    public void falar(){
        System.out.println(getNome() + ": Piu Piu");
    }
}

