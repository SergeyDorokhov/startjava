package com.startjava.Lesson4.guessNumber;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char userReply;
        System.out.println("Друзья, начинаем игру! Введите имя первого игрока:");
        Player playerOne = new Player(scan.nextLine());
        System.out.println("Введите имя второго игрока:");
        Player playerTwo = new Player(scan.nextLine());
        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
        do {
            guessNumber.startGame();
            do {
                System.out.println("Еще одну игру? [y/n]: ");
                userReply = scan.nextLine().charAt(0);
            } while (userReply != 'y' && userReply != 'n');
        } while (userReply != 'n');
    }
}