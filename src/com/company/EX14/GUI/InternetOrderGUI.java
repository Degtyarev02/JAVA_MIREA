package com.company.EX14.GUI;

import com.company.EX14.Customer.Customer;
import com.company.EX14.Items.Dish;
import com.company.EX14.Items.Drink;
import com.company.EX14.Items.DrinkTypeENUM;
import com.company.EX14.Items.Item;

import javax.swing.*;
import java.awt.*;

public class InternetOrderGUI {
	JFrame mainFrame;
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

	public InternetOrderGUI(Customer customer){
		setFrame();

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

		JComboBox comboBox = new JComboBox();

	}

	public static void main(String[] args) {
		InternetOrderGUI internetOrderGUI = new InternetOrderGUI(new Customer("Vladimir", "Degtyarev", 23));
	}
}
