package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" +
                "Your choice: 1\n" +
                "May I have your name?");

        String playerName = scan.nextLine();
        scan.close();
        System.out.println("Hello, " + playerName + "!");
    }
}
