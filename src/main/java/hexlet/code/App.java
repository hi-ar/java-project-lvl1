package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD_NUM = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        int gameNum = scan.nextInt();

        System.out.println("Your choice: " + gameNum);

        switch (gameNum) {
            case GREET:
                Cli.greeting();
                break;
            case EVEN:
                Even.runGame();
                break;
            case CALC:
                Calc.runGame();
                break;
            case GCD_NUM:
                GCD.runGame();
                break;
            case PROGRESSION:
                Progression.runGame();
                break;
            case PRIME:
                Prime.runGame();
                break;
            case 0:
                break;
            default:
                System.out.println("Wrong number");
        }
        scan.close();
    }
}
