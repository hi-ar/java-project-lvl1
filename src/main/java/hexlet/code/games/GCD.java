package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {
    public static void app() {
        System.out.println("Your choice: 4!");
        Engine.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        int correctAnsw = 0;
        while (correctAnsw < Engine.NUM_OF_ROUNDS) {
            int a = (int) (1 + Math.random() * Engine.BIG_OPERAND_RANGE);
            int b = (int) (1 + Math.random() * Engine.BIG_OPERAND_RANGE);
            System.out.println("Question: " + a + " " + b);
            if (gcdIsCorrect(a, b)) {
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
    static boolean gcdIsCorrect(int a, int b) {
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
        Engine.setNumbers(playerAnsw, correctAnsw);
        return playerAnsw == correctAnsw;
    }
}
