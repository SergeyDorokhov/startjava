import java.util.*;

public class GuessNumber {
	private Player playerOne;
	private Player playerTwo;
	private int hiddenNumber;
	private Scanner scan = new Scanner(System.in);

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

	private Player guessNumber(Player player) {
		System.out.println(player.getName() + ", введите число!");
		player.setNumber(scan.nextInt());
		return player;
	}

	private boolean checkNumber(Player player) {
		int currentNumber = player.getNumber();
		if (currentNumber > hiddenNumber) {
			System.out.println ("Вы ввели: " + currentNumber + ". Загадано меньшее число!");
			return false;
		} else if (currentNumber < hiddenNumber) {
			System.out.println ("Вы ввели: " + currentNumber + ". Загадано большее число!");
			return false;
		} else {
			System.out.println ("Вы ввели: " + currentNumber + ". Вы угадали!");
			return true;
		}
	}
}