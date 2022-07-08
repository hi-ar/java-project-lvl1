package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.StringJoiner;

public class Progression {
    static final int SEQUENCE_LENGTH = 10;
    static final String QUESTION = "What number is missing in the progression?";

    public static void app() {
        String[] result = new String[Engine.GAME_DATA_LENGTH];
        result[0] = Integer.toString(App.PROGRESSION);
        result[1] = QUESTION;
        for (int i = 1; i <= Engine.NUM_OF_ROUNDS; i++) {
            int first = Utils.getRandomNum(0, Engine.OPERAND_RANGE * 2); // first num in list 0-22
            int step = Utils.getRandomNum(Engine.OPERAND_RANGE * 2); // step 1-22
            int hidden = Utils.getRandomNum(0, SEQUENCE_LENGTH); // hidden elem 0-9
            var numString = new StringJoiner(" ");
            for (int j = 0; j < SEQUENCE_LENGTH; j++) {
                if (j == hidden) {
                    result[i * 2 + 1] = Integer.toString(first + step * j); //correct answer
                    numString.add("..");
                } else {
                    numString.add(Integer.toString(first + step * j));
                }
            }
            result[i * 2] = "Question: " + numString;
        }
        Engine.run(result);
    }
}
