package com.mycompany.horario;

public class Horario {

    public static void main(String[] args) {
        Horas h1 = new FusoHorario(8, 30, 10, -3);
        Horas h2 = new Horas(05, 59, 20);
        System.out.println(h1.getHoras());
        System.out.println(h2.getHoras());
//        Horas h1 = new Horas(22);
//        Horas h2 = new Horas(22, 10);
//        
//        if(h2.VemDepois(h1)){
//            System.out.println("h2 é maior que h1");
//        }
//        if(h2.VemAntes(h1)){
//            System.out.println("h2 é menor que h1");
//        }
//        if(h2.Igual(h1)){
//            System.out.println("h2 é igual que h1");
//        }
        //System.out.println(h1.getHoras());
        
        //for(int i = 0; i < 86399; i++){
            //h1.tick();
            //System.out.println(h1.getHoras());
        //}
        //if(h1.Madrugada()){
            //System.out.println("Madrugada");
        //}else if(h1.Manha()){
            //System.out.println("Manha");
        //}else if(h1.Tarde()){
            //System.out.println("Tarde");
        //}else if(h1.Noite()){
            //System.out.println("Noite");
        //}
        
        //Horas h2 = new Horas(8, 25);
        //Horas h3 = new Horas(8);
        //Horas h4 = new Horas();
        //h1.setHora(90);
        //System.out.println(h1.getHoras());
        //System.out.println(h2.getHoras());
        //System.out.println(h3.getHoras());
        //System.out.println(h4.getHoras());
        //System.out.println(h1.getHora());
        //System.out.println(h1.getMinuto());
        //System.out.println(h1.getSegundo());
       
    }
}