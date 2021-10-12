package com.company.EX7;

import java.util.Stack;

public class CardGameOnStack {
    Stack<Integer> stackForPlayer1;
    Stack<Integer> stackForPlayer2;
    int count = 0;

    public Stack<Integer> convertStringIntoIntCollection(String stringCards) {
        Stack<Integer> cardStack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            cardStack.push(Integer.parseInt(String.valueOf(stringCards.charAt(i))));
        }
        System.out.println(cardStack);
        return cardStack;

    }

    public void start(String stringCardsFor1, String stringCardsFor2) {
        stackForPlayer1 = convertStringIntoIntCollection(stringCardsFor1);
        stackForPlayer2 = convertStringIntoIntCollection(stringCardsFor2);

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
            } else if(player1Card < player2Card) {
                if (player2Card == 9 && player1Card == 0) {
                    stackForPlayer1.push(player1Card);
                    stackForPlayer1.push(player2Card);
                } else {
                    stackForPlayer2.push(player2Card);
                    stackForPlayer2.push(player1Card);
                }
            } else {
                stackForPlayer1.push(player1Card);
                stackForPlayer2.push(player2Card);
            }

            System.out.println(stackForPlayer1);
            System.out.println(stackForPlayer2 + "\n");
        }

        if (count == 106) System.out.println("Botva");
        else if (stackForPlayer1.isEmpty()) System.out.println("Second");
        else System.out.println("First");
        System.out.println("Number of moves: " + count);

    }

    public static void main(String[] args) {
        CardGameOnStack cardGameOnStack = new CardGameOnStack();
        cardGameOnStack.start("42424", "24242");
    }
}
