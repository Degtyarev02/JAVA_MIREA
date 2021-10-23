package com.company.EX14;

import com.company.EX14.Customer.Address;
import com.company.EX14.Customer.Customer;
import com.company.EX14.Exceptions.IllegalTableNumber;
import com.company.EX14.Exceptions.OrderAlreadyAddedException;
import com.company.EX14.Orders.Order;
import com.company.EX14.Orders.OrderManager;
import com.company.EX14.Orders.TableOrder;
import com.company.EX14.Orders.TableOrdersManager;

import java.util.Arrays;
import java.util.Scanner;

public class RestaurantSimulation {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("=====Добро пожаловать в наш ресторан!=====\n     Пожалуйста авторизируйтесь");
        /*System.out.print("Введите имя: ");
        String name = in.next();
        System.out.print("\n Введите фамилию: ");
        String secondName = in.next();
        System.out.println("\n Введите ваш возраст: ");
        Integer age = in.nextInt();
        System.out.println("Введите ваш адрес в формате: город,улица,индекс,номер_дома,номер_квартиры,строение");

        String address = in.next();
        Address address1 = new Address(address);

        Customer me = new Customer(name, secondName, age, address1);*/
            TableOrdersManager orderManager = new TableOrdersManager();
            int tableNumber = orderManager.freeTableNumber();

            System.out.printf("Проходите за %s столик \n", tableNumber);


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

            for (int i = 0; i < items.length; i++) {
                System.out.println(i + ". " + items[i]);
            }
            Order myOrder = null;
            try {
                myOrder = new TableOrder();
                int choice = 0;
                while (true) {
                    choice = in.nextInt();
                    myOrder.add(items[choice]);
                }
            } catch (IndexOutOfBoundsException e) {
                assert myOrder != null;
                System.out.println("Ваш заказ сформирован: " + Arrays.toString(myOrder.itemsName()) + ". Хотите что то изменить? Да/Нет");
            }

            String answer = in.next();
            if (answer.equals("Да")) {
                System.out.println("1. Добавить блюдо \n 2. Удалить блюдо");
                int chooseEdit = in.nextInt();
                switch (chooseEdit) {
                    case 1:
                        try {
                            myOrder = new TableOrder();
                            int choice = 0;
                            while (true) {
                                choice = in.nextInt();
                                myOrder.add(items[choice]);
                            }
                        } catch (IndexOutOfBoundsException e) {
                            assert myOrder != null;
                            System.out.println("Ваш заказ сформирован: " + Arrays.toString(myOrder.itemsName()) + ". Хотите что то изменить? Да/Нет");

                        }
                        break;
                    case 2:
                        System.out.println("Выберите блюдо для удаления: " + Arrays.toString(myOrder.itemsName()));
                        String nameOfItem = in.nextLine();
                        myOrder.removeAll(nameOfItem);
                }
            } else {
                System.out.println("Ваш заказ сформирован: " + Arrays.toString(myOrder.itemsName()) + ". Общая стоимость: " + myOrder.costTotal() + "\n Обслуживание следующего столика \n");

                try {
                    orderManager.add(myOrder, tableNumber);
                } catch (IllegalTableNumber | OrderAlreadyAddedException e) {
                    e.printStackTrace();
                }

            }

        }
    }
}
