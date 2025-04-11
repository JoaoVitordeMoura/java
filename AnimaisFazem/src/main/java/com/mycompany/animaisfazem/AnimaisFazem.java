package com.mycompany.animaisfazem;

public class AnimaisFazem {
    public static void main(String[] args) {
        Cao pluto = new Cao("Pluto");
        Cao krypto = new Cao("Krypto");
        Gato tom = new Gato("Tom");
        Gato mingau = new Gato("Mingau");
        Passaro flash = new Passaro("Flash");
        Passaro joaofrango = new Passaro("João Frango");
        
        Animal[] animais = {
            pluto, krypto,
            tom, mingau,
            flash, joaofrango
        };
        
        for(Animal animal: animais){
            animal.falar();
            
        }
    }
}
