package com.startjava.Lesson4.guessNumber;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private int hiddenNumber;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGame() {
        init(playerOne);
        init(playerTwo);
        Player winner = null;
        hiddenNumber = (int) (Math.random() * 101);
        System.out.println("Компьютер загадал число от нуля до 100! У вас 10 попыток, чтобы угадать его!");
        while (true) {
            if (checkNumber(inputNumber(playerOne))) {
                winner = playerOne;
                break;
            }
            checkAttempt(playerOne);
            if (checkNumber(inputNumber(playerTwo))) {
                winner = playerTwo;
                break;
            }
            checkAttempt(playerTwo);
            if (playerTwo.getAttempt() == 10) {
                break;
            }
        }
        if (winner != null) {
            System.out.println("Игрок " + winner.getName() + " угадал число " + hiddenNumber + " с " + winner.getAttempt() + " попытки");
        }
        displayNumbers(playerOne);
        displayNumbers(playerTwo);
    }

    private void init(Player player) {
        Arrays.fill(player.getNumbers(), 0, player.getAttempt(), 0);
        player.setAttempt(0);
    }

    private Player inputNumber(Player player) {
        System.out.println(player.getName() + ", введите число!");
        player.insertNumber(scan.nextInt());
        return player;
    }

    private boolean checkNumber(Player player) {
        int currentNumber = player.getNumbers()[player.getAttempt() - 1];
        if (currentNumber > hiddenNumber) {
            System.out.println("Вы ввели: " + currentNumber + ". Загадано меньшее число!");
        } else if (currentNumber < hiddenNumber) {
            System.out.println("Вы ввели: " + currentNumber + ". Загадано большее число!");
        } else {
            System.out.println("Вы ввели: " + currentNumber + ". Вы угадали!");
            return true;
        }
        return false;
    }

    private void checkAttempt(Player player) {
        if (player.getAttempt() == 10) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }
    }

    private void displayNumbers(Player player) {
        int[] finalNumbers = Arrays.copyOf(player.getNumbers(), player.getAttempt());
        System.out.print("Числа игрока " + player.getName() + ":");
        for (int value : finalNumbers) {
            System.out.print(" " + value);
        }
        System.out.println();
    }
}