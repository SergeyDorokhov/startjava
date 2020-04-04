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

	public void calculate() {
		switch (operation) {
			case '+':
				System.out.println(firstNumber + secondNumber);
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
				for (int i = 1; i <= secondNumber; i++) {
					result *= firstNumber;
				}
				System.out.println(result);
				break;
			default:
				System.out.println("Неизвестный знак");
		}
	}
}