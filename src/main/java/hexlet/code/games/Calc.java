package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    public static void app() {
        System.out.println("Your choice: 3");
        Engine.greeting();
        System.out.println("What is the result of the expression?");
        int correctAnsw = 0;
        while (correctAnsw < Engine.NUM_OF_ROUNDS) {
            int a = (int) (1 + Math.random() * Engine.OPERAND_RANGE);
            int b = (int) (1 + Math.random() * Engine.OPERAND_RANGE);
            int operation = (int) (Math.random() * Engine.OPERATOR_RANGE);
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
        if (correctAnsw == Engine.NUM_OF_ROUNDS) {
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
