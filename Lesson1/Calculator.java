public class Calculator {
	public static void main(String[] args) {
		int x = 3;
		int y = 3;
		char operation = '^';
		if (operation == '+') {
			System.out.println(x + y);
		} else if (operation == '-') {
			System.out.println(x - y);
		} else if (operation == '*') {
			System.out.println(x * y);
		} else if (operation == '/') {
			System.out.println(x / y);
		} else if (operation == '*') {
			System.out.println(x * y);
		} else if (operation == '%') {
			System.out.println(x % y);
		} else if (operation == '*') {
			System.out.println(x * y);
		} else if (operation == '^') {
			int result = 1;
			for (int i = 1; i <= y; i++ ) {
				result = result * x;
			}
			System.out.println(result);
		}
	}
}