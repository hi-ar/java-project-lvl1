package hexlet.code.games;

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
            gameData[round][0] = getSequenceQA(first, step, hidden)[0];
            gameData[round][1] = getSequenceQA(first, step, hidden)[1];
        }
        Engine.run(QUESTION, gameData);
    }

    private static String[] getSequenceQA(int first, int step, int hidden) {

        int[] arrSequence = new int[SEQUENCE_LENGTH];
        for (int i = 0; i < SEQUENCE_LENGTH; i++) {
            arrSequence[i] = i * step + first;
        }

        var sequence = new StringJoiner(" ");
        for (int i = 0; i < SEQUENCE_LENGTH; i++) {
            sequence.add(i == hidden ? ".." : Integer.toString(arrSequence[i]));
        }

        String[] sequenceQA = new String[2];
        sequenceQA[0] = "Question: " + sequence;
        sequenceQA[1] = Integer.toString(arrSequence[hidden]);

        return sequenceQA;
    }
}
