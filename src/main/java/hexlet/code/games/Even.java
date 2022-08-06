package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int BIG_OPERAND_RANGE = 101;
    private static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void app() {
        String[][] gameData = new String[Engine.NUM_OF_ROUNDS][2];

        for (int round = 0; round < Engine.NUM_OF_ROUNDS; round++) {
            int a = Utils.getRandomNum(BIG_OPERAND_RANGE);
            gameData[round][0] = "Question: " + a;
            gameData[round][1] = a % 2 == 0 ? "yes" : "no";
        }
        Engine.run(App.EVEN, QUESTION, gameData);
    }
}
