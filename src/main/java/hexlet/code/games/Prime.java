package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class Prime {
    public static void app() {
        Engine.run(App.PRIME, "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
    public static String[] task() {
        int num = (int) (Math.random() * Engine.BIG_OPERAND_RANGE * 2);
        String[] result = new String[2];
        result[0] = "Question: " + num;
        if (isPrime(num)) {
            result[1] = "yes";
        } else {
            result[1] = "no";
        }
        return result;
    }

    private static final int[] ARR_PRIME = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61,
        67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179,
        181, 191, 193, 197, 199}; //prime nums in range 0-202 (BIG_OPERAND * 2)

    static boolean isPrime(int num) {
        for (int numPrime : ARR_PRIME) {
            if (num == numPrime) {
                return true;
            }
        }
        return false;
    }
}
