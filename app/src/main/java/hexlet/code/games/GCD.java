package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void app() {
        Engine.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        int correctAnsw = 0;
        while (correctAnsw < 3) {
            int a = (int) (Math.random() * 101);
            int b = (int) (Math.random() * 101);
            System.out.println("Question: " + a + " " + b);
            if (Engine.gcdIsCorrect(a, b)) {
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
}