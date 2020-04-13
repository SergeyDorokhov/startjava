package com.startjava.Lesson4.calculator;

public class Calculator {
    private String mathExpression;

    public String getMathExpression() {
        return mathExpression;
    }

    public void setMathExpression(String mathExpression) {
        this.mathExpression = mathExpression;
    }

    public void calculate() {
        String[] mathExpressionArray = mathExpression.split(" ");
        int firstNumber = Integer.parseInt(mathExpressionArray[0]);
        int secondNumber = Integer.parseInt(mathExpressionArray[2]);
        char operation = mathExpressionArray[1].charAt(0);

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