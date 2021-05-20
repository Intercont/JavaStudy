package com.algaworks.msr.streams;

import com.algaworks.msr.streams.model.CatalogoProdutos;

import java.math.BigDecimal;
import java.util.Optional;

public class ExemploOptional2 {
    public static void main(String[] args) {
        CatalogoProdutos catalogo = new CatalogoProdutos();

//        BigDecimal preco = catalogo.buscarPreco("Casa").orElse(BigDecimal.ZERO); //caso não contenha o preço, retorno zero

        BigDecimal preco = catalogo.buscarPreco("TV")
                .orElseThrow(() -> new RuntimeException("Preço não encontrado para o produto especificado")); //lançando exception quando não encontramos o produto

        System.out.println(preco);



    }
}
