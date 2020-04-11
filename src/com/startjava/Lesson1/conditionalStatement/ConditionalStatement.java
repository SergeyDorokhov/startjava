package com.startjava.Lesson1.conditionalStatement;

public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 25;
		if (age > 20) {
			System.out.println("Уже старый");
		}

		boolean isMan = true;
		if (isMan) {
			System.out.println("Это мужчина");
		}
		if (!isMan) {
			System.out.println("Это не мужчина");
		}

		float height = 1.75f;
		if (height < 1.80) {
			System.out.println("Подойдет в танкисты");
		} else {
			System.out.println("Не подойдет в танкисты");
		}

		char firstNameLetter = 'M';
		if (firstNameLetter == 'M') {
			System.out.println("Это Марфа");
		} else if (firstNameLetter == 'I') {
			System.out.println("Это не Марфа");
		} else {
			System.out.println("Не знаю, кто это");
		}
	}
}