package linkedintests;

/**
 * Recursividade:
 *
 * Primeira execução de main: Chamada pela JVM
 *  - count menor que 3, igual a zero
 *  - count é incrementado a 1
 *  - main é chamado com args null (que não tem efeito nenhum). Se trata de uma chamada RECURSIVA, ele próprio se chamando
 * ->   Segunda execução de main: Chamado pela primeira execução - args null
 *      - count menor que 3, igual a um
 *      - count é incrementado a 2
 *      - main é chamado com args null (que não tem efeito nenhum). Se trata de uma chamada RECURSIVA, ele próprio se chamando
 * ---->    Terceira execução de main: Chamado pela segunda execução - args null
 *          - count menor que 3, igual a dois
 *          - count é incrementado a 3
 *          - main é chamado com args null (que não tem efeito nenhum). Se trata de uma chamada RECURSIVA, ele próprio se chamando
 * -------->    Quarta execução de main: Chamado pela terceira execução - args null
 *              - count igual a 3, cai no else
 *              - else faz return, apenas retorna ao chamador
 *          - Retorna na Terceira chamada, após o main, não há mais nada no if-else, cai no print "Hello World!" e finaliza a execução dessa iteração
 *      - Retorna na Segunda chamada, após o main, não há mais nada no if-else, cai no print "Hello World!" e finaliza a execução dessa iteração
 *  - Retorna na Primeira chamada, após o main, não há mais nada no if-else, cai no print "Hello World!" e finaliza a execução dessa iteração e da aplicação
 */
public class Q37 {
    static int count = 0;
    public static void main(String[] args) {
        if (count < 3) {
            count++;
            main(null);
        } else {
            return;
        }
        System.out.println("Hello World!");
    }
}


