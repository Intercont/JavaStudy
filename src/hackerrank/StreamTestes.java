package hackerrank;

public class StreamTestes {
    public static void main(String[] args) {

        Input input = new Input();
        input.setFlexForced(false);
        input.setRegime(null);
        input.setFirstFactor(null);
        input.setSecondFactor(null);


        if (input.getFlexForced()) {
            System.out.println("Flex Forced True");
        } else {
            //SE O FLEX FORCED ESTIVER FALSE, E OS 3 CAMPOS FOREM NULL, ESTÁ OK, PORÉM SE UM DOS 3 CAMPOS DE FLEX ESTIVEREM PREENCHIDOS, OS DEMAIS SERÃO OBRIGATÓRIOS
            if ((input.getRegime() != null || input.getFirstFactor() != null || input.getSecondFactor() != null) &&
                    (input.getRegime() == null || input.getFirstFactor() == null || input.getSecondFactor() == null)) {
                    System.out.println("Exception");
            }

        }
    }
}
