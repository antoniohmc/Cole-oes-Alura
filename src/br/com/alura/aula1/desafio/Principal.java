package br.com.alura.aula1.desafio;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(pessoa);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        pessoa.setNome("Antonio");
        pessoa.setIdade(21);
        pessoa2.setNome("Andreia");
        pessoa2.setIdade(19);
        pessoa3.setNome("Leo");
        pessoa3.setIdade(6);

        System.out.println("Total de pessoas na lista: " + pessoas.size());
        System.out.println("Primeira pessoa da lista: " + pessoas.get(0).getNome());
        System.out.println("Lista de todas as pessoas: " + pessoas);
        System.out.println("toString da primeira pessoa: " + pessoas.get(0).toString());
    }
}
