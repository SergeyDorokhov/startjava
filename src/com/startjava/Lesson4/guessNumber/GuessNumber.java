package com.startjava.Lesson4.guessNumber;

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
        playerOne.setAttempt(0);
        playerTwo.setAttempt(0);
        Player winner = null;
        hiddenNumber = (int) (Math.random() * 101);
        System.out.println("Компьютер загадал число от нуля до 100! У вас 10 попыток, чтобы угадать его!");
        while (true) {
            playerOne.setAttempt(playerOne.getAttempt() + 1);
            if (checkNumber(inputNumber(playerOne))) {
                winner = playerOne;
                break;
            } else {
                checkAttempt(playerOne);
            }
            playerTwo.setAttempt(playerTwo.getAttempt() + 1);
            if (checkNumber(inputNumber(playerTwo))) {
                winner = playerTwo;
                break;
            } else {
                checkAttempt(playerTwo);
            }
            if (playerTwo.getAttempt() == 10) {
                break;
            }
        }
        if (winner != null) {
            System.out.println("Игрок " + winner.getName() + " угадал число " + hiddenNumber + " с " + winner.getAttempt() + " попытки");
        }
        outputNumbers(playerOne);
        outputNumbers(playerTwo);
    }

    private Player inputNumber(Player player) {
        System.out.println(player.getName() + ", введите число!");
        player.getNumbers()[player.getAttempt() - 1] = scan.nextInt();
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

    private void outputNumbers(Player player) {
        System.out.print("Числа игрока " + player.getName() + ":");
        for (int i = 0; i < player.getAttempt(); i++) {
            System.out.print(" " + player.getNumbers()[i]);
        }
        System.out.println();
    }
}