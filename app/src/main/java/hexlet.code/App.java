package hexlet.code;
import java.util.Scanner;
class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Please enter the game number and press Enter.\n" +
					"1 - Greet\n" +
					"2 - Even\n" +
					"0 - Exit");
			int gameNum = scanner.nextInt();
			switch (gameNum) {
				case 1 : System.out.println("Your choice: 1\nWelcome to the Brain Games!"); Cli.greeting(); break;
				case 2 : System.out.println("Your choice: 2\nWelcome to the Brain Games!"); Even.start(); break;
				case 0 : break;
				default: continue;
			}
			//System.out.println("Welcome to the Brain Games!");
			//Cli.greeting();
		}
	}
}
/* Please enter the game number and press Enter.
1 - Greet
2 - Even
0 - Exit
Your choice: 2

Welcome to the Brain Games!
May I have your name? Sam
Hello, Sam! */