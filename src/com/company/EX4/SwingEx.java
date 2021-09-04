package com.company.EX4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingEx extends JFrame {
    JFrame mainFrame;
    JButton aCMilan;
    JButton realMadrid;
    JLabel result;
    JLabel lastScorer;
    Label winner;
    Font font;
    static int milanScore = 0;
    static int realMadridScore = 0;

    public SwingEx() {
        font = new Font("sanserif", Font.BOLD, 24);

        setMainFrame();

        aCMilan = new JButton("AC Milan");
        realMadrid = new JButton("Real Madrid");

        aCMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                result.setText("Result " + milanScore + " X " + realMadridScore);
                lastScorer.setText("Last Scorer: AC Milan");
                whoIsWinner();


            }
        });

        realMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realMadridScore++;
                result.setText("Result " + milanScore + " X " + realMadridScore);
                lastScorer.setText("Last Scorer: Real Madrid");
                whoIsWinner();
            }
        });

        mainFrame.add(aCMilan, BorderLayout.WEST);
        mainFrame.add(realMadrid, BorderLayout.EAST);


        result = new JLabel("Result 0 X 0", SwingConstants.CENTER);
        result.setFont(font);
        mainFrame.add(result, BorderLayout.CENTER);


        lastScorer = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
        lastScorer.setFont(font);
        mainFrame.add(lastScorer, BorderLayout.SOUTH);

        winner = new Label("");
        winner.setFont(font);
        mainFrame.add(winner, BorderLayout.NORTH);


    }

    public void whoIsWinner() {
        int resultScore = milanScore + realMadridScore;
        if (resultScore == 10) {
            if (milanScore > realMadridScore) {
                winner.setText("Winner: AC Milan. Score = " + resultScore);

            } else {
                winner.setText("Winner: Real Madrid. Score = " + resultScore);
            }
            aCMilan.setEnabled(false);
            realMadrid.setEnabled(false);
        }
    }

    public void setMainFrame() {
        mainFrame = new JFrame("Soccer");
        mainFrame.setSize(700, 500);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {

        new SwingEx();
    }
}
