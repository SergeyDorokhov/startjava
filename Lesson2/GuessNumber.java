import java.util.*;

public class GuessNumber {
	private int hiddenNumber;

	public GuessNumber() {
		hiddenNumber = (int)(Math.random() * 101);
	}

	public void startGame(Player playerOne, Player playerTwo) {
		Scanner scan = new Scanner(System.in);
		char userReply;

		System.out.println("Компьютер загадал число от нуля до 100! Ваша задача - угадать это число!");
		do {
			while (true) {
				if (isGuessed(playerOne)) {
					break;
				}
				if (isGuessed(playerTwo)) {
					break;
				}
			}
			do {
			System.out.println("Еще одну игру? [y/n]: ");
			userReply = scan.nextLine().charAt(0);
			} while (userReply != 'y' && userReply != 'n');
		} while (userReply != 'n');
	}

	private boolean isGuessed (Player player) {
		Scanner scan = new Scanner(System.in);
		boolean isVictory = false;
		
		System.out.println(player.getName() + ", введите число!");
		int declaredNumber = scan.nextInt();
		if (declaredNumber > hiddenNumber) {
				System.out.println ("Вы ввели: " + declaredNumber + ". Загадано меньшее число!");
			} else if (declaredNumber < hiddenNumber) {
				System.out.println ("Вы ввели: " + declaredNumber + ". Загадано большее число!");
			} else {
				System.out.println ("Вы ввели: " + declaredNumber + ". Вы угадали!");
				isVictory = true;
			}
		return isVictory;
	}
}