package com.abstractclasses;

public class Gato extends Animais{
    private String raca;

    public Gato(String nome, int idade, String raca) {
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
        System.out.println("Miaaaau! mi mi");
    }

    @Override
    void mover() {
        System.out.println(this.raca + " esta se movendo");
    }
}
