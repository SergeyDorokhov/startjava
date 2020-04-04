import java.util.*;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		char userReply;
		do {
			System.out.print("Введите первое число: ");
			int firstNumber = scan.nextInt();
			scan.nextLine();
			calc.setFirstNumber(firstNumber);

			System.out.print("Введите знак математической операции: ");
			char operation = scan.nextLine().charAt(0);
			calc.setOperation(operation);

			System.out.print("Введите второе число: ");
			int secondNumber = scan.nextInt();
			scan.nextLine();
			calc.setSecondNumber(secondNumber);

			calc.calculate();
			
			while (true) {
				System.out.println("Хотите продолжить? [y/n]: ");
				userReply = scan.nextLine().charAt(0);
				if (userReply == 'y' || userReply == 'n') {
					break;
				}
			}
		} while (userReply != 'n');
	}
}