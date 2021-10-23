package com.company.EX14.GUI;

import com.company.EX14.Customer.Address;
import com.company.EX14.Customer.Customer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuthGUI {
	JFrame mainFrame;

	private void setFrame() {
		mainFrame = new JFrame("Authentication");
		mainFrame.setSize(600, 500);
		mainFrame.setLayout(null);
		mainFrame.setVisible(true);
		mainFrame.setResizable(false);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setBackground(new Color(0xFFFFFF));
	}

	public AuthGUI() {
		setFrame();
		JLabel label = new JLabel("Зарегистрируйтесь!");
		label.setFont(new Font("Roboto", Font.PLAIN, 24));
		label.setSize(600, 40);
		label.setLocation(50, 50);
		mainFrame.add(label);

		JLabel name = new JLabel("Имя");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(100, 40);
		name.setLocation(50, 100);
		mainFrame.add(name);

		JTextField tName = new JTextField();
		tName.setFont(new Font("Arial", Font.PLAIN, 15));
		tName.setSize(190, 40);
		tName.setLocation(150, 100);
		mainFrame.add(tName);

		JLabel surName = new JLabel("Фамилия");
		surName.setFont(new Font("Arial", Font.PLAIN, 20));
		surName.setSize(100, 40);
		surName.setLocation(50, 150);
		mainFrame.add(surName);

		JTextField tSurName = new JTextField();
		tSurName.setFont(new Font("Arial", Font.PLAIN, 15));
		tSurName.setSize(190, 40);
		tSurName.setLocation(150, 150);
		mainFrame.add(tSurName);

		JLabel age = new JLabel("Возраст");
		age.setFont(new Font("Arial", Font.PLAIN, 20));
		age.setSize(100, 40);
		age.setLocation(50, 200);
		mainFrame.add(age);

		JTextField tAge = new JTextField();
		tAge.setFont(new Font("Arial", Font.PLAIN, 15));
		tAge.setSize(100, 40);
		tAge.setLocation(150, 200);
		mainFrame.add(tAge);

		JLabel address = new JLabel("Введите ваш адрес в формате: город,улица,индекс,номер_дома,номер_квартиры,строение");
		address.setFont(new Font("Arial", Font.PLAIN, 12));
		address.setForeground(Color.gray);
		address.setSize(600, 40);
		address.setLocation(0, 250);
		address.setHorizontalAlignment(JLabel.CENTER);
		mainFrame.add(address);

		JLabel addressLabel = new JLabel("Адрес");
		addressLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		addressLabel.setSize(100, 40);
		addressLabel.setLocation(50, 300);
		mainFrame.add(addressLabel);

		JTextField tAddress = new JTextField();
		tAddress.setFont(new Font("Arial", Font.PLAIN, 15));
		tAddress.setSize(300, 40);
		tAddress.setLocation(150, 300);
		mainFrame.add(tAddress);

		JButton button1 = new JButton("Зарегистрироваться");
		button1.setBackground(new Color(0x129601));
		button1.setForeground(Color.white);
		button1.setFocusable(false);
		button1.setSize(300, 40);
		button1.setLocation(150, 400);
		mainFrame.add(button1);

		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name, surname, addressText;
				int age;
				name = tName.getText();
				surname = tSurName.getText();
				addressText = tAddress.getText();
				if (!name.isEmpty() && !surname.isEmpty() && !addressText.isEmpty() && !tAge.getText().isEmpty()) {
					age = Integer.parseInt(tAge.getText());
					Customer me = new Customer(name, surname, age, new Address(addressText));
					mainFrame.dispose();
					InternetOrderGUI internetOrderGUI = new InternetOrderGUI(me);
				} else {
					JOptionPane.showMessageDialog(null, "Вы ввели не все данные!", "Warning", JOptionPane.WARNING_MESSAGE);
				}
			}
		});


	}

	public static void main(String[] args) {
		AuthGUI authGUI = new AuthGUI();
	}
}
