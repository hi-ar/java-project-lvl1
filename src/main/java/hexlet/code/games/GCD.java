package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class GCD {
    public static void app() {
        Engine.run(App.GCD_NUM, "Find the greatest common divisor of given numbers.");
    }

    public static String[] task() {
        int a = (int) (1 + Math.random() * Engine.BIG_OPERAND_RANGE);
        int b = (int) (1 + Math.random() * Engine.BIG_OPERAND_RANGE);
        String[] result = new String[2];
        result[0] = "Question: " + a + " " + b;

        int large = Math.max(a, b);
        int small = large == a ? b : a;
        for (int i = small; i >= 1; i--) {
            if (large % i == 0 && small % i == 0) {
                result[1] = Integer.toString(i);
                break;
            }
        }
        return result;
    }
}
