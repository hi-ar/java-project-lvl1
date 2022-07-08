package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    static final String QUESTION = "Find the greatest common divisor of given numbers.";

    public static void app() {
        String[] result = new String[Engine.GAME_DATA_LENGTH];
        result[0] = Integer.toString(App.GCD_NUM);
        result[1] = QUESTION;
        for (int i = 1; i <= Engine.NUM_OF_ROUNDS; i++) {
            int a = Utils.getRandomNum(Engine.BIG_OPERAND_RANGE);
            int b = Utils.getRandomNum(Engine.BIG_OPERAND_RANGE);
            result[i * 2] = "Question: " + a + " " + b; // indexes 2, 4, 6
            int large = Math.max(a, b);
            int small = large == a ? b : a;
            for (int gcd = small; gcd >= 1; gcd--) {
                if (large % gcd == 0 && small % gcd == 0) {
                    result[i * 2 + 1] = Integer.toString(gcd); // indexes 3, 5, 7
                    break;
                }
            }
        }
        Engine.run(result);
    }
}
