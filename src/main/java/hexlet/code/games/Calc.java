package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int PLUS = 0;
    private static final int MINUS = 1;
    private static final int MULTIPLY = 2;
    private static final String[] OPERATOR_CHARS = {"+", "-", "*"};
    private static final int OPERAND_RANGE = 11; // for multiplying
    private static final String QUESTION = "What is the result of the expression?";

    public static void app() {
        String[][] gameData = new String[Engine.NUM_OF_ROUNDS][2];

        for (int round = 0; round < Engine.NUM_OF_ROUNDS; round++) {
            int a = Utils.getRandomNum(OPERAND_RANGE);
            int b = Utils.getRandomNum(OPERAND_RANGE);
            int operation = Utils.getRandomNum(OPERATOR_CHARS.length);
            if (operation >= OPERATOR_CHARS.length) {
                System.out.println("for operator number " + operation + " logic doesn't defined");
                return;
            }
            gameData[round][0] = calculateQA(operation, a, b)[0];
            gameData[round][1] = calculateQA(operation, a, b)[1];
        }

        Engine.run(App.CALC, QUESTION, gameData);
    }

    private static String[] calculateQA(int operation, int a, int b) {
        String[] result = new String[2];
        result[0] = "Question: " + a + " " + OPERATOR_CHARS[operation] + " " + b;
        switch (operation) {
            case PLUS:
                result[1] = Integer.toString(a + b);
                break;
            case MINUS:
                result[1] = Integer.toString(a - b);
                break;
            case MULTIPLY:
                result[1] = Integer.toString(a * b);
                break;
            default: // linter order
                break;
        }
        return result;
    }
}
