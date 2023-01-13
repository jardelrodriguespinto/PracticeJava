package com.abstractclasses;

public abstract class Animais {
    String nome;
    int idade;

    public Animais(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    abstract void emitirSom();
    abstract void mover();

}
