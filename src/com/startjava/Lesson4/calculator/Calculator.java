package com.startjava.Lesson4.calculator;

public class Calculator {
    private String srcMathExpression;

    public String getSrcMathExpression() {
        return srcMathExpression;
    }

    public void setSrcMathExpression(String srcMathExpression) {
        this.srcMathExpression = srcMathExpression;
    }

    public void calculate() {
        String[] splitMathExpression = srcMathExpression.split(" ");
        int firstNumber = Integer.parseInt(splitMathExpression[0]);
        int secondNumber = Integer.parseInt(splitMathExpression[2]);
        char operation = splitMathExpression[1].charAt(0);

        switch (operation) {
            case '+':
                System.out.println(Math.addExact(firstNumber, secondNumber));
                break;
            case '-':
                System.out.println(Math.subtractExact(firstNumber, secondNumber));
                break;
            case '*':
                System.out.println(Math.multiplyExact(firstNumber, secondNumber));
                break;
            case '/':
                System.out.println(firstNumber / secondNumber);
                break;
            case '%':
                System.out.println(firstNumber % secondNumber);
                break;
            case '^':
                System.out.println((int) Math.pow(firstNumber, secondNumber));
                break;
            default:
                System.out.println("Неизвестный знак");
        }
    }
}