package com.company.EX7;

import java.util.*;

public class CardGameOnQueue {
    Queue<Integer> queueForPlayer1;
    Queue<Integer> queueForPlayer2;
    int count = 0;

    public Queue<Integer> convertStringIntoIntCollection(String stringCards) {
        Queue<Integer> cardQueue = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            cardQueue.add(Integer.parseInt(String.valueOf(stringCards.charAt(i))));
        }
        return cardQueue;

    }

    public void start(String stringCardsFor1, String stringCardsFor2) {
        queueForPlayer1 = convertStringIntoIntCollection(stringCardsFor1);
        queueForPlayer2 = convertStringIntoIntCollection(stringCardsFor2);
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
        CardGameOnQueue cardGameOnQueue = new CardGameOnQueue();
        cardGameOnQueue.start("13579", "24680");
    }
}
