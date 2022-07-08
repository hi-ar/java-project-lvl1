package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int GAME_DATA_LENGTH = 8; // num of game, question, 3 pairs: task-answer
    public static final int NUM_OF_ROUNDS = 3;
    public static final int OPERAND_RANGE = 11; // for multiplying
    public static final int BIG_OPERAND_RANGE = 101;
    public static final int OPERATOR_RANGE = 3; // + - *

    public static void run(String[] dataFromGame) {
        System.out.println("Your choice: " + dataFromGame[0] + "\n"
                + "Welcome to the Brain Games!\n"
                + "May I have your name?");
        Scanner scan = new Scanner(System.in);
        String playerName = scan.nextLine();
        System.out.println("Hello, " + playerName + "!\n"
                + dataFromGame[1]);

        for (int round = 1; round <= NUM_OF_ROUNDS; round++) {
            System.out.println(dataFromGame[round * 2]); //print a task
            String playerAnsw = scan.nextLine();
            if (playerAnsw.equals(dataFromGame[round * 2 + 1])) {
                System.out.println("Your answer: " + playerAnsw + "\nCorrect!");
            } else {
                System.out.println("Your answer: " + playerAnsw + "\n"
                        + "'" + playerAnsw + "' is wrong answer ;(. Correct answer was '" + dataFromGame[round * 2 + 1]
                        + "'\n"
                        + "Let's try again, " + playerName + "!");
                break;
            }
            if (round == NUM_OF_ROUNDS) {
                System.out.println("Congratulations, " + playerName + "!");
            }
        }
        scan.close();
    }
}
/*С введением второй игры у вас появляется общая для всех игр логика
(Эту логику стоит поместить в файл src/main/java/hexlet/code/Engine.java).
Главная задача этого шага – построить архитектуру запуска игр так, чтобы эта логика
 была в одном месте и управляла играми
 */
