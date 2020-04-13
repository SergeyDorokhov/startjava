package com.startjava.Lesson4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        char userReply;

        do {
            System.out.print("Введите математическое выражение: ");
            calc.setSrcMathExpression(scan.nextLine());
            calc.calculate();

            do {
                System.out.println("Хотите продолжить? [y/n]: ");
                userReply = scan.nextLine().charAt(0);
            } while (userReply != 'y' && userReply != 'n');
        } while (userReply != 'n');
    }
}