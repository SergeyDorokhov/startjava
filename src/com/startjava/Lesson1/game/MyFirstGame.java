package com.startjava.Lesson1.game;

public class MyFirstGame {
	public static void main(String[] args) {
		int hiddenNumber = 43;
		int declaredNumber = 50;

		do {
			if (declaredNumber > hiddenNumber) {
				System.out.println ("Вы ввели: " + declaredNumber + ". Загадано меньшее число!");
				declaredNumber--;
			} else if (declaredNumber < hiddenNumber) {
				System.out.println ("Вы ввели: " + declaredNumber + ". Загадано большее число!");
				declaredNumber++;
			}
		} while (declaredNumber != hiddenNumber);
		System.out.println ("Вы ввели: " + declaredNumber + ". Вы угадали!");
	}
}