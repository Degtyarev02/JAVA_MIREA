package com.company.EX26;

import java.util.*;

public class Solution {



    public static <T> ArrayList<T> newArrayList(T... elements) {
        ArrayList<T> res = new ArrayList<>();
        Collections.addAll(res, elements);

        return res;
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        return new HashSet<>(Arrays.asList(elements));
    }

    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        if (keys.size() != values.size())
            throw new IllegalArgumentException();

        HashMap<K, V> res = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            res.put(keys.get(i), values.get(i));
        }

        return res;
    }
    public static void main(String[] args) {
        ArrayList<Integer> tst = newArrayList (10, 20, 30, 40, 30);
        HashSet<Integer> tst1 = newHashSet (10, 20, 30, 40, 40);
        HashMap<Integer, Integer> tst2 = newHashMap(tst, tst);
        System.out.println(tst);
        System.out.println(tst1);
        System.out.println(tst2);
    }
}
