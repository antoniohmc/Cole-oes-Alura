package br.com.alura.aula4.desafios.desafio1;

import java.util.ArrayList;
import java.util.Collections;

public class ListaDeInteiros {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(100);
        lista.add(90);
        lista.add(10);
        lista.add(2);
        lista.add(110);

        Collections.sort(lista);
        System.out.println(lista);
    }
}
