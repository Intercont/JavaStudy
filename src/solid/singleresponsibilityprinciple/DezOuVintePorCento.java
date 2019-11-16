package solid.singleresponsibilityprinciple;

/**
 * Ambas classes criadas tem em comum que recebem um funcionário e retornam um double
 * então ambas são Regras de Cálculo
 * Vamos criar uma interface para a Regra de Cálculo
 */
public class DezOuVintePorCento implements RegraDeCalculo {

    public double calcula(Funcionario funcionario) {
        if (funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.8;
        } else {
            return funcionario.getSalarioBase() * 0.9;
        }
    }
}
