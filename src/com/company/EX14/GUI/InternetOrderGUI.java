package com.company.EX14.GUI;

import com.company.EX14.Customer.Address;
import com.company.EX14.Customer.Customer;
import com.company.EX14.Items.Dish;
import com.company.EX14.Items.Drink;
import com.company.EX14.Items.DrinkTypeENUM;
import com.company.EX14.Items.Item;
import com.company.EX14.Orders.InternetOrder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class InternetOrderGUI {
	private JFrame mainFrame;
	private InternetOrder order;
	private JTextArea mainOrder;
	private JComboBox<Item> comboBox;
	private JLabel totalCostLabel;
	Item[] items = GUI.ITEMS;

	private void setFrame() {
		mainFrame = new JFrame("Internet Order");
		mainFrame.setSize(1000, 800);
		mainFrame.setLayout(null);
		mainFrame.setVisible(true);
		mainFrame.setResizable(false);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setBackground(new Color(0xFFFFFF));
	}

	public InternetOrderGUI(Customer customer) {
		setFrame();
		order = new InternetOrder(customer);
		JLabel name = new JLabel();
		name.setFont(new Font("Arial", Font.PLAIN, 15));
		name.setSize(200, 20);
		name.setLocation(20, 20);
		name.setText("Имя: " + customer.getFirstName());
		mainFrame.add(name);

		JLabel surName = new JLabel();
		surName.setFont(new Font("Arial", Font.PLAIN, 15));
		surName.setSize(300, 20);
		surName.setLocation(20, 40);
		surName.setText("Фамилия: " + customer.getSecond());
		mainFrame.add(surName);

		JLabel age = new JLabel();
		age.setFont(new Font("Arial", Font.PLAIN, 15));
		age.setSize(100, 20);
		age.setLocation(20, 60);
		age.setText("Возраст: " + customer.getAge());
		mainFrame.add(age);

		JTextArea addressShow = new JTextArea();
		addressShow.setFont(new Font("Arial", Font.PLAIN, 12));
		addressShow.setSize(170, 140);
		addressShow.setLocation(20, 90);
		addressShow.setEditable(false);
		Address currentAddress = customer.getAddress();
		addressShow.setText(currentAddress.toString());
		mainFrame.add(addressShow);

		totalCostLabel = new JLabel("Всего: 0$");
		totalCostLabel.setFont(new Font("Arial", Font.BOLD, 20));
		totalCostLabel.setSize(200, 25);
		totalCostLabel.setLocation(20, 250);
		mainFrame.add(totalCostLabel);

		JLabel menuLabel = new JLabel("Выберите блюда:");
		menuLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		menuLabel.setSize(300, 25);
		menuLabel.setLocation(200, 10);
		mainFrame.add(menuLabel);

		comboBox = new JComboBox<Item>(items);
		comboBox.setFont(new Font("Arial", Font.PLAIN, 15));
		comboBox.setSize(600, 50);
		comboBox.setLocation(200, 40);
		mainFrame.add(comboBox);

		JButton addItemButton = new JButton("Добавить");
		addItemButton.setSize(130, 30);
		addItemButton.setLocation(200, 120);
		addItemButton.setBackground(new Color(0x129601));
		addItemButton.setForeground(Color.white);
		addItemButton.setFocusable(false);
		mainFrame.add(addItemButton);

		addItemButton.addActionListener(e -> {
			try {
				Drink drink = (Drink) comboBox.getSelectedItem();
				if (customer.getAge() < 18 && Objects.requireNonNull(drink).isAlcoholicDrink()) {
					JOptionPane.showMessageDialog(null, "Вам еще нет 18!", "Нельзя", JOptionPane.WARNING_MESSAGE);
					return;
				}
			} catch (Exception ex) {
			}
			order.add((Item) comboBox.getSelectedItem());
			refactorMainOrderTextArea();

		});

		JButton removeItemButton = new JButton("Удалить");
		removeItemButton.setSize(100, 30);
		removeItemButton.setLocation(340, 120);
		removeItemButton.setBackground(new Color(0x129601));
		removeItemButton.setForeground(Color.white);
		removeItemButton.setFocusable(false);
		mainFrame.add(removeItemButton);

		removeItemButton.addActionListener(e -> {
			order.remove((Item) Objects.requireNonNull(comboBox.getSelectedItem()));
			mainOrder.setText("Ваш заказ:\n");
			refactorMainOrderTextArea();
		});

		mainOrder = new JTextArea("Ваш заказ:\n");
		mainOrder.setFont(new Font("Arial", Font.PLAIN, 15));
		mainOrder.setSize(600, 700);
		mainOrder.setLocation(200, 160);
		mainOrder.setEditable(false);
		mainFrame.add(mainOrder);

		JButton acceptOrderButton = new JButton("Подтвердить");
		acceptOrderButton.setFont(new Font("Arial", Font.PLAIN, 20));
		acceptOrderButton.setSize(180, 40);
		acceptOrderButton.setLocation(20, 700);
		acceptOrderButton.setBackground(new Color(0x129601));
		acceptOrderButton.setForeground(Color.white);
		acceptOrderButton.setFocusable(false);
		mainFrame.add(acceptOrderButton);



		acceptOrderButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (order.getSize() < 1) {
					JOptionPane.showMessageDialog(null, "Вы ничего не заказали", "Ошибка", JOptionPane.PLAIN_MESSAGE);
				} else {
					GUI.internetOrderManager.add(order);
					JOptionPane.showMessageDialog(null, "Ваш заказ скоро будет доставлен", "Подтверждено", JOptionPane.PLAIN_MESSAGE);
					order = new InternetOrder(customer);
					mainOrder.setText("Заказ оформлен!");
					totalCostLabel.setText("Всего: 0$");
				}
			}
		});

		JButton orderManagerButton = new JButton("Заказы");
		orderManagerButton.setFont(new Font("Arial", Font.PLAIN, 20));
		orderManagerButton.setSize(180, 40);
		orderManagerButton.setLocation(20, 600);
		orderManagerButton.setBackground(new Color(0x129601));
		orderManagerButton.setForeground(Color.white);
		orderManagerButton.setFocusable(false);
		mainFrame.add(orderManagerButton);

		orderManagerButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				OrderManagerGUI orderManagerGUI = new OrderManagerGUI();
			}
		});


	}

	public void refactorMainOrderTextArea() {
		Item[] currentItems = order.getItems();
		mainOrder.setText("Ваш заказ:\n");
		for (Item item : currentItems) {
			mainOrder.append("\n" + item.toString() + "\n");
		}
		totalCostLabel.setText("Всего: " + order.costTotal() + "$");
	}


	public static void main(String[] args) {
		Address address = new Address("Москва,Летчика Грицевца,108850,3,74,б");
		InternetOrderGUI internetOrderGUI = new InternetOrderGUI(new Customer("Vladimir", "Degtyarev", 16, address));
	}
}
