package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import java.util.StringJoiner;

public class Progression {
    private static final int HIDDEN_LOCATION_RANGE = 10;
    private static final int SEQUENCE_LENGTH = 10;

    public static void app() {
        Engine.run(App.PROGRESSION, "What number is missing in the progression?");
    }
    public static String[] task() {
        int first = (int) (Math.random() * Engine.OPERAND_RANGE * 2); // first num in list 0-22
        int step = (int) (1 + Math.random() * Engine.OPERAND_RANGE * 2); // step 1-22
        int hidden = (int) (Math.random() * SEQUENCE_LENGTH); // hidden elem 0-9
        String[] result = new String[2];
        var numString = new StringJoiner(" ");

        for (int i = 0; i < SEQUENCE_LENGTH; i++) {
            if (i == hidden) {
                result[1] =  Integer.toString(first + step * i);
                numString.add("..");
            } else {
                numString.add(Integer.toString(first + step * i));
            }
        }
        result[0] = "Question: " + numString;
        return result;
    }
}
