package testes;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class HashMapEnumMap {

    public static void main(String[] args) {
        Map<TipoTransferenciaCartaoContaEnum, TipoOperacaoEnum> mapa = new HashMap<>();
        Map<TipoTransferenciaCartaoContaEnum, TipoOperacaoEnum> enummap = new EnumMap<>(TipoTransferenciaCartaoContaEnum.class);


        mapa.put(TipoTransferenciaCartaoContaEnum.CARTAO_PARA_CONTA, TipoOperacaoEnum.CARTAO_TO_CONTA);
        mapa.put(TipoTransferenciaCartaoContaEnum.CONTA_PARA_CARTAO, TipoOperacaoEnum.CONTA_TO_CARTAO);

        enummap.put(TipoTransferenciaCartaoContaEnum.CARTAO_PARA_CONTA, TipoOperacaoEnum.CARTAO_TO_CONTA);
        enummap.put(TipoTransferenciaCartaoContaEnum.CONTA_PARA_CARTAO, TipoOperacaoEnum.CONTA_TO_CARTAO);

        System.out.println(mapa.get(TipoTransferenciaCartaoContaEnum.CARTAO_PARA_CONTA));
        System.out.println(enummap.get(TipoTransferenciaCartaoContaEnum.CARTAO_PARA_CONTA));

        System.out.println(mapa.get(TipoTransferenciaCartaoContaEnum.CONTA_PARA_CARTAO));
        System.out.println(enummap.get(TipoTransferenciaCartaoContaEnum.CONTA_PARA_CARTAO));
    }
}
