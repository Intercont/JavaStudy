package hackerrank;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class SockMerchant {
    public static void main(String[] args) {
        int n = 9;
        List<Integer> ar = List.of(10, 20, 20, 10, 10, 30, 50, 10, 20);

        System.out.println(sockMerchant(n, ar));
        System.out.println(sockMerchantLessComplexity(n, ar));
    }

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        int pairs = 0;
        Set<Integer> usedIndexes = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) { //too much complexity with two for loops, asked to reduce complexity
                if (!usedIndexes.contains(i) && !usedIndexes.contains(j) && ar.get(i) == ar.get(j)) {
                    ++pairs;
                    usedIndexes.add(i);
                    usedIndexes.add(j);
                    break;
                }
            }
        }
        return pairs;
    }

    public static int sockMerchantLessComplexity(int n, List<Integer> ar) {
        Set<Integer> unpairedSocks = new HashSet<>();
        int pairs = 0;

        for (Integer sockColor : ar) {
            if (!unpairedSocks.add(sockColor)) {
                // If add() returns false, the color was already in the set, forming a pair.
                pairs++;
                unpairedSocks.remove(sockColor);
            }
        }
        return pairs;
    }
}
