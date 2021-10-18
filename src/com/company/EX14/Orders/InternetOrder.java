package com.company.EX14.Orders;

import com.company.EX14.Customer.Customer;
import com.company.EX14.Drink;
import com.company.EX14.Item;

import java.util.Arrays;
import java.util.HashSet;

public class InternetOrder implements Order{
    private int size = 0;
    private int totalCost = 0;
    private ListNode head;
    private ListNode tail;
    private Customer customer;

    public InternetOrder(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean add(Item item) {
        if(item == null){
            return false;
        }
        if (size == 0) {
            head = new ListNode(null, item, null);
            tail = head;
        } else {
            ListNode secondLast = tail;
            tail = new ListNode(secondLast, item, null);
            secondLast.next = tail;
        }
        size++;
        totalCost += item.getPrice();
        return true;
    }

    @Override
    public String[] itemsName() {
        HashSet<String> hashNames = new HashSet<>(size);
        String[] names = new String[size];
        ListNode tmp = head;
        for(int i = 0; i < size; i++){
            hashNames.add(tmp.item.getName());
            tmp = tmp.next;
        }

        return hashNames.toArray(names);
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        ListNode tmp = head;
        for(int i = 0; i < size; i++){
            if(tmp.item.getName().equals(itemName)){
                count++;
            }
            tmp = tmp.next;
        }
        return count;
    }

    @Override
    public int itemsQuantity(Item item) {
        return itemsQuantity(item.getName());
    }

    @Override
    public Item[] getItems() {
        Item[] items = new Item[size];
        ListNode tmp = head;
        for(int i = 0; i < size; i++){
            items[i] = tmp.item;
            tmp = tmp.next;
        }
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        ListNode tmp = head;
        ListNode finding = null;
        for(int i = 0; i < size; i++){
            if(tmp.item.getName().equals(itemName)){
                finding = tmp;
            }
            tmp = tmp.next;
        }
        if(finding == null){
            return false;
        }
        ListNode findingPrev = finding.previous;
        ListNode findingNext = finding.next;
        if(findingPrev == null){
            head = findingNext;
        } else if(findingNext == null){
            tail = findingPrev;
        } else {
            findingPrev.next = findingNext;
            findingNext.previous = findingPrev;
        }
        size--;
        return true;
    }

    @Override
    public boolean remove(Item item) {
        return remove(item.getName());
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;
        ListNode tmp = head;
        int tmpSize = size;
        for(int i = 0; i < tmpSize; i++){
            if((tmp!= null) && (tmp.item.getName().equals(itemName))){
                remove(tmp.item);
                count++;
            }
            tmp = tmp.next;
        }
        return count;
    }

    @Override
    public int removeAll(Item item) {
        return removeAll(item.getName());
    }

    @Override
    public Item[] sortedItemsByCostDesc() {
        Item[] items = getItems();
        Arrays.sort(items);
        return items;
    }

    @Override
    public int costTotal() {
        return totalCost;
    }

    @Override
    public Customer getCustomer() {
        return this.customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    private static class ListNode {
        private ListNode previous;
        private Item item;
        private ListNode next;

        public ListNode(ListNode previous, Item item, ListNode next) {
            this.previous = previous;
            this.item = item;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Item item1 = new Drink("Vodka", "vodka");
        Item item2 = new Drink("Wine", "vodka");
        Item item3 = new Drink("Beer", "vodka");
        Item item4 = new Drink("Beer", "vodka");
        Order order = new InternetOrder(new Customer(23));
        order.add(item1);
        order.add(item2);
        order.add(item3);
        order.add(item4);
        order.removeAll(item3);
        String[] name = order.itemsName();
        System.out.println(Arrays.toString(name) + " " + order.itemsQuantity());
    }

}
