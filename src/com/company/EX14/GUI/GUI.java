package com.company.EX14.GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Test");
		frame.setSize(270, 200);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button = new JButton("Table");
		JButton button1 = new JButton("Internet");
		JLabel label = new JLabel("Выберите способ оформления заказа: ");
		label.setBounds(10, 20, 300, 20);
		button.setBounds(10, 70, 100, 50);
		button.setBackground(new Color(0x129601));
		button.setForeground(Color.white);
		button.setFocusable(false);

		button1.setBounds(130, 70, 100, 50);
		button1.setBackground(new Color(0x129601));
		button1.setForeground(Color.white);
		button1.setFocusable(false);
		frame.add(button);
		frame.add(button1);
		frame.add(label);

		button.addActionListener(e -> {
			frame.dispose();
			TableAuthGui authGUI = new TableAuthGui();
		});

		button1.addActionListener(e -> {
			frame.dispose();
			AuthGUI authGUI = new AuthGUI();
		});

	}
}
