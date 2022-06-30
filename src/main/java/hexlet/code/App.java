package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.*;

class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "3 - Calc\n" +
                "4 - GCD\n" +
                "5 - Progression\n" +
                "6 - Prime\n" +
                "0 - Exit");
        int gameNum = scan.nextInt();

        switch (gameNum) {
            case 1:
                Cli.greeting();
                break;
            case 2:
                Even.start();
                break;
            case 3:
                Calc.app();
                break;
            case 4:
                GCD.app();
                break;
            case 5:
                Progression.app();
                break;
            case 6:
                Prime.app();
                break;
            default:
                break;
        }
        scan.close();
    }
}