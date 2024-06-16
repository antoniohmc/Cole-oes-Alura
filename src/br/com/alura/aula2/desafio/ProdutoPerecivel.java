package br.com.alura.aula2.desafio;

import java.time.LocalDate;

public class ProdutoPerecivel extends Produto{

    private LocalDate dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, LocalDate dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return
                "nome =' " + getNome() + '\'' +
                        ", preco = " + getPreco() +
                        ", quantidade = " + getQuantidade() +
                        ", data de validade = " + dataValidade;
    }
}
