package com.company.EX7;

import com.company.EX4.SwingEx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class CardGameGUI extends JFrame {
    JFrame mainFrame;
    JButton nextMove;
    JLabel result;
    Label winner;
    JLabel firstPlayer;
    JLabel secondPlayer;
    Font font;
    Stack<Integer> stackForPlayer1;
    Stack<Integer> stackForPlayer2;
    int count = 0;

    public Stack<Integer> convertStringIntoIntCollection(String stringCards) {
        Stack<Integer> cardStack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            cardStack.push(Integer.parseInt(String.valueOf(stringCards.charAt(i))));
        }
        return cardStack;

    }

    public CardGameGUI(String stringCardsFor1, String stringCardsFor2) {
        font = new Font("roboto", Font.BOLD, 24);
        stackForPlayer1 = convertStringIntoIntCollection(stringCardsFor1);
        stackForPlayer2 = convertStringIntoIntCollection(stringCardsFor2);

        setMainFrame();
        nextMove = new JButton("Next move");
        nextMove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!stackForPlayer1.isEmpty() && !stackForPlayer2.isEmpty() && count != 106) {
                    count++;
                    Integer player1Card = stackForPlayer1.get(0);
                    stackForPlayer1.remove(0);
                    Integer player2Card = stackForPlayer2.get(0);
                    stackForPlayer2.remove(0);
                    result.setText(player1Card.toString() + " X " + player2Card.toString());

                    if (player1Card > player2Card) {
                        if (player1Card == 9 && player2Card == 0) {
                            stackForPlayer2.push(player2Card);
                            stackForPlayer2.push(player1Card);
                        } else {
                            stackForPlayer1.push(player1Card);
                            stackForPlayer1.push(player2Card);
                        }
                    } else if (player1Card < player2Card) {
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

                    firstPlayer.setText(stackForPlayer1.toString());
                    secondPlayer.setText(stackForPlayer2.toString());
                } else {
                    nextMove.setEnabled(false);
                    if (count == 106)
                        winner.setText("Botva");
                    else if (stackForPlayer2.isEmpty())
                        winner.setText("First: number of moves = " + count);
                    else
                        winner.setText("Second: number of moves = " + count);
                }
            }
        });


        mainFrame.add(nextMove, BorderLayout.SOUTH);


        result = new JLabel("0 X 0", SwingConstants.CENTER);
        result.setFont(font);
        mainFrame.add(result, BorderLayout.CENTER);


        firstPlayer = new JLabel(stackForPlayer1.toString());
        firstPlayer.setFont(font);
        mainFrame.add(firstPlayer, BorderLayout.WEST);

        secondPlayer = new JLabel(stackForPlayer2.toString());
        secondPlayer.setFont(font);
        mainFrame.add(secondPlayer, BorderLayout.EAST);

        winner = new Label("N/A");
        winner.setFont(font);
        mainFrame.add(winner, BorderLayout.NORTH);

    }

    public void setMainFrame() {
        mainFrame = new JFrame("Card Game");
        mainFrame.setSize(700, 500);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        CardGameGUI cardGameGUI = new CardGameGUI("24242", "42424");
    }
}
