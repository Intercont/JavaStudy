package com.algaworks.msr.streams;

import com.algaworks.msr.streams.model.Categoria;
import com.algaworks.msr.streams.model.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploMapCollect {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        Categoria categoriaImoveis = new Categoria("Imóveis");
        Categoria categoriaVeiculos = new Categoria("Veiculos");
        Categoria categoriaEletrodomesticos = new Categoria("Eletrodomesticos");

        produtos.add(new Produto("Celular", Produto.Status.ATIVO, new BigDecimal(1950.80), categoriaEletrodomesticos));
        produtos.add(new Produto("TV", Produto.Status.ATIVO, new BigDecimal(1500.50), categoriaEletrodomesticos));
        produtos.add(new Produto("Geladeira", Produto.Status.INATIVO, new BigDecimal(1650.80), categoriaEletrodomesticos));
        produtos.add(new Produto("Carro", Produto.Status.ATIVO, new BigDecimal(51950.80), categoriaVeiculos));
        produtos.add(new Produto("Casa", Produto.Status.INATIVO, new BigDecimal(351950.80), categoriaImoveis));

        //criar uma lista das categorias ativas da forma tradicional - a complexidade aumenta pois temos blocos dentro de blocos
//        List<Categoria> categorias = new ArrayList<>();
//
//        for (Produto produto : produtos) {
//            if (produto.getStatus().equals(Produto.Status.ATIVO)) {
//                Categoria categoria = produto.getCategoria();
//
//                //preciso validar se a categoria já não se encontra na lista (pois se trata de uma lista e não de um Set neste exemplo)
//                if (!categorias.contains(categoria)) {
//                    categorias.add(categoria);
//                }
//            }
//        }

        //Substituindo a operação acima pela API de Streams
        List<Categoria> categorias = produtos.stream()
                .filter(p -> p.getStatus().equals(Produto.Status.ATIVO)) //apenas produtos com o Status Ativo
                .map(Produto::getCategoria) //que me traga as categorias e não os produtos
                .distinct() //apenas elementos distintos, para não repetir os elementos, como estava acontecendo acima
                .collect(Collectors.toList()); //e através do collect com o Collectors, transforme o resultado desse stream filtrado em uma Lista


        System.out.println(categorias);




    }
}
