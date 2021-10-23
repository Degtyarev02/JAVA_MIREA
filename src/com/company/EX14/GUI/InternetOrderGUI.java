package com.company.EX14.GUI;

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
	Item[] items = {
			new Dish(
					"Салат Цезарь", "Нарезан лучше, чем римский полководец", 25),
			new Dish("Стейк на грилле", "Прожарка на выбор", 30),
			new Dish("Суп из форели", "Еще вчера плавала в Гудзонском заливе", 23),
			new Dish("Раттатуй", "Из свежих овощей", 17),
			new Drink("Зеленый чай", "Успокаивает", 5, DrinkTypeENUM.GREEN_TEA),
			new Drink("Сок апельсиновый", "Разных вкусов", 6, DrinkTypeENUM.JUICE),
			new Drink("Сок вишневый", "Разных вкусов", 6, DrinkTypeENUM.JUICE),
			new Drink("Виски", "Односолодовый виски", 20, DrinkTypeENUM.WHISKEY),
	};

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
		name.setSize(100, 20);
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

		totalCostLabel = new JLabel("Всего: 0$");
		totalCostLabel.setFont(new Font("Arial", Font.BOLD, 20));
		totalCostLabel.setSize(200, 25);
		totalCostLabel.setLocation(20, 100);
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
		addItemButton.setSize(100, 30);
		addItemButton.setLocation(200, 120);
		addItemButton.setBackground(new Color(0x129601));
		addItemButton.setForeground(Color.white);
		addItemButton.setFocusable(false);
		mainFrame.add(addItemButton);

		addItemButton.addActionListener(e -> {
			order.add((Item) comboBox.getSelectedItem());
			refactorMainOrderTextArea();
		});

		JButton removeItemButton = new JButton("Удалить");
		removeItemButton.setSize(100, 30);
		removeItemButton.setLocation(320, 120);
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
		acceptOrderButton.setFont(new Font("Arial", Font.PLAIN, 24));
		acceptOrderButton.setSize(200, 40);
		acceptOrderButton.setLocation(20, 700);
		acceptOrderButton.setBackground(new Color(0x129601));
		acceptOrderButton.setForeground(Color.white);
		acceptOrderButton.setFocusable(false);
		mainFrame.add(acceptOrderButton);


	}

	public void refactorMainOrderTextArea() {
		Item[] currentItems = order.getItems();
		mainOrder.setText("Ваш заказ:\n");
		for (Item item : currentItems) {
			System.out.println(order);
			mainOrder.append("\n" + item.toString() + "\n");
		}
		totalCostLabel.setText("Всего: " + order.costTotal() + "$");
	}


	public static void main(String[] args) {
		InternetOrderGUI internetOrderGUI = new InternetOrderGUI(new Customer("Vladimir", "Degtyarev", 23));
	}
}
