package com.company.EX7;

import java.util.*;

public class CardGameOnQueue {
    Queue<Integer> queueForPlayer1 = new PriorityQueue<>();
    Queue<Integer> queueForPlayer2 = new PriorityQueue<>();
    int count = 0;

    public void start() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            queueForPlayer1.add(in.nextInt());
            queueForPlayer2.add(in.nextInt());
        }
        while (!queueForPlayer1.isEmpty() && !queueForPlayer2.isEmpty() && count != 106) {
            count++;
            Integer player1Card = queueForPlayer1.poll();
            Integer player2Card = queueForPlayer2.poll();
            if (player1Card > player2Card) {
                if (player1Card == 9 && player2Card == 0) {
                    queueForPlayer2.add(player2Card);
                    queueForPlayer2.add(player1Card);
                } else {
                    queueForPlayer1.add(player1Card);
                    queueForPlayer1.add(player2Card);
                }
            } else {
                if (player2Card == 9 && player1Card == 0) {
                    queueForPlayer1.add(player1Card);
                    queueForPlayer1.add(player2Card);
                } else {
                    queueForPlayer2.add(player2Card);
                    queueForPlayer2.add(player1Card);
                }
            }
        }

        if (count == 106) System.out.println("Botva");
        else if (queueForPlayer2.isEmpty()) System.out.println("First");
        else System.out.println("Second");
        System.out.println("Number of moves: " + count);

    }

    public static void main(String[] args) {
        CardGameOnStack cardGameOnStack = new CardGameOnStack();
        cardGameOnStack.start();
    }
}
