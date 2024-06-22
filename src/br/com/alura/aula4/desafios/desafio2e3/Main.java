package br.com.alura.aula4.desafios.desafio2e3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Titulo primeiroTitulo = new Titulo("Elden Ring");
        Titulo segundoTitulo = new Titulo("Among us");
        Titulo terceiroTitulo = new Titulo("God of war");

        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(primeiroTitulo);
        lista.add(segundoTitulo);
        lista.add(terceiroTitulo);

        System.out.println("Lista ordenada por nome");
        Collections.sort(lista);
        System.out.println(lista);


    }
}
