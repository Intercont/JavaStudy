package hackerrank;

public class CountingValleys {

    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
        System.out.println(countingValleys(12, "DDUUDDUDUUUD"));

        System.out.println(countingValleysEnhanced(8, "UDDDUDUU"));
        System.out.println(countingValleysEnhanced(12, "DDUUDDUDUUUD"));
    }

    public static int countingValleys(int steps, String path) {
        int currentDirection = 0;
        int nextDirection = 0;
        int valleysCount = 0;

        char[] arr = path.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'D') {
                nextDirection = currentDirection - 1;
            } else {
                nextDirection = currentDirection + 1;
            }

            if (i > 0 && currentDirection < 0 && nextDirection == 0) {
                valleysCount++;

            }
            currentDirection = nextDirection;
        }

        return valleysCount;


    }

    public static int countingValleysEnhanced(int steps, String path) {
            int valleysCount = 0;
            int currentLevel = 0; // Start at sea level

            for (char step : path.toCharArray()) {
                if (step == 'U') {
                    currentLevel++;
                    if (currentLevel == 0) {
                        valleysCount++; // We have exited a valley
                    }
                } else {
                    currentLevel--;
                }
            }

            return valleysCount;
    }
}
