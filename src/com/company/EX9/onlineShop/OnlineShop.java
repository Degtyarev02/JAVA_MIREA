package com.company.EX9.onlineShop;

import java.util.ArrayList;

public class OnlineShop {
    static ArrayList<Person> buyers = new ArrayList<>();

    //Имитируем работу БД
    public static void setBuyers() {
        buyers.add(new Person("Ivan", "123898139324"));
        buyers.add(new Person("Dmitriy", "154682397931"));
        buyers.add(new Person("Vladislav", "2145799347561"));
        buyers.add(new Person("Mikhail", "2349543756499"));
        buyers.add(new Person("Petr", "743262478313"));
    }

    public static void buy(Person buyer) throws BadTINException {

        Person tmp = null;

        for (Person i : buyers) {
            if (i.getName().equals(buyer.getName())) {
                tmp = i;
            }
        }
        //Выбрасываем исключение если ИНН недействителен
        if (!buyer.getTIN().equals(tmp.getTIN())) {
            throw new IllegalArgumentException();
            //Иначе покупка совершилась
        } else {
            System.out.println("Покупка совершена");
        }

    }

    public static void main(String[] args) {
        setBuyers();
        Person me = new Person("Ivan", "123895139324");

        try {
            buy(me);
            //Ловим ошибку
        } catch (IllegalArgumentException e) {
            throw new BadTINException(me.getTIN() + " Bad TIN", e);
        }
    }

}
