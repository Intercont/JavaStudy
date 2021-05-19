package com.algaworks.msr.streams;

import com.algaworks.msr.streams.model.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExemploAnyMatch {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Celular", Produto.Status.ATIVO, new BigDecimal(1950.80)));
        produtos.add(new Produto("TV", Produto.Status.ATIVO, new BigDecimal(1500.50)));
        produtos.add(new Produto("Geladeira", Produto.Status.ATIVO, new BigDecimal(1650.80)));
        produtos.add(new Produto("Carro", Produto.Status.INATIVO, new BigDecimal(51950.80)));
        produtos.add(new Produto("Casa", Produto.Status.INATIVO, new BigDecimal(351950.80)));

//        boolean temCarro = false;
//
//        for (Produto produto : produtos) {
//            if (produto.getNome().equals("Carro")) {
//                temCarro = true;
//                break;
//            }
//        }

        //usando a API de Streams
        boolean temCarro = produtos.stream()
                .anyMatch(p -> p.getNome().equals("Carro"));

        System.out.println(temCarro);


    }
}
