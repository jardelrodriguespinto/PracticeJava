package com.abstractclasses;

public class Cachorro extends Animais{
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    void emitirSom() {
        System.out.println("Au au au!");
    }

    @Override
    void mover() {
        System.out.println(this.nome + " esta corrrendo");
    }
}
