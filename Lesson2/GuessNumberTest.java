import java.util.*;

public class GuessNumberTest {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Друзья, начинаем игру! Введите имя первого игрока:");
		Player playerOne = new Player(scan.nextLine());
		System.out.println("Введите имя второго игрока:");
		Player playerTwo = new Player(scan.nextLine());
		(new GuessNumber()).startGame(playerOne, playerTwo);
	}
}