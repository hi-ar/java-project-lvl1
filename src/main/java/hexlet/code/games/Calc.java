package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class Calc {
    public static void app() {
        Engine.gameStart(App.CALC, "What is the result of the expression?");
    }

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
}
