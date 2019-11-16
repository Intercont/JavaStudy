package solid.acoplamento;

import java.util.List;

/**
 * Acoplamento nem sempre é uma boa idéia, por isso usamos Interfaces que se tornam ESTÁVEIS quando não são mais alterados,
 * pois se forem alterados, impactarão em todas as classes que o implementam. Ao acoplar com uma interface estável no lugar de classes diretamente,
 * eliminamos o problema de alteração de comportamento pois a interface estável NÃO É MAIS ALTERADA. Veja por exemplo a interface List ou
 * Desta forma, no lugar de acoplarmos diversas classes diretamente na classe {@link GeradorDeNotaFiscal}, podendo afetar o
 * comportamento desta, criamos interfaces são implementados por estas classes, e usamos em nossa classe a Interface no lugar
 * das classes diretamente
 */
public class GeradorDeNotaFiscal {

//    private final EnviadorDeEmail email;
//    private final NotaFiscalDao dao;
    
    private List<AcaoAposGerarNota> acoes;

    // SUBSTITUIMOS TODOS ESTES ACOPLAMENTOS DIRETAMENTE NA CLASSE POR UMA INTERFACE
    
//    public GeradorDeNotaFiscal(EnviadorDeEmail email, NotaFiscalDao dao) { POR
    public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
//        this.email = email;
//        this.dao = dao;

        this.acoes = acoes;
    }

    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

//        email.enviaEmail(nf);
//        dao.persiste(nf); POR

        for (AcaoAposGerarNota acao :
                acoes) {
            acao.executa(nf);
        }

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}