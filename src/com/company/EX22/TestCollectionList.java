package com.company.EX22;

import java.awt.*;
import java.util.*;

public class TestCollectionList {

    public static void main(String[] args) {

        System.out.println("\nArray List\n");

        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(76);

        System.out.println(arrayList + " Size " + arrayList.size());
        arrayList.add(65);
        System.out.println(arrayList + " Size " + arrayList.size());
        arrayList.remove(2);
        System.out.println(arrayList + " Size " + arrayList.size());
        arrayList.remove((Integer) 2);
        System.out.println(arrayList + " Size " + arrayList.size());
        Collections.sort(arrayList);
        System.out.println(arrayList + " Size " + arrayList.size());

        System.out.println("\nLinked List\n");

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(23);
        linkedList.add(643);
        linkedList.add(13453256);
        linkedList.add(76);
        System.out.println(linkedList + " Size " + linkedList.size());
        linkedList.remove((Integer) 3);
        System.out.println(linkedList + " Size " + linkedList.size());
        linkedList.remove(2);
        System.out.println(linkedList + " Size " + linkedList.size());
        Collections.sort(linkedList);
        System.out.println(linkedList + " Size " + linkedList.size());
        linkedList.clear();
        System.out.println(linkedList + " Size " + linkedList.size());
    }
}
