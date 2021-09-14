package com.company.EX7;

import java.util.*;

public class CardGameOnDequeue {
    Deque<Integer> dequeForPlayer1;
    Deque<Integer> dequeForPlayer2;
    int count = 0;

    public Deque<Integer> convertStringIntoIntCollection(String stringCards) {
        Deque<Integer> cardDeQue = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            cardDeQue.addLast(Integer.parseInt(String.valueOf(stringCards.charAt(i))));
        }
        System.out.println(cardDeQue);
        return cardDeQue;
    }

    public void start(String stringCardsFor1, String stringCardsFor2) {
        Scanner in = new Scanner(System.in);
        dequeForPlayer1 = convertStringIntoIntCollection(stringCardsFor1);
        dequeForPlayer2 = convertStringIntoIntCollection(stringCardsFor2);
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
        CardGameOnDequeue cardGameOnDequeue = new CardGameOnDequeue();
        cardGameOnDequeue.start("13579", "24680");
    }
}
