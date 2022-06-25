package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void app() {
        Engine.greeting();
        System.out.println("What is the result of the expression?");
        int correctAnsw = 0;
        while (correctAnsw < 3) {
            int a = (int) (Math.random() * 11);
            int b = (int) (Math.random() * 11);
            int operation = (int) (Math.random() * 3);
            if (Engine.isCorrect(a, b, operation)) {
                System.out.println("Your answer: " + Engine.getNumbers()[0]);
                System.out.println("Correct!");
                correctAnsw++;
            } else {
                System.out.println("Your answer: " + Engine.getNumbers()[0]);
                System.out.println("'" + Engine.getNumbers()[0] + "' is wrong answer ;(. Correct answer was '" + Engine.getNumbers()[1] + "'");
                System.out.println("Let's try again, " + Engine.getPlayerName() + "!");
                break;
            }
        }
        if (correctAnsw == 3) {
            System.out.println("Congratulations, " + Engine.getPlayerName() + "!");
        }
    }
}
