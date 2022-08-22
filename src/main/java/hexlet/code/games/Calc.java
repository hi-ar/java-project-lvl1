package hexlet.code.games;

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

            gameData[round][0] = "Question: " + a + " " + OPERATOR_CHARS[operation] + " " + b;
            gameData[round][1] = Integer.toString(calculate(operation, a, b));
        }

        Engine.run(QUESTION, gameData);
    }

    private static int calculate(int operation, int a, int b) throws RuntimeException {
        switch (operation) {
            case PLUS:
                return a + b;
            case MINUS:
                return a - b;
            case MULTIPLY:
                return a * b;
            default:
                throw new RuntimeException("no logic defined for division");
        }
    }
}
