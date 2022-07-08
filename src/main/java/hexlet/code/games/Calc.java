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
            int operation = Utils.getRandomNum(0, Engine.OPERATOR_RANGE); // = - *
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
                    result[i * 2] = "Wrong operation number, available 0-2";
                    result[i * 2 + 1] = "shit happens";
                    break;
            }
        }
        Engine.run(result);
    }

/*
    public static String[] task() {
        int a = (int) (1 + Math.random() * Engine.OPERAND_RANGE);
        int b = (int) (1 + Math.random() * Engine.OPERAND_RANGE);
        int operation = (int) (Math.random() * Engine.OPERATOR_RANGE);
        String[] result = new String[2];

        switch (operation) {
            case 0:
                result[0] = "Question: " + a + " + " + b;
                result[1] = Integer.toString(a + b);
                break;
            case 1:
                result[0] = "Question: " + a + " - " + b;
                result[1] = Integer.toString(a - b);
                break;
            default:
                result[0] = "Question: " + a + " * " + b;
                result[1] = Integer.toString(a * b);
                break;
        }
        return result;
    }

 */
}
