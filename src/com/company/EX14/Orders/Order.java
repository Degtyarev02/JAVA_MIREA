package com.company.EX14.Orders;

import com.company.EX14.Customer.Customer;
import com.company.EX14.Item;

public interface Order {
    boolean add(Item item);
    String[] itemsName();
    int itemsQuantity();
    int itemsQuantity(String itemName);
    int itemsQuantity(Item item);
    Item[] getItems();
    boolean remove(String itemName);
    boolean remove(Item item);
    int removeAll(String itemName);
    int removeAll(Item item);
    Item[] sortedItemsByCostDesc();
    int costTotal();
    Customer getCustomer();
    void setCustomer(Customer customer);

}
