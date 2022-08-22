package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int BIG_OPERAND_RANGE = 101;

    public static void app() {
        String[][] gameData = new String[Engine.NUM_OF_ROUNDS][2];

        for (int round = 0; round < Engine.NUM_OF_ROUNDS; round++) {
            int num = Utils.getRandomNum(BIG_OPERAND_RANGE * 2);
            gameData[round][0] = "Question: " + num;
            gameData[round][1] = isPrime(num) ? "yes" : "no";
        }
        Engine.run(QUESTION, gameData);
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
