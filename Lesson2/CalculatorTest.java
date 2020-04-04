import java.util.*;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		char userReply;
		do {
			System.out.print("Введите первое число: ");
			int firstNumber = scan.nextInt();
			calc.setFirstNumber(firstNumber);

			System.out.print("Введите знак математической операции: ");
			scan = new Scanner(System.in);
			char operation = scan.nextLine().charAt(0);
			calc.setOperation(operation);

			System.out.print("Введите второе число: ");
			int secondNumber = scan.nextInt();
			calc.setSecondNumber(secondNumber);

			userReply = calc.calculate();
		} while (userReply != 'n');
	}
}