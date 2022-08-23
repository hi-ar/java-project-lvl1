package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUM_OF_ROUNDS = 3;

    public static void run(String qwestion, String[][] gameData) {
        System.out.println("Welcome to the Brain Games!\n"
                + "May I have your name?");
        Scanner scan = new Scanner(System.in);
        String playerName = scan.nextLine();
        System.out.println("Hello, " + playerName + "!\n"
                + qwestion);

        for (int round = 0; round < NUM_OF_ROUNDS; round++) {
            System.out.println(gameData[round][0]); //print a task
            String playerAnsw = scan.nextLine();
            if (playerAnsw.equals(gameData[round][1])) {
                System.out.println("Your answer: " + playerAnsw + "\nCorrect!");
            } else {
                System.out.println("Your answer: " + playerAnsw + "\n"
                        + "'" + playerAnsw + "' is wrong answer ;(. Correct answer was '" + gameData[round][1]
                        + "'\n"
                        + "Let's try again, " + playerName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + playerName + "!");
        scan.close();
    }
}
