package com.abstractclasses;

public class Carro extends Veiculo{
    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }
    public void abrirPorta(){
        System.out.println(this.modelo + "esta abrindo as portas");
    }
    public void fecharPorta(){
        System.out.println(this.modelo + "esta fechando as portas");
    }
    @Override
    void ligar() {
        System.out.println(this.modelo + " esta ligando");
    }

    @Override
    void desligar() {
        System.out.println(this.modelo + " esta desligando");
    }
}
