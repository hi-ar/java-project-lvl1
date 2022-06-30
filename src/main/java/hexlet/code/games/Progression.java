package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.StringJoiner;

public class Progression {
    public static void app() {
        System.out.println("Your choice: 5");
        Engine.greeting();
        System.out.println("What number is missing in the progression?");
        int correctAnsw = 0;
        while (correctAnsw < 3) {
            int first = (int) (Math.random() * 21); // first num in list 0-20
            int step = (int) (1 + Math.random() * 21); // step 1-20
            int hidden = (int) (Math.random() * 10); // hide №... 0-9
            int hiddenNum = 0; // correct answer
            var numString = new StringJoiner(" ");
            for (int i = 0; i < 10; i++) {
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
        if (correctAnsw == 3) {
            Engine.congrats();
        }
    }
}