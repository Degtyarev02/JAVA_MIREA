package com.company.EX14;

import com.company.EX14.Customer.Address;
import com.company.EX14.Customer.Customer;
import com.company.EX14.Items.Dish;
import com.company.EX14.Items.Drink;
import com.company.EX14.Items.DrinkTypeENUM;
import com.company.EX14.Items.Item;
import com.company.EX14.Orders.TableOrdersManager;

import java.util.Scanner;

public class RestaurantSimulation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("=====Добро пожаловать в наш ресторан!=====\n     Пожалуйста авторизируйтесь");
		System.out.print("Введите имя: ");
		String name = in.next();
		System.out.print("\n Введите фамилию: ");
		String secondName = in.next();
		System.out.println("\n Введите ваш возраст: ");
		Integer age = in.nextInt();
		System.out.println("Введите ваш адрес в формате: город,улица,индекс,номер_дома,номер_квартиры,строение");

		String address = in.next();
		Address address1 = new Address(address);

		Customer me = new Customer(name, secondName, age, address1);
		TableOrdersManager orderManager = new TableOrdersManager();
		int tableNumber = orderManager.freeTableNumber();

		System.out.printf("Проходите за %s столик", tableNumber);


		System.out.println("Выберете блюда и напитки: ");
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


	}
}
