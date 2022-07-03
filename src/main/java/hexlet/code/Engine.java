package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int NUM_OF_ROUNDS = 3;
    public static final int OPERAND_RANGE = 11; // for multiplying
    public static final int BIG_OPERAND_RANGE = 101;
    public static final int OPERATOR_RANGE = 3; // + - *
    private static String playerName;
    public static void greeting() {
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

    public static String getPlayerName() {
        return playerName;
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

    public static void nextTask() {
        System.out.println("Your answer: " + getNumbers()[0]);
        System.out.println("Correct!");
    }

    public static void loseGame() {
        System.out.println("Your answer: " + getNumbers()[0]);
        System.out.println("'" + getNumbers()[0] + "' is wrong answer ;(. Correct answer was '"
                + getNumbers()[1] + "'");
        System.out.println("Let's try again, " + getPlayerName() + "!");
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
