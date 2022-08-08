package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    static final String QUESTION = "Find the greatest common divisor of given numbers.";
    private static final int BIG_OPERAND_RANGE = 101;

    public static void app() {
        String[][] gameData = new String[Engine.NUM_OF_ROUNDS][2];

        for (int round = 0; round < Engine.NUM_OF_ROUNDS; round++) {
            int a = Utils.getRandomNum(1, BIG_OPERAND_RANGE);
            int b = Utils.getRandomNum(1, BIG_OPERAND_RANGE);
            gameData[round][0] = "Question: " + a + " " + b;
            gameData[round][1] = Integer.toString(findGCD(a, b));
        }
        Engine.run(QUESTION, gameData);
    }

    private static int findGCD(int a, int b) {
        int large = Math.max(a, b);
        int small = large == a ? b : a;
        for (int gcd = small; gcd >= 1; gcd--) {
            if (large % gcd == 0 && small % gcd == 0) {
                return gcd;
            }
        }
        return 1;
    }
}
