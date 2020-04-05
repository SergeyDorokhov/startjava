import java.util.*;

public class GuessNumberTest {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char userReply;
		
		System.out.println("Друзья, начинаем игру! Введите имя первого игрока:");
		Player playerOne = new Player(scan.nextLine());
		System.out.println("Введите имя второго игрока:");
		Player playerTwo = new Player(scan.nextLine());

		System.out.println("Просим компьютер загадать число от нуля до 100!");
		GuessNumber guessNumber = new GuessNumber();
		System.out.println("Компьютер загадал число! Начинает " + playerOne.getName());

		do {
			while (true) {
				System.out.println(playerOne.getName() + ", введите число!");
				if (guessNumber.checkNumber(scan.nextInt())) {
					break;
				}
				System.out.println(playerTwo.getName() + ", введите число!");
				if (guessNumber.checkNumber(scan.nextInt())) {
					break;
				}
			}
			scan.nextLine();
			do {
				System.out.println("Еще одну игру? [y/n]: ");
				userReply = scan.nextLine().charAt(0);
			} while (userReply != 'y' && userReply != 'n');
		} while (userReply != 'n');
	}
}