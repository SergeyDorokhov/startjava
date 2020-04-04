import java.util.*;

public class Calculator {
	private int firstNumber;
	private int secondNumber;
	private char operation;

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public char getOperation() {
		return operation;
	}

	public void setOperation(char operation) {
		this.operation = operation;
	}

	public char calculate() {
		switch (operation) {
			case '+':
				System.out.println(this.firstNumber + this.secondNumber);
				break;
			case '-':
				System.out.println(firstNumber - secondNumber);
				break;
			case '*':
				System.out.println(firstNumber * secondNumber);
				break;
			case '/':
				System.out.println(firstNumber / secondNumber);
				break;
			case '%':
				System.out.println(firstNumber % secondNumber);
				break;
			case '^':
				int result = 1;
				for (int i = 1; i <= secondNumber; i++ ) {
					result *= firstNumber;
				}
				System.out.println(result);
				break;
			default: System.out.println("Неизвестный знак");
				break;
		}
		Scanner scan;
		char userReply;
		while (true) {
			System.out.println("Хотите продолжить? [y/n]: ");
			scan = new Scanner(System.in);
			userReply = scan.nextLine().charAt(0);
			if (userReply == 'y' || userReply == 'n') {
				break;
			}
		}
	return userReply;
	}
}