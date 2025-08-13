package hackerrank;

public class RepeatedString {

    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10L));
        System.out.println(repeatedString("a", 1000000000000L));
    }

    public static long repeatedString(String s, long n) {
        // Write your code here
        long countA = 0;
        StringBuilder fullString = new StringBuilder();

        for (char value : s.toCharArray()) {
            if (value == 'a') {
                countA++;
            }
        }

        long fullRepeats = n / s.length();
        long remainder = n % s.length();

        long totalA = countA * fullRepeats;

        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') totalA++;
        }

        return totalA;

    }
}
