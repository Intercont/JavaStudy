package solid.singleresponsibilityprinciple;

/**
 * SOLID
 * S de Single Responsibility Principle - Classes Coesas, são esponsáveis por apenas uma regra
 * Ambas classes criadas tem em comum que recebem um funcionário e retornam um double
 * então ambas são Regras de Cálculo
 * Vamos criar uma interface para a Regra de Cálculo
 */
public class QuinzeOuVinteECincoPorCento implements RegraDeCalculo {

    public double calcula(Funcionario funcionario) {
        if (funcionario.getSalarioBase() > 2000.0) {
            return funcionario.getSalarioBase() * 0.75;
        } else {
            return funcionario.getSalarioBase() * 0.85;
        }
    }
}
