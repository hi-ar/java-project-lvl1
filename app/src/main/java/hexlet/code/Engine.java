package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void greeting() {
        Scanner scan = new Scanner(System.in);
        System.out.println("May I have your name?");
        String playerName = scan.nextLine();
        setPlayerName(playerName);
        System.out.println("Hello, " + getPlayerName());
    }

    static String playerName; //publ

    static void setPlayerName (String newPlayerName){
        playerName = newPlayerName;
    }

    public static String getPlayerName () {
        return playerName;
    }

    public static boolean calcIsCorrect(int a, int b, int operation) {
        Scanner scan = new Scanner(System.in);
        int playerAnsw = scan.nextInt();
        switch (operation) {
            case 0 : setNumbers(playerAnsw, a + b); return playerAnsw == (a + b);
            case 1 : setNumbers(playerAnsw, a - b); return playerAnsw == (a - b);
            default : setNumbers(playerAnsw, a * b); return playerAnsw == (a * b);
        }
    }
    public static boolean gcdIsCorrect(int a, int b) {
        int correctAnsw = 1;
        int large = Math.max(a, b);
        int small = large == a ? b : a;
        for (int i = small; i >= 1; i--) {
            if (large % i == 0 && small % i == 0) {
                correctAnsw = i;
                break;
            }
        }
        Scanner scan = new Scanner(System.in);
        int playerAnsw = scan.nextInt();
        setNumbers(playerAnsw, correctAnsw);
        return playerAnsw == correctAnsw;
    }
    static int playerAnsw;  //publ
    static int correctAnsw;  //publ
    static void setNumbers(int newPlayerAnsw, int newCorrectAnsw){
        playerAnsw = newPlayerAnsw;
        correctAnsw = newCorrectAnsw;
    }

    static int[] getNumbers() {  //publ
        return new int[] {playerAnsw, correctAnsw};
    }

    public static void nextTask() {
        System.out.println("Your answer: " + getNumbers()[0]);
        System.out.println("Correct!");
    }

    public static void loseGame() {
        System.out.println("Your answer: " + getNumbers()[0]);
        System.out.println("'" + getNumbers()[0] + "' is wrong answer ;(. Correct answer was '" + getNumbers()[1] + "'");
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
