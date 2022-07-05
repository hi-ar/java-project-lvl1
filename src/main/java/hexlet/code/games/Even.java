package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    public static void app() {
        int correctAnsw = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Your choice: 2\n"
                + "Welcome to the Brain Games!\n"
                + "May I have your name?");
        String playerName = scan.nextLine();
        System.out.println("Hello, " + playerName + "\n"
                + "Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (correctAnsw < Engine.NUM_OF_ROUNDS) {
            int a = (int) (Math.random() * Engine.BIG_OPERAND_RANGE);
            boolean isEven = a % 2 == 0;
            System.out.println("Question: " + a);
            String playerAnsw = scan.nextLine();
            System.out.println("Your answer is " + playerAnsw);
            if (isEven) {
                if (playerAnsw.equals("yes")) {
                    System.out.println("Correct!");
                    correctAnsw++;
                } else {
                    System.out.println("'" + playerAnsw + "' is wrong answer ;(. Correct answer was 'yes'.\n"
                            + "Let's try again, " + playerName + "!");
                    break;
                }
            } else { //if random odd
                if (playerAnsw.equals("no")) {
                    System.out.println("Correct!");
                    correctAnsw++;
                } else {
                    System.out.println("'" + playerAnsw + "' is wrong answer ;(. Correct answer was 'no'."
                            + "\nLet's try again, " + playerName + "!");
                    break;
                }
            }
        } // end of while
        if (correctAnsw == Engine.NUM_OF_ROUNDS) {
            System.out.println("Congratulations, " + playerName + "!");
        }
    }
}
