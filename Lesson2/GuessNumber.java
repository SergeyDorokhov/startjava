import java.util.*;

public class GuessNumber {
	Player playerOne;
	Player playerTwo;
	private int hiddenNumber;
	Scanner scan = new Scanner(System.in);

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
		hiddenNumber = (int)(Math.random() * 101);
	}

	public void startGame() {
		System.out.println("Компьютер загадал число от нуля до 100! Ваша задача - угадать это число!");
		while (true) {
			if (checkNumber(guessNumber(playerOne))) {
				break;
			}
			if (checkNumber(guessNumber(playerTwo))) {
				break;
			}
		}
	}

	private boolean checkNumber(Player player) {
		boolean isVictory = false;
		int declaredNumber = player.getNumber();
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

	private Player guessNumber(Player player) {
		System.out.println(player.getName() + ", введите число!");
		player.setNumber(scan.nextInt());
		return player;
		}
}