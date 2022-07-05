package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {

    public static final int NUM_OF_ROUNDS = 3;
    public static final int OPERAND_RANGE = 11; // for multiplying
    public static final int BIG_OPERAND_RANGE = 101;
    public static final int OPERATOR_RANGE = 3; // + - *

    public static void run(int numOfGame, String rules) {
        System.out.println("Your choice: " + numOfGame + "\n"
                + "Welcome to the Brain Games!\n"
                + "May I have your name?");
        Scanner scan = new Scanner(System.in);
        String playerName = scan.nextLine();
        System.out.println("Hello, " + playerName + "!\n"
                + rules);

        for (int round = 1; round <= NUM_OF_ROUNDS; round++) {
            String[] tempArr = outputATask(numOfGame).clone(); //make clone qws and relevant ans (random gen-ed)
            System.out.println(tempArr[0]); //print a task
            String playerAnsw = scan.nextLine();
            if (playerAnsw.equals(tempArr[1])) {
                System.out.println("Your answer: " + playerAnsw + "\nCorrect!");
            } else {
                System.out.println("Your answer: " + playerAnsw + "\n"
                        + "'" + playerAnsw + "' is wrong answer ;(. Correct answer was '" + tempArr[1] + "'\n"
                        + "Let's try again, " + playerName + "!");
                break;
            }
            if (round == NUM_OF_ROUNDS) {
                System.out.println("Congratulations, " + playerName + "!");
            }
        }
    }

    static String[] outputATask(int numOfGame) {
        switch (numOfGame) {
            case App.CALC:
                return Calc.task();
            case App.GCD_NUM:
                return GCD.task();
            case App.PROGRESSION:
                return Progression.task();
            case App.PRIME:
                return Prime.task();
            default:
                return null;
        }
    }
}
/*С введением второй игры у вас появляется общая для всех игр логика
(Эту логику стоит поместить в файл src/main/java/hexlet/code/Engine.java).
Главная задача этого шага – построить архитектуру запуска игр так, чтобы эта логика
 была в одном месте и управляла играми
 */
