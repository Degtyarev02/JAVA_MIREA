package com.company.EX7;

import java.util.Scanner;
import java.util.Stack;

public class CardGameOnStack {
    Stack<Integer> stackForPlayer1 = new Stack<Integer>();
    Stack<Integer> stackForPlayer2 = new Stack<Integer>();
    int count = 0;

    public void start() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            stackForPlayer1.push(in.nextInt());
            stackForPlayer2.push(in.nextInt());
        }
        while (!stackForPlayer1.isEmpty() && !stackForPlayer2.isEmpty() && count != 106) {
            count++;
            Integer player1Card = stackForPlayer1.get(0);
            stackForPlayer1.remove(0);
            Integer player2Card = stackForPlayer2.get(0);
            stackForPlayer2.remove(0);
            if (player1Card > player2Card) {
                if (player1Card == 9 && player2Card == 0) {
                    stackForPlayer2.push(player2Card);
                    stackForPlayer2.push(player1Card);
                } else {
                    stackForPlayer1.push(player1Card);
                    stackForPlayer1.push(player2Card);
                }
            } else {
                if (player2Card == 9 && player1Card == 0) {
                    stackForPlayer1.push(player1Card);
                    stackForPlayer1.push(player2Card);
                } else {
                    stackForPlayer2.push(player2Card);
                    stackForPlayer2.push(player1Card);
                }
            }
        }

        if (count == 106) System.out.println("Botva");
        else if (stackForPlayer1.isEmpty()) System.out.println("First");
        else System.out.println("Second");
        System.out.println("Number of moves: " + count);

    }

    public static void main(String[] args) {
        CardGameOnStack cardGameOnStack = new CardGameOnStack();
        cardGameOnStack.start();
    }
}
