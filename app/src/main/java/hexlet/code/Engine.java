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

    public static String playerName;

    static void setPlayerName (String newPlayerName){
        playerName = newPlayerName;
    }

    public static String getPlayerName () {
        return playerName;
    }

    public static boolean isCorrect(int a, int b, int operation) {
        printExpression(a, b, operation);
        Scanner scan = new Scanner(System.in);
        int playerAnsw = scan.nextInt();
        switch (operation) {
            case 0 : setNumbers(playerAnsw, a + b); return playerAnsw == (a + b);
            case 1 : setNumbers(playerAnsw, a - b); return playerAnsw == (a - b);
            default : setNumbers(playerAnsw, a * b); return playerAnsw == (a * b);
        }
    }
    static void printExpression(int a, int b, int operation) {
        switch (operation) {
            case 0 : System.out.println("Question: " + a + " + " + b); break;
            case 1 : System.out.println("Question: " + a + " - " + b); break;
            default: System.out.println("Question: " + a + " * " + b); break;
        }
    }
    public static int playerAnsw;
    public static int correctAnsw;
    static void setNumbers(int newPlayerAnsw, int newCorrectAnsw){
        playerAnsw = newPlayerAnsw;
        correctAnsw = newCorrectAnsw;
    }

    public static int[] getNumbers(){
        return new int[] {playerAnsw, correctAnsw};
    }
}
/*С введением второй игры у вас появляется общая для всех игр логика
(Эту логику стоит поместить в файл src/main/java/hexlet/code/Engine.java).
Главная задача этого шага – построить архитектуру запуска игр так, чтобы эта логика
 была в одном месте и управляла играми
 */
