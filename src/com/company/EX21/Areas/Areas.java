package com.company.EX21.Areas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Areas extends JFrame {
    JFrame mainFrame;
    JLabel center;
    JLabel south;
    JLabel north;
    JLabel east;
    JLabel west;

    public Areas() {
        setMainFrame();
        Font font = new Font("roboto", Font.BOLD, 30);

        center = new JLabel("Center", SwingConstants.CENTER);
        center.setFont(font);
        mainFrame.add(center, BorderLayout.CENTER);

        south = new JLabel("South", SwingConstants.CENTER);
        south.setFont(font);
        mainFrame.add(south, BorderLayout.SOUTH);

        north = new JLabel("North", SwingConstants.CENTER);
        north.setFont(font);
        mainFrame.add(north, BorderLayout.NORTH);

        east = new JLabel("East", SwingConstants.CENTER);
        east.setFont(font);
        mainFrame.add(east, BorderLayout.EAST);

        west = new JLabel("West", SwingConstants.CENTER);
        west.setFont(font);;
        mainFrame.add(west, BorderLayout.WEST);

        center.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(Areas.this,
                        "Welcome to Center",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        south.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(Areas.this,
                        "Welcome to South",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        north.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(Areas.this,
                        "Welcome to North",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        east.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(Areas.this,
                        "Welcome to East",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        west.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(Areas.this,
                        "Welcome to West",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

    }

    public void setMainFrame() {
        mainFrame = new JFrame("Areas");
        mainFrame.setSize(700, 500);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        Areas areas = new Areas();
    }
}
