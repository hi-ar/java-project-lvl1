package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner scan = new Scanner(System.in);
        System.out.println("May I have your name?");
        String playerName = scan.nextLine();
        System.out.println("Hello, " + playerName);
    }
}
