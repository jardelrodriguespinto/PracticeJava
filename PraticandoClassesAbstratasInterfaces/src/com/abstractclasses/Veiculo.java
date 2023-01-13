package com.abstractclasses;

public  abstract class Veiculo {
    String marca;
    String modelo;
    int ano;
    // posso criar construtores, apesar de não poder instanciar esta classe
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    void ligar(){
        System.out.println("Veiculo ligando...");
    }
    abstract void desligar();


}
