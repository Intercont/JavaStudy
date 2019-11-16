package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * STREAMS
 * Algumas das ferramentas principais básicas usando Streams
 * Streams e Collections não
 */
public class ExemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Java 8", 50));
        cursos.add(new Curso("AWS", 250));
        cursos.add(new Curso("Python", 101));

        cursos.sort(Comparator.comparing(curso -> curso.getAlunos())); //lambda
        cursos.sort(Comparator.comparing(Curso::getAlunos)); //ou method reference

        //imprimir o nome de todos os cursos em ordem
//        cursos.forEach(c -> System.out.println(c.getNome()));

        //FILTER - imprimir os cursos com mais de 100 alunos
//        cursos.stream()
//                .filter(c -> c.getAlunos() >= 100) //filtro os cursos com mais de 100 alunos
//                .forEach(c -> System.out.println(c.getNome()));

        //MAP - dado um stream de curso, quero mapear este Stream para um stream de outra coisa
        //MAP - dado vários cursos, quero uma sequencia de números inteiros que simbolizam a quantidade de alunos desse curso
        cursos.stream()
                .filter(c -> c.getAlunos() >= 100) //filtro os cursos com mais de 100 alunos
                .map(curso -> curso.getAlunos()) //dado um curso, quero o número de alunos deste curso
                .forEach(System.out::println); //sendo assim, o único valor existente neste ponto agora é o que foi mapeado acima

        System.out.println("+");

        //MAP - usando mapToInt ele retorna um IntStream, com o qual podemos realizar operações de inteiro
        int sum = cursos.stream()
                .filter(c -> c.getAlunos() >= 100) //filtro os cursos com mais de 100 alunos
                .mapToInt(curso -> curso.getAlunos()) //dado um curso, quero o número de alunos deste curso
                .sum();

        System.out.println(sum);

        //Como transformar o nosso Stream<Curso> em um Stream<String> contendo apenas os nomes dos cursos?
//        Stream<String> cursosStream = cursos.stream().map(Curso::getNome);

        //FILTER - FINDANY - pegar qualquer um dos cursos com mais de 100 alunos
        Optional<Curso> optionalCursoMaisdeCemAlunos = cursos.stream()
                .filter(curso -> curso.getAlunos() >= 1000)
                .findAny();

        //OPTIONAL
//        Curso curso = optionalCursoMaisdeCemAlunos.get(); //retorna o elemeto, se presente, senão retorna NoSuchElementException
//        Curso curso = optionalCursoMaisdeCemAlunos.orElse(null);//retorna o objeto SE encontrado, senão retornará o especificado em params, neste caso, null
//        optionalCursoMaisdeCemAlunos.ifPresent(curso -> System.out.println(curso.getNome())); //SE presente, ele executa o que for passado em params, neste caso imprime os valores, se não, nada será realizado

        //os dois statements acima também podem ir juntos em um único statement
        //Leia-se:
        cursos.stream() //me de o fluxo de todos seus cursos
                .filter(curso -> curso.getAlunos() >= 100) //filtre quem tem mais de 100
                .findAny() //encontre um deles
                .ifPresent(curso -> System.out.println(curso.getNome())); //SE encontrou um deles, faça isso (em args), SENÃO não faça nada

        //AVERAGE - Média dos numeros
        OptionalDouble media = cursos.stream()
                .filter(c -> c.getAlunos() >= 100) //filtro os cursos com mais de 100 alunos
                .mapToInt(curso -> curso.getAlunos()) //dado um curso, quero o número de alunos deste curso
                .average();

        media.ifPresent(System.out::println);

//        COLLECT e Collectors - obter uma Collection a partir de uma Stream filtrada ou parametrizada
        List<Curso> cursoListFiltrado = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toList());

        System.out.println("COLLECT e Collectors - Lista filtrada e coletada");
        cursoListFiltrado.forEach(c -> System.out.println(c.getNome()));

        //COLLECT e Collectors - toMap
        Map<String, Integer> cursoListMapa = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap( //criando um mapa
                        c -> c.getNome(), //dado um curso (como chave)
                        c -> c.getAlunos() //ele me retorna o numero de alunos
                ));

        System.out.println(cursoListMapa);

        //MAP - forEach diretamente do Map espera um BiConsumer da Chave e Valor, como o Lambda abaixo
        cursos.stream()
                .filter(c -> c.getAlunos() >= 10)
                .collect(Collectors.toMap( //criando um mapa
                        c -> c.getNome(), //dado um curso (como chave)
                        c -> c.getAlunos()))//ele me retorna o numero de alunos
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));

        //PARALLELSTREAM - para executar em paralelo, apenas útil quando temos grandes volumes de dados
        cursos.parallelStream()
                .filter(c -> c.getAlunos() >= 10)
                .collect(Collectors.toMap( //criando um mapa
                        c -> c.getNome(), //dado um curso (como chave)
                        c -> c.getAlunos()))//ele me retorna o numero de alunos
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos, rodando em paralelo com parallelStream"));

    }
}

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }

}
