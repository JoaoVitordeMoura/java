package com.mycompany.horario;

public class Horas {
    
    private int hora;
    private int minuto;
    private int segundo;

    public Horas(int hora, int minuto, int segundo){
        if(hora >=0 && hora <= 23){
            this.hora = hora;
        }
        if(minuto >= 0 && minuto <= 59){
            this.minuto = minuto;
        }
        if(segundo >= 0 && segundo <= 59){
            this.segundo = segundo;
        }
    }
    public Horas(int hora, int minuto){
        this(hora, minuto, 0);
    }
    public Horas(int hora){
        this(hora, 0, 0);
    }
    public Horas(){
        this(0, 0, 0);
    }
    
    public String getHoras(){
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        if(hora >=0 && hora <= 23){
            this.hora = hora;
        }
    }
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        if(minuto >= 0 && minuto <= 59){
            this.minuto = minuto;
        }
    }
    public int getSegundo() {
        return segundo;
    }
    public void setSegundo(int segundo) {
        if(segundo >= 0 && segundo <= 59){
            this.segundo = segundo;
        }
    }
    public void tick(){
        segundo++;
        if(segundo == 60){
            segundo = 0;
            minuto++;
            if(minuto == 60){
                minuto = 0;
                hora++;
                if(hora == 24){
                    hora = 0;
                }
            }
        }
    }
    public boolean Madrugada(){
        return hora < 5;
    }
    public boolean Manha(){
        return hora >= 5 && hora < 12;
    }
    public boolean Tarde(){
        return hora >= 12 && hora < 18;
    }
    public boolean Noite(){
        return hora >= 18;
    }
    
    public boolean VemDepois(Horas other){
        if (this.hora > other.hora){
            return true;
        }else if(this.hora == other.hora){
            if(this.minuto > other.minuto){
                return true;
            }else if(this.minuto == other.minuto){
                if(this.segundo > other.segundo){
                    return true;
                }
            }    
        }
        return true;
    }
    public boolean VemAntes(Horas other){
        return !this.Igual(other) && !this.VemDepois(other);
    }
    public boolean Igual(Horas other){
        return this.hora == other.hora && this.minuto == other.minuto && this.segundo == other.segundo;
    }
    
}