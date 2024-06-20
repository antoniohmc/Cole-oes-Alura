package br.com.alura.aula3.desafios.desafio2e3;

public class Cachorro extends Animal {

    private double peso;

    public Cachorro(double peso) {
        this.peso = peso;
    }

    public Cachorro(String nome, String raca, double peso) {
        super(nome, raca);
        this.peso = peso;
    }
}
