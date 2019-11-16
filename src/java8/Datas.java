package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {

        //data de hoje
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        //DATA específica
        LocalDate olimpiadasJapao = LocalDate.of(2020, Month.JULY, 24);
        //quanto tempo falta para as olimpiadas - na mão
        int anos = olimpiadasJapao.getYear() - hoje.getYear();
        System.out.println("Faltam "+ anos);
        //quanto tempo falta para as olimpiadas - através da classe Period
        Period periodo = Period.between(hoje, olimpiadasJapao);
        System.out.println(periodo);
        System.out.println("Faltam "+ periodo.getYears() + " anos, " + periodo.getMonths() + " meses, " + periodo.getDays() + " dias para as Olimpíadas de Tokyo");

        //acrescentando anos em uma data - o objeto LocalDate é imutável, então ele retornará um novo objeto e não vai alterar o original
        LocalDate olimpiadasDubai = olimpiadasJapao.plusYears(4);
        System.out.println(olimpiadasDubai);

        //Formatadores de Data - DateTimeFormatter
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //se adicionamos horas e minutos neste formatador, não podemos usá-lo com LocalDate, apenas LocalDateTime
        System.out.println(olimpiadasDubai.format(formatador));

        //Data e Hora, Minuto e Segundo - LocalDateTime - INSTANTE no qual acontece algo
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        System.out.println(agora.format(formatadorComHoras));

        //Mês específico de um determinado ano - YearMonth
        YearMonth mes = YearMonth.of(2022, Month.APRIL);
        DateTimeFormatter formatadorMes = DateTimeFormatter.ofPattern("MM/yyyy");
        System.out.println(mes.format(formatadorMes));

        //Hora específica - LocalTime
        LocalTime intervalo = LocalTime.of(15, 30);
        System.out.println(intervalo);

        //todas possuem métodos auxiliares para cálculos com as datas, quem vem antes ou depois, etc.

        //Time Zone - ZonedDateTime - com a região
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);



    }
}
