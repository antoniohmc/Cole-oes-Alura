package br.com.alura.aula3.desafios.desafio1;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Carro> lista = new ArrayList<>();

        Carro carro1 = new Carro(
                "Pegeout",
                "206",
                2008
        );

        Carro carro2 = new Carro(
                "Honda",
                "Fit",
                2007
        );

        lista.add(carro2);
        lista.add(carro1);

        for (Carro carro : lista) {
            System.out.println(carro);
        }
    }
}
