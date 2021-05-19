package com.algaworks.msr.streams;

import com.algaworks.msr.streams.model.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExemploFilterForEach {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Celular", Produto.Status.ATIVO, new BigDecimal(1950.80)));
        produtos.add(new Produto("TV", Produto.Status.ATIVO, new BigDecimal(1500.50)));
        produtos.add(new Produto("Geladeira", Produto.Status.ATIVO, new BigDecimal(1650.80)));
        produtos.add(new Produto("Carro", Produto.Status.ATIVO, new BigDecimal(51950.80)));
        produtos.add(new Produto("Casa", Produto.Status.ATIVO, new BigDecimal(351950.80)));

        //a forma clássica pode se tornar complexa conforme os critérios de busca aumentem, e menos performática também
//        for (Produto produto : produtos) {
//            if (produto.getNome().startsWith("C")) {
//                produto.inativar();
//            }
//        }

        /** TODO Usando Streams API

        //Predicate no caso é o parâmetro esperado pela operação intermediária de filter, especificamos o critério da busca
        Predicate<Produto> produtoPredicate = p -> p.getNome().startsWith("C");
        Consumer<Produto> produtoConsumer = p -> p.inativar();

        //este stream contém apenas os produtos que começam pela letra C
        Stream<Produto> produtosStream = produtos.stream().filter(produtoPredicate);

        //vou inativar pelo stream filtrado acima, passando a ação através do Consumer
        produtosStream.forEach(produtoConsumer);

        //agora é hora de abreviar, após a explicação acima, no lugar de declarar o Consumer separadamente, vou adicionar o Lambda no argumento
        produtosStream.forEach(p -> p.inativar());
        //melhorando ainda mais, substituo por Method Reference, já que se trata apenas de uma chamada e não há bloco
        produtosStream.forEach(Produto::inativar);
        */

        //o mesmo se aplica com o Predicate acima, posso passar o Lambda diretamente de argumento no lugar de declará-lo separadamente e juntar o forEach na chamada
        produtos.stream()
                .filter(p -> p.getNome().startsWith("C"))
                .forEach(Produto::inativar);
    }




}
