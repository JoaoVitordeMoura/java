package com.mycompany.animaisfazem;

public class Gato extends Animal{
    public Gato(String nome){
        super(nome);
    }
    
    @Override
    public void falar(){
        System.out.println(getNome() + ": Miaaau");
    }
}
