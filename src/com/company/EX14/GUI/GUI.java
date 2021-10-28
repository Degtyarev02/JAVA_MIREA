package com.company.EX14.GUI;

import com.company.EX14.Items.Dish;
import com.company.EX14.Items.Drink;
import com.company.EX14.Items.DrinkTypeENUM;
import com.company.EX14.Items.Item;
import com.company.EX14.Orders.InternetOrderManager;
import com.company.EX14.Orders.OrderManager;
import com.company.EX14.Orders.TableOrdersManager;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
	public static final Item[] ITEMS = {
			new Dish("Салат Цезарь", "Нарезан лучше, чем римский полководец", 25),
			new Dish("Стейк на гриле", "Прожарка на выбор", 30),
			new Dish("Суп из форели", "Еще вчера плавала у берегов Норвегии", 23),
			new Dish("Раттатуй", "Из свежих овощей", 17),
			new Dish("Наполеон", "Неизменен с 1812 года", 5),
			new Dish("Пицца чили", "Острый как кинжал", 12),
			new Drink("Зеленый чай", "Успокаивает", 5, DrinkTypeENUM.GREEN_TEA),
			new Drink("Сок апельсиновый", "Разных вкусов", 6, DrinkTypeENUM.JUICE),
			new Drink("Сок вишневый", "Разных вкусов", 6, DrinkTypeENUM.JUICE),
			new Drink("Виски", "Односолодовый виски", 20, 40.0, DrinkTypeENUM.WHISKEY),
			new Drink("Corona extra", "Кто-то сказал семья?", 10, 4.7, DrinkTypeENUM.BEER),
			new Drink("Вода", "Для веганов", 1, DrinkTypeENUM.WATER),
			new Drink("ЭКспрессо", "С ноткой грамматического кретинизма", 2, DrinkTypeENUM.COFFEE),
	};
	public static InternetOrderManager internetOrderManager = new InternetOrderManager();
	public static TableOrdersManager tableOrderManager = new TableOrdersManager();

	public static void main(String[] args) {
		JFrame frame = new JFrame("Test");
		frame.setSize(280, 200);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setBackground(new Color(0XFFFFFF));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel name = new JLabel("Добро пожаловать в наш ресторан");
		name.setSize(500, 30);
		name.setLocation(10, 10);

		JLabel label = new JLabel("Выберите способ оформления заказа: ");
		label.setBounds(10, 50, 300, 20);


		JButton button = new JButton("Table");
		button.setSize(100, 30);
		button.setLocation(130, 70);
		button.setBackground(new Color(0x129601));
		button.setForeground(Color.white);
		button.setFocusable(false);

		JButton button1 = new JButton("Internet");
		button1.setSize(100, 30);
		button1.setLocation(10, 70);
		button1.setBackground(new Color(0x129601));
		button1.setForeground(Color.white);
		button1.setFocusable(false);


		frame.add(name);
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
