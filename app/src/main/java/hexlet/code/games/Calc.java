package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void app() {
        Engine.greeting();
        System.out.println("What is the result of the expression?");
        int correctAnsw = 0;
        while (correctAnsw < 3) {
            int a = (int) (1 + Math.random() * 11);
            int b = (int) (1 + Math.random() * 11);
            int operation = (int) (Math.random() * 3);
            switch (operation) {
                case 0 : System.out.println("Question: " + a + " + " + b); break;
                case 1 : System.out.println("Question: " + a + " - " + b); break;
                default: System.out.println("Question: " + a + " * " + b); break;
            }
            if (Engine.calcIsCorrect(a, b, operation)) {
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
