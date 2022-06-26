package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;
class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Please enter the game number and press Enter.\n" +
					"1 - Greet\n" +
					"2 - Even\n" +
					"3 - Calc\n" +
					"4 - GCD\n" +
					"5 - Progression\n" +
					"0 - Exit");
			int gameNum = scanner.nextInt();
			switch (gameNum) {
				case 1 : System.out.println("Your choice: 1\nWelcome to the Brain Games!"); Cli.greeting(); break;
				case 2 : System.out.println("Your choice: 2\nWelcome to the Brain Games!"); Even.start(); break;
				case 3 : System.out.println("Your choice: 3\nWelcome to the Brain Games!"); Calc.app(); break;
				case 4 : System.out.println("Your choice: 4\nWelcome to the Brain Games!"); GCD.app(); break;
				case 5 : System.out.println("Your choice: 5\nWelcome to the Brain Games!"); Progression.app(); break;
				case 0 : break;
				default: continue;
			}
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