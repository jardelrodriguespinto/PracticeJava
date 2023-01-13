package com.interfaces;

public class Peixe implements Nadavel{
    private String especie;

    public Peixe(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public void nadar() {
        System.out.println(this.especie + " esta nadando");
    }

    @Override
    public void mergulhar() {
        System.out.println(this.especie + " esta mergulhando");
    }
}
