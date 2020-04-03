import java.util.*;

public class CalculatorTest {
	public static void main(String[] args) {
		boolean isWorking = true;
		while(isWorking) {
			Calculator calc = new Calculator();
		
			System.out.print("Введите первое число: ");
			Scanner scan = new Scanner(System.in);
			int firstNumber = scan.nextInt();
			calc.setFirstNumber(firstNumber);

			System.out.print("Введите знак математической операции: ");
			scan = new Scanner(System.in);
			char operation = scan.nextLine().charAt(0);
			calc.setOperation(operation);

			System.out.print("Введите второе число: ");
			scan = new Scanner(System.in);
			int secondNumber = scan.nextInt();
			calc.setSecondNumber(secondNumber);

			switch (operation) {
				case '+':
					System.out.println(calc.getFirstNumber() + calc.getSecondNumber());
					break;
				case '-':
					System.out.println(calc.getFirstNumber() - calc.getSecondNumber());
					break;
				case '*':
					System.out.println(calc.getFirstNumber() * calc.getSecondNumber());
					break;
				case '/':
					System.out.println(calc.getFirstNumber() / calc.getSecondNumber());
					break;
				case '%':
					System.out.println(calc.getFirstNumber() % calc.getSecondNumber());
					break;
				case '^':
					int result = 1;
					for (int i = 1; i <= calc.getSecondNumber(); i++ ) {
						result *= calc.getFirstNumber();
					}
					System.out.println(result);
					break;
				default: System.out.println("Неизвестный знак");
					break;
			}
			while (true) {
				System.out.println("Хотите продолжить? [y/n]: ");
				scan = new Scanner(System.in);
				char userReply = scan.nextLine().charAt(0);
				if (userReply == 'y') {
					break;
				} else if (userReply == 'n') {
					isWorking = false;
					break;
				}
			}
		}
	}
}