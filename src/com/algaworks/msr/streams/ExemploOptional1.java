package com.algaworks.msr.streams;

import com.algaworks.msr.streams.model.CatalogoProdutos;
import com.algaworks.msr.streams.model.Produto;

import java.math.BigDecimal;
import java.util.Optional;

public class ExemploOptional1 {

    public static void main(String[] args) {
        CatalogoProdutos catalogoProdutos = new CatalogoProdutos();

        //método tradicional
//        Produto produto = catalogoProdutos.buscar("Celular");
//
//        if (produto != null) { //validação para garantir que produto não esteja nulo é falha, Optional veio para substituir isso
//            System.out.println(produto.getPreco());
//
//            produto.setPreco(produto.getPreco().add(new BigDecimal(100)));
//            System.out.println(produto.getPreco());
//        }

        //Usando Optional
//        Optional<Produto> produtoOptional = catalogoProdutos.buscarOptional("Celular");

//        if (produtoOptional.isPresent()) {
//            Produto produto = produtoOptional.get();
//
//            System.out.println(produto.getPreco());
//            produto.setPreco(produto.getPreco().add(new BigDecimal(100)));
//            System.out.println(produto.getPreco());
//        }

        //outra forma de fazer a mesma validação acima
//        produtoOptional.ifPresent(produto -> {
//            System.out.println(produto.getPreco());
//            produto.setPreco(produto.getPreco().add(new BigDecimal(100)));
//            System.out.println(produto.getPreco());
//        });

        //usando a API de Streams - a partir do Java 9
//        produtoOptional.stream().forEach(produto -> { //usando o stream, ele vai rodar no que tiver, é pra ter apenas um cara, se não tiver nada, não roda
//            System.out.println(produto.getPreco());
//            produto.setPreco(produto.getPreco().add(new BigDecimal(100)));
//            System.out.println(produto.getPreco());
//        });

        //fazendo a busca e o processo todo em uma única chamada
        catalogoProdutos.buscarOptional("Celular").stream().forEach(produto -> {
            System.out.println(produto.getPreco());
            produto.setPreco(produto.getPreco().add(new BigDecimal(100)));
            System.out.println(produto.getPreco());
        });
    }
}
