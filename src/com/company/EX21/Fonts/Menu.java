package com.company.EX21.Fonts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    JFrame mainFrame;
    JMenuBar menuBar;
    JMenu font;
    JMenu color;
    JTextArea jTextArea;

    JMenuItem font1;
    JMenuItem font2;
    JMenuItem font3;

    JMenuItem color1;
    JMenuItem color2;
    JMenuItem color3;

    public Menu(){
        setMainFrame();
        setMenu();
        jTextArea = new JTextArea(10, 10);
        jTextArea.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        mainFrame.add(jTextArea);

        font1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setFont(new Font("Times New Roman", Font.PLAIN, 24));
            }
        });

        font2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setFont(new Font("Courier New", Font.PLAIN, 24));
            }
        });

        font3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setFont(new Font("SansSerif", Font.PLAIN, 24));
            }
        });

        color1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setForeground(Color.red);
            }
        });

        color2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setForeground(Color.green);
            }
        });

        color3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setForeground(Color.blue);
            }
        });


    }


    public void setMainFrame() {
        mainFrame = new JFrame("Menu");
        mainFrame.setSize(700, 500);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    public void setMenu() {

        menuBar = new JMenuBar();

        font = new JMenu("Font");
        font1 = new JMenuItem("Times New Roman");
        font2 = new JMenuItem("MS Sans Serif");
        font3 = new JMenuItem("Courier New");
        font.add(font1);
        font.add(font2);
        font.add(font3);


        color = new JMenu("Color");
        color1 = new JMenuItem("Red");
        color2 = new JMenuItem("Green");
        color3 = new JMenuItem("Blue");
        color.add(color1);
        color.add(color2);
        color.add(color3);

        menuBar.add(font);
        menuBar.add(color);

        mainFrame.setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
    }
}
