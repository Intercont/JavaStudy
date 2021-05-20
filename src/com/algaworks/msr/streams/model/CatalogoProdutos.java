package com.algaworks.msr.streams.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CatalogoProdutos {

    List<Produto> produtos = new ArrayList<>();

    public CatalogoProdutos() {
        produtos.add(new Produto("Celular",Produto.Status.ATIVO, new BigDecimal(1950.80)));
        produtos.add(new Produto("TV", Produto.Status.ATIVO, new BigDecimal(1500.50)));
        produtos.add(new Produto("Geladeira", Produto.Status.ATIVO, new BigDecimal(1650.80)));
        produtos.add(new Produto("Carro", Produto.Status.ATIVO, new BigDecimal(51950.80)));
        produtos.add(new Produto("Casa", Produto.Status.ATIVO, new BigDecimal(351950.80)));
    }

    public Produto buscar(String nome) {
        return produtos.stream()
                .filter(p -> p.getNome().equals(nome))
                .findFirst().orElse(null);
    }

    public Optional<Produto> buscarOptional(String nome) {
        return produtos.stream()
                .filter(p -> p.getNome().equals(nome))
                .findFirst();
    }

    public Optional<BigDecimal> buscarPreco(String nome) {
        return produtos.stream()
                .filter(p -> p.getNome().equals(nome))
                .map(Produto::getPreco)
                .findFirst();
    }

}
