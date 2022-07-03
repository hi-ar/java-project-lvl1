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
    private static String playerName;

    static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scan = new Scanner(System.in);
        String scanPlayerName = scan.nextLine();
        setPlayerName(scanPlayerName);
        System.out.println("Hello, " + getPlayerName() + "!");
    }

    static void setPlayerName(String newPlayerName) {
        playerName = newPlayerName;
    }

    static String getPlayerName() {
        return playerName;
    }

    public static void gameStart(int numOfGame, String rules) {
        System.out.println("Your choice: " + numOfGame + "\n"
                + "Welcome to the Brain Games!\n"
                + "May I have your name?");
        Scanner scan = new Scanner(System.in);
        String scanPlayerName = scan.nextLine();
        setPlayerName(scanPlayerName);
        System.out.println("Hello, " + getPlayerName() + "!\n"
                + rules);
        if (numOfGame != App.PRIME) {
            for (int round = 1; round <= NUM_OF_ROUNDS; round++) {
                String[] tempArr = outputATask(numOfGame).clone();
                System.out.println(tempArr[0]); //print a task
                int scanPlayerAnsw = scan.nextInt();
                setNumbers(scanPlayerAnsw, Integer.parseInt(tempArr[1]));
                if (getNumbers()[0] == getNumbers()[1]) {
                    correct();
                } else {
                    loseGame();
                    break;
                }
                if (round == NUM_OF_ROUNDS) {
                    congrats();
                }
            }
        } else { // if game with yes/no answers (Even, Prime etc)
            for (int round = 1; round <= NUM_OF_ROUNDS; round++) {
                String[] tempArr = outputATask(numOfGame).clone();
                System.out.println(tempArr[0]); //print a task
                String scanPlayerAnsw = scan.nextLine();
                if (scanPlayerAnsw.equals(tempArr[1])) {
                    System.out.println("Your answer: " + playerAnsw + "\nCorrect!");
                } else {
                    System.out.println("Your answer: " + playerAnsw + "\n"
                            + "'" + playerAnsw + "' is wrong answer ;(. Correct answer was '" + tempArr[1] + "'\n"
                            + "Let's try again, " + getPlayerName() + "!");
                    break;
                }
                if (round == NUM_OF_ROUNDS) {
                    congrats();
                }
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


    private static int playerAnsw;
    private static int correctAnsw;

    public static void setNumbers(int newPlayerAnsw, int newCorrectAnsw) {
        playerAnsw = newPlayerAnsw;
        correctAnsw = newCorrectAnsw;
    }

    static int[] getNumbers() {  //publ
        return new int[]{playerAnsw, correctAnsw};
    }

    public static void correct() {
        System.out.println("Your answer: " + getNumbers()[0] + "\nCorrect!");
    }

    public static void loseGame() {
        System.out.println("Your answer: " + getNumbers()[0] + "\n"
                + "'" + getNumbers()[0] + "' is wrong answer ;(. Correct answer was '" + getNumbers()[1] + "'\n"
                + "Let's try again, " + getPlayerName() + "!");
    }

    public static void congrats() {
        System.out.println("Congratulations, " + getPlayerName() + "!");
    }
}
/*С введением второй игры у вас появляется общая для всех игр логика
(Эту логику стоит поместить в файл src/main/java/hexlet/code/Engine.java).
Главная задача этого шага – построить архитектуру запуска игр так, чтобы эта логика
 была в одном месте и управляла играми
 */
