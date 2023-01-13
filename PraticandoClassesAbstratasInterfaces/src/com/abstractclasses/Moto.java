package com.abstractclasses;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    public void cortarGiro(){
        System.out.println(this.modelo + " esta cortando giro com suas " + this.cilindradas + "CC");
    }
    @Override
    void ligar() {
        System.out.println(this.modelo + "esta ligando");
    }

    @Override
    void desligar() {
        System.out.println(this.modelo + "esta desligando");
    }
}
