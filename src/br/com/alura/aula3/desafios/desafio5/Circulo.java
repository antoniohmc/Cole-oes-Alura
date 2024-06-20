package br.com.alura.aula3.desafios.desafio5;

public class Circulo implements Forma {

    double raio;

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
