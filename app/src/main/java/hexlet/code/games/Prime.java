package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static void app() {
        Engine.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int correctAnsw = 0;
        while (correctAnsw < 3) {
            int num = (int) (Math.random() * 201);
            System.out.println("Question: " + num);
            Scanner scan = new Scanner(System.in);
            String playerAnsw = scan.nextLine();
            if ((isPrime(num) && playerAnsw.equals("yes")) || (!isPrime(num) && playerAnsw.equals("no"))) {
                System.out.println("Your answer: " + playerAnsw);
                System.out.println("Correct!");
                correctAnsw++;
            } else {
                System.out.println("Your answer: " + playerAnsw);
                String corAnswWas = isPrime(num) ? "yes" : "no";
                System.out.println("'" + playerAnsw + "' is wrong answer ;(. Correct answer was '" + corAnswWas + "'");
                System.out.println("Let's try again, " + Engine.getPlayerName() + "!");
                break;
            }
        }
        if(correctAnsw == 3) {
            Engine.congrats();
        }
    }
    static boolean isPrime (int num) {
        int[] arrPrime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
                97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197,
                199};
        for (int numPrime : arrPrime) {
            if (num == numPrime) {
                return true;
            }
        }
        return false;
    }
}