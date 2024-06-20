package br.com.alura.aula3.desafios.desafio5;

public class Quadrado implements Forma {

    double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
