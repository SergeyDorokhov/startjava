public class MyFirstGame {
	public static void main(String[] args) {
		int hiddenNumber = 43;
		int declaredNumber = 50;
		if (declaredNumber == hiddenNumber) {
			System.out.println ("Вы ввели: " + declaredNumber + ". Вы угадали!");
		} else {
			do {
				if (declaredNumber > hiddenNumber) {
				System.out.println ("Вы ввели: " + declaredNumber + ". Загадано меньшее число!");
				declaredNumber--;
				} else if (declaredNumber < hiddenNumber) {
				System.out.println ("Вы ввели: " + declaredNumber + ". Загадано большее число!");
				declaredNumber++;
				}
				if (declaredNumber == hiddenNumber) {
					System.out.println ("Вы ввели: " + declaredNumber + ". Вы угадали!");
				}
			} while (declaredNumber != hiddenNumber);
		}
	}
}