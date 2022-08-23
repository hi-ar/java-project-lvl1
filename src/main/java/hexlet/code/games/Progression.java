package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.StringJoiner;

public class Progression {
    static final int PROGRESSION_LENGTH_MIN = 5;
    static final int PROGRESSION_LENGTH_MAX = 10;
    static final int OPERAND_RANGE = 11;
    static final String QUESTION = "What number is missing in the progression?";

    public static void app() {
        String[][] gameData = new String[Engine.NUM_OF_ROUNDS][2];

        for (int round = 0; round < Engine.NUM_OF_ROUNDS; round++) {
            int first = Utils.getRandomNum(OPERAND_RANGE * 2); // first num in list 0-22
            int step = Utils.getRandomNum(1, OPERAND_RANGE * 2); // step 1-22
            int progresLength = Utils.getRandomNum(PROGRESSION_LENGTH_MIN, PROGRESSION_LENGTH_MAX);
            int hidden = Utils.getRandomNum(progresLength); // hidden elem
            int[] progression = generateProgression(progresLength, first, step);
            String[] qa = getQA(progression, hidden);
            gameData[round][0] = qa[0]; //question
            gameData[round][1] = qa[1]; //answer
        }
        Engine.run(QUESTION, gameData);
    }

    private static int[] generateProgression (int seqLength, int first, int step){
        int[] progression = new int[seqLength];
        for (int i = 0; i < seqLength; i++) {
            progression[i] = i * step + first;
        }
        return progression;
    }

    private static String[] getQA (int[] progression, int hidden) {
        var sequence = new StringJoiner(" ");
        for (int i = 0; i < progression.length; i++) {
            sequence.add(i == hidden ? ".." : Integer.toString(progression[i]));
        }

        String[] qa = new String[2];
        qa[0] = "Question: " + sequence;
        qa[1] = Integer.toString(progression[hidden]);
        return qa;
    }
}
