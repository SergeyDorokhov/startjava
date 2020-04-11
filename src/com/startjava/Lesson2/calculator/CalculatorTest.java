package com.startjava.Lesson2.calculator;

import java.util.*;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		char userReply;

		do {
			System.out.print("Введите первое число: ");
			calc.setFirstNumber(scan.nextInt());
			scan.nextLine();

			System.out.print("Введите знак математической операции: ");
			calc.setOperation(scan.nextLine().charAt(0));

			System.out.print("Введите второе число: ");
			calc.setSecondNumber(scan.nextInt());
			scan.nextLine();

			calc.calculate();

			do {
				System.out.println("Хотите продолжить? [y/n]: ");
				userReply = scan.nextLine().charAt(0);
			} while (userReply != 'y' && userReply != 'n');
		} while (userReply != 'n');
	}
}