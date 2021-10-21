package com.company.EX14.Orders;

import com.company.EX14.Item;

import java.util.HashMap;
import java.util.Map;

public interface OrderManager {
    Map<String, Order> ordersHashMap = new HashMap<>();
    int itemsQuantity(String itemName);
    int itemsQuantity(Item item);
    Order[] getOrders();
    int ordersCostSummary();
}
