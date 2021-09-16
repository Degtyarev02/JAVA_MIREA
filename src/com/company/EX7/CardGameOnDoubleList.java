package com.company.EX7;

import java.util.LinkedList;

public class CardGameOnDoubleList {
    LinkedList<Integer> linkedListForPlayer1;
    LinkedList<Integer> linkedListForPlayer2;
    int count = 0;

    public LinkedList<Integer> convertStringIntoIntCollection(String stringCards) {
        LinkedList<Integer> cardLinkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            cardLinkedList.addLast(Integer.parseInt(String.valueOf(stringCards.charAt(i))));
        }
        System.out.println(cardLinkedList);
        return cardLinkedList;
    }

    public void start(String stringCardsFor1, String stringCardsFor2) {
        linkedListForPlayer1 = convertStringIntoIntCollection(stringCardsFor1);
        linkedListForPlayer2 = convertStringIntoIntCollection(stringCardsFor2);
        while (!linkedListForPlayer1.isEmpty() && !linkedListForPlayer2.isEmpty() && count != 106) {
            count++;
            Integer player1Card = linkedListForPlayer1.removeFirst();
            Integer player2Card = linkedListForPlayer2.removeFirst();
            if (player1Card > player2Card) {
                if (player1Card == 9 && player2Card == 0) {

                    linkedListForPlayer2.addLast(player2Card);
                    linkedListForPlayer2.addLast(player1Card);
                } else {
                    linkedListForPlayer1.addLast(player1Card);
                    linkedListForPlayer1.addLast(player2Card);
                }
            } else if (player1Card < player2Card) {
                if (player2Card == 9 && player1Card == 0) {
                    linkedListForPlayer1.addLast(player1Card);
                    linkedListForPlayer1.addLast(player2Card);
                } else {
                    linkedListForPlayer2.addLast(player2Card);
                    linkedListForPlayer2.addLast(player1Card);
                }
            } else {
                linkedListForPlayer1.addLast(player1Card);
                linkedListForPlayer2.addLast(player2Card);
            }
        }

        if (count == 106) System.out.println("Botva");
        else if (linkedListForPlayer2.isEmpty()) System.out.println("First");
        else System.out.println("Second");
        System.out.println("Number of moves: " + count);

    }

    public static void main(String[] args) {
        CardGameOnDoubleList cardGameOnDoubleList = new CardGameOnDoubleList();
        cardGameOnDoubleList.start("13579", "24680");
    }
}
