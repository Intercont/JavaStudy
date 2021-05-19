package com.algaworks.msr.streams;

import com.algaworks.msr.streams.model.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class ExemploReducao {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Celular", Produto.Status.ATIVO, new BigDecimal(1950.80)));
        produtos.add(new Produto("TV", Produto.Status.ATIVO, new BigDecimal(1500.50)));
        produtos.add(new Produto("Geladeira", Produto.Status.ATIVO, new BigDecimal(1650.80)));
        produtos.add(new Produto("Carro", Produto.Status.ATIVO, new BigDecimal(51950.80)));
        produtos.add(new Produto("Casa", Produto.Status.INATIVO, new BigDecimal(351950.80)));

        //somatória do preço dos produtos ativos
//        BigDecimal total = BigDecimal.ZERO;
//
//        for (Produto produto :
//                produtos) {
//            if (produto.getStatus().equals(Produto.Status.ATIVO)) {
//                total = total.add(produto.getPreco()); //retorna o valor corrente do BigDecimal + o valor adicionado
//            }
//        }


        //Com a API de Streams

//        BinaryOperator<BigDecimal> operacao = (x, y) -> x.add(y); //ele replica os valores de adição da linha 25 acima

        BigDecimal total = produtos.stream()
                .filter(p -> p.getStatus().equals(Produto.Status.ATIVO)) //filtro para definir os produtos ativos
                .map(Produto::getPreco)
//                .reduce(BigDecimal.ZERO, operacao); //não é necessário ter o BinaryOperator separado
//                .reduce(BigDecimal.ZERO, (x, y) -> x.add(y)); //podemos ter o lambda diretamente ou ainda melhor
                .reduce(BigDecimal.ZERO, BigDecimal::add); //por Method Reference, pois o que add do BigDecimal faz, é exatamente o que replicamos acima no nosso operador

        System.out.println(total);
    }
}
