package solid.singleresponsibilityprinciple;

public class CalculadoraDeSalario {

    public double calcula(Funcionario funcionario) {

        //SUBSTITUINDO ISTO TUDO
//        if (DESENVOLVEDOR.equals(funcionario.getCargo())) {
//            return new DezOuVintePorCento().calcula(funcionario);
//        }
//
//        if (DBA.equals(funcionario.getCargo()) || TESTER.equals(funcionario.getCargo())) {
//            return new QuinzeOuVinteECincoPorCento().calcula(funcionario);
//        }
//        throw new RuntimeException("funcionario invalido");

        //POR ISTO
//        return funcionario.getCargo().getRegra().calcula(funcionario);
        return funcionario.calculaSalario();


    }




}

