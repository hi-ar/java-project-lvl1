package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.StringJoiner;

public class Progression {
    static final int SEQUENCE_LENGTH = 10;
    static final int OPERAND_RANGE = 11;
    static final String QUESTION = "What number is missing in the progression?";

    public static void app() {
        String[][] gameData = new String[Engine.NUM_OF_ROUNDS][2];

        for (int round = 0; round < Engine.NUM_OF_ROUNDS; round++) {
            int first = Utils.getRandomNum(OPERAND_RANGE * 2); // first num in list 0-22
            int step = Utils.getRandomNum(1, OPERAND_RANGE * 2); // step 1-22
            int hidden = Utils.getRandomNum(SEQUENCE_LENGTH); // hidden elem 0-9
            gameData[round][0] = getSequence(first, step, hidden)[0];
            gameData[round][1] = getSequence(first, step, hidden)[1];
        }
        Engine.run(App.PROGRESSION, QUESTION, gameData);
    }

    private static String[] getSequence(int first, int step, int hidden) {
        String[] sequenceQA = new String[2];
        var sequence = new StringJoiner(" ");
        for (int j = 0; j < SEQUENCE_LENGTH; j++) {
            if (j == hidden) {
                sequenceQA[1] = Integer.toString(first + step * j); //correct answer
                sequence.add("..");
            } else {
                sequence.add(Integer.toString(first + step * j));
            }
        }
        sequenceQA[0] = "Question: " + sequence;
        return sequenceQA;
    }
}
