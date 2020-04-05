public class GuessNumber {
	private int hiddenNumber;

	public GuessNumber() {
		hiddenNumber = (int)(Math.random() * 101);
	}

	public boolean checkNumber (int declaredNumber) {
		boolean isVictory = false;
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
}