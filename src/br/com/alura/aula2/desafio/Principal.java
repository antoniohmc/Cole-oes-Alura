package br.com.alura.aula2.desafio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Bola", 49.99,1);
        Produto produto2 = new Produto("Tenis", 149.99,5);
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("goloseimas",9.99,1, LocalDate.of(2024,07,10));

        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("racao", 10.80, 3 ));
        produtos.add(new Produto("biscoito", 6.50, 1));
        produtos.add(new Produto("coleira", 32.49,1));
        produtos.add(produto1);
        produtos.add(produto2);

        System.out.println("=====================================");

        System.out.println("Lista de produtos");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        System.out.println("=====================================");

        System.out.println("Primeiro produto da lista: " + produtos.get(0).toString());
        System.out.println("=====================================");
        System.out.println("Produto perecivel: " + produtoPerecivel);

    }
}
