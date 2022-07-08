package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    static final int PLUS = 0;
    static final int MINUS = 1;
    static final int MULTIPLY = 2;
    static final String QUESTION = "What is the result of the expression?";

    public static void app() {
        String[] result = new String[Engine.GAME_DATA_LENGTH];
        result[0] = Integer.toString(App.CALC);
        result[1] = QUESTION;

        for (int i = 1; i <= Engine.NUM_OF_ROUNDS; i++) {
            int a = Utils.getRandomNum(Engine.OPERAND_RANGE);
            int b = Utils.getRandomNum(Engine.OPERAND_RANGE);
            int operation = Utils.getRandomNum(0, Engine.OPERATOR_RANGE);
            switch (operation) {
                case PLUS:
                    result[i * 2] = "Question: " + a + " + " + b;   // 2, 4, 6
                    result[i * 2 + 1] = Integer.toString(a + b);    // 3, 5, 7
                    break;
                case MINUS:
                    result[i * 2] = "Question: " + a + " - " + b;
                    result[i * 2 + 1] = Integer.toString(a - b);
                    break;
                case MULTIPLY:
                    result[i * 2] = "Question: " + a + " * " + b;
                    result[i * 2 + 1] = Integer.toString(a * b);
                    break;
                default:
                    result[i * 2] = "The Ultimate Question of Life, the Universe, and Everything";
                    result[i * 2 + 1] = "42";
                    break;
            }
        }
        Engine.run(result);
    }
}
