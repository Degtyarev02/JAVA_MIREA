package com.company.EX21.Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz extends JFrame {
    JFrame mainFrame;
    JMenuBar menuBar;
    JTextField inputField;
    JButton guessNum;
    JButton start;
    int num;
    int count;

    public Quiz(){
        setMainFrame();
        num = (int) (Math.random() * 21);
        inputField = new JTextField("Введите число");
        guessNum = new JButton("Угадать!");
        start = new JButton("Начать!");
        mainFrame.add(start, BorderLayout.NORTH);
        mainFrame.add(inputField, BorderLayout.CENTER);
        mainFrame.add(guessNum, BorderLayout.SOUTH);
        System.out.println(num);

        start.addActionListener(e -> {
            count = 0;
            num = (int) (Math.random() * 21);
            guessNum.setEnabled(true);
            inputField.setEnabled(true);
            inputField.setText("Введите число");
            System.out.println(num);
        });

        guessNum.addActionListener(e -> {
            int inputNum = 0;
            if(!inputField.getText().isEmpty()) {
                try {
                    inputNum = Integer.parseInt(inputField.getText());
                    if(inputNum > num) {
                        inputField.setText("Ваше число больше загаданного!");
                    } else if (inputNum < num) {
                        inputField.setText("Ваше число меньше загаданного!");
                    } else {
                        inputField.setText("Вы угадали, поздравляем!");
                        inputField.setEnabled(false);
                        return;
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                count++;
                if(count >= 3) {
                    inputField.setText("Превышено число угадываний, вы проиграли, GAME OVER");
                    inputField.setEnabled(false);
                    guessNum.setEnabled(false);
                    return;
                }
            }
        });

    }
    public void setMainFrame() {
        mainFrame = new JFrame("Quiz game");
        mainFrame.setSize(700, 500);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
    }
}
