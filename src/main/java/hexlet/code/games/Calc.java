package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    public static void app() {
        System.out.println("Your choice: 3");
        Engine.greeting();
        System.out.println("What is the result of the expression?");
        int correctAnsw = 0;
        while (correctAnsw < 3) {
            int a = (int) (1 + Math.random() * 11);
            int b = (int) (1 + Math.random() * 11);
            int operation = (int) (Math.random() * 3);
            switch (operation) {
                case 0:
                    System.out.println("Question: " + a + " + " + b);
                    break;
                case 1:
                    System.out.println("Question: " + a + " - " + b);
                    break;
                default:
                    System.out.println("Question: " + a + " * " + b);
                    break;
            }
            if (calcIsCorrect(a, b, operation)) {
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
    static boolean calcIsCorrect(int a, int b, int operation) {
        Scanner scan = new Scanner(System.in);
        int playerAnsw = scan.nextInt();
        switch (operation) {
            case 0:
                Engine.setNumbers(playerAnsw, a + b);
                return playerAnsw == (a + b);
            case 1:
                Engine.setNumbers(playerAnsw, a - b);
                return playerAnsw == (a - b);
            default:
                Engine.setNumbers(playerAnsw, a * b);
                return playerAnsw == (a * b);
        }
    }
}
