package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.StringJoiner;

public class Progression {
    private static final int HIDDEN_LOCATION_RANGE = 10;
    private static final int SEQUENCE_LENGTH = 10;
    public static void app() {
        System.out.println("Your choice: 5");
        Engine.greeting();
        System.out.println("What number is missing in the progression?");
        int correctAnsw = 0;
        while (correctAnsw < Engine.NUM_OF_ROUNDS) {
            int first = (int) (Math.random() * Engine.OPERAND_RANGE * 2); // first num in list 0-22
            int step = (int) (1 + Math.random() * Engine.OPERAND_RANGE * 2); // step 1-22
            int hidden = (int) (Math.random() * SEQUENCE_LENGTH); // hidden elem 0-9
            int hiddenNum = 0; // correct answer
            var numString = new StringJoiner(" ");
            for (int i = 0; i < SEQUENCE_LENGTH; i++) {
                if (i == hidden) {
                    hiddenNum = first + step * i;
                    numString.add("..");
                } else {
                    numString.add(Integer.toString(first + step * i));
                }
            }
            System.out.println("Question: " + numString);
            Scanner scan = new Scanner(System.in);
            int playerAnsw = scan.nextInt();
            Engine.setNumbers(playerAnsw, hiddenNum);
            if (hiddenNum == playerAnsw) {
                Engine.nextTask();
                correctAnsw++;
            } else {
                Engine.loseGame();
                break;
            }
        }
        if (correctAnsw == Engine.NUM_OF_ROUNDS) {
            Engine.congrats();
        }
    }
}
