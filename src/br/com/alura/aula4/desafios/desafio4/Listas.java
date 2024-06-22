package br.com.alura.aula4.desafios.desafio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {


        List<String> listaString = new ArrayList<>();

        listaString.add("Abelha");
        listaString.add("Boca");
        listaString.add("A");

        List<String> listaString2 = new LinkedList<>();

        listaString2.add("Boca");
        listaString2.add("Beterraba");
        listaString2.add("Abelha");
        listaString2.add("Carro");

        Collections.sort(listaString);
        System.out.println(listaString);

        Collections.sort(listaString2);
        System.out.println(listaString2);

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);

    }
}
