package hackerrank;

import java.util.List;

public class JumpingOnTheClouds {

    public static void main(String[] args) {

        System.out.println(jumpingOnClouds(List.of(0, 0, 1, 0, 0, 1, 0)));
        System.out.println(jumpingOnClouds(List.of(0, 0, 0, 1, 0, 0)));
    }

    public static int jumpingOnClouds(List<Integer> clouds) {
        int zerosFound = 0, jumps = 0;

        for (Integer cloud : clouds) {
            if (cloud == 0) {
                zerosFound++;
            } else {
                jumps++;
                zerosFound = 0;
            }

            if (zerosFound == 2) {
                jumps++;
                zerosFound = 0;
            }
        }

        return jumps;
    }
}
