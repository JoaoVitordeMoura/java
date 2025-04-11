package com.mycompany.horario;

public class FusoHorario extends Horas{
    private int fuso;
    public FusoHorario(int hora, int minuto, int segundo, int fuso){
        super(hora, minuto, segundo);
        this.fuso = fuso;
    }
    
    @Override
    public String getHoras(){
        String horario = super.getHoras();
        if (fuso < 0){
            horario += String.format("%03d" , fuso);
        }else{
            horario += String.format("%03d" , fuso);
        }
        return horario;
    }
    
    public int getFuso(){
        return fuso;
    }
}
