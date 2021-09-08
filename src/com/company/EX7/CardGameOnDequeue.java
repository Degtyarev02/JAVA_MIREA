package com.company.EX7;

import java.util.*;

public class CardGameOnDequeue {
    Deque<Integer> dequeForPlayer1 = new LinkedList<>();
    Deque<Integer> dequeForPlayer2 = new LinkedList<>();
    int count = 0;

    public void start() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            dequeForPlayer1.addLast(in.nextInt());
            dequeForPlayer2.addLast(in.nextInt());
        }
        while (!dequeForPlayer1.isEmpty() && !dequeForPlayer2.isEmpty() && count != 106) {
            count++;
            Integer player1Card = dequeForPlayer1.removeFirst();
            Integer player2Card = dequeForPlayer2.removeFirst();
            if (player1Card > player2Card) {
                if (player1Card == 9 && player2Card == 0) {

                    dequeForPlayer2.addLast(player2Card);
                    dequeForPlayer2.addLast(player1Card);
                } else {
                    dequeForPlayer1.addLast(player1Card);
                    dequeForPlayer1.addLast(player2Card);
                }
            } else {
                if (player2Card == 9 && player1Card == 0) {
                    dequeForPlayer1.addLast(player1Card);
                    dequeForPlayer1.addLast(player2Card);
                } else {
                    dequeForPlayer2.addLast(player2Card);
                    dequeForPlayer2.addLast(player1Card);
                }
            }
        }

        if (count == 106) System.out.println("Botva");
        else if (dequeForPlayer2.isEmpty()) System.out.println("First");
        else System.out.println("Second");
        System.out.println("Number of moves: " + count);

    }

    public static void main(String[] args) {
        CardGameOnStack cardGameOnStack = new CardGameOnStack();
        cardGameOnStack.start();
    }
}
