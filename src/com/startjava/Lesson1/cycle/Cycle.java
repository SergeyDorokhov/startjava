package com.startjava.Lesson1.cycle;

public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i < 21; i++) {
			System.out.println(i);
		}

		int i = 6;
		while (i >= -6) {
			System.out.println(i);
			i -= 2;
		}

		i = 10;
		int sum = 0;
		do {
			if (i % 2 != 0) {
				sum += i;
			}
			i++;
		} while (i <= 20);
		System.out.println(sum);
	}
}