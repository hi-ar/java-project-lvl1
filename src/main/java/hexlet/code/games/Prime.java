package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void app() {
        String[] result = new String[Engine.GAME_DATA_LENGTH];
        result[0] = Integer.toString(App.PRIME);
        result[1] = QUESTION;
        for (int i = 1; i <= Engine.NUM_OF_ROUNDS; i++) {
            int num = Utils.getRandomNum(Engine.OPERAND_RANGE * 2); //1-202
            result[i * 2] = "Question: " + num;   // 2, 4, 6
            if (isPrime(num)) {
                result[i * 2 + 1] = "yes";    // 3, 5, 7
            } else {
                result[i * 2 + 1] = "no";
            }
        }
        Engine.run(result);
    }

    static final int[] ARR_PRIME = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61,
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
