package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qteNumNegativos = 0;

        //entrada da quantidade de elementos
        int tamanhoArray = scanner.nextInt();
        int[] valoresArray = new int[tamanhoArray];

        //entrada dos elementos
        for (int i = 0; i < tamanhoArray; i++) {
            valoresArray[i] = scanner.nextInt();
        }


        //calculo dos valores
        for (int j = 0; j < tamanhoArray; j++) {

            int somatorio = 0;

            for (int i = j, z = j + 1; i < tamanhoArray; i = i + 2, z = z + 2) {

//                int maiorIdx = tamanhoArray - 1; //maior indice
//                Arrays.

                if (z >= tamanhoArray && i < tamanhoArray) {
                    somatorio = somatorio + valoresArray[i];
                } else {
                    somatorio = somatorio + valoresArray[i] + valoresArray[z];
                }

                if (somatorio < 0) {
                    qteNumNegativos++;

                }
            }

        }

        System.out.println(qteNumNegativos);

        /*
        tamanho = 7
        0 ao 6
        int[] array = {2,3,4,5,6,7,8}
        leitura 1
        2,3
        2,3,4
        2,3,4,5
        2,3,4,5,6
        2,3,4,5,6,7
        2,3,4,5,6,7,8

        leitura 2
        3,4
         */

    }

}
