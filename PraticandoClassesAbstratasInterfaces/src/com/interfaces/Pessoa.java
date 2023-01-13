package com.interfaces;

public class Pessoa implements Nadavel{
    private String Name;
    private boolean sabeNadar;

    public Pessoa(String name, boolean sabeNadar) {
        Name = name;
        this.sabeNadar = sabeNadar;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isSabeNadar() {
        return sabeNadar;
    }

    public void setSabeNadar(boolean sabeNadar) {
        this.sabeNadar = sabeNadar;
    }

    @Override
    public void nadar() {
        if(sabeNadar){
            System.out.println(this.Name + " esta nadando");
        } else {
            System.out.println(this.Name + "não sabe nadar");
        }
    }

    @Override
    public void mergulhar() {
        if(sabeNadar){
            System.out.println(this.Name + " esta nadando");
        } else{
            System.out.println(this.Name + " não sabe mergulhar");
        }
    }
}
