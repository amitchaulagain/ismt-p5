package com.company.collection.map;

import com.company.Fruit;

import java.util.*;

public class MapExample {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<>();
        System.out.println(map.isEmpty());

        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");

        Set<Map.Entry<Integer, String>> keySet = map.entrySet();


        //Elements can traverse in any order
        for (Map.Entry m : keySet) {
            System.out.println(m.getKey() + " " + m.getValue());
        }


        System.out.println(map.get(102));


        System.out.println(map.isEmpty());
        map.replace(102, "Ram");

        System.out.println(map.get(102));


        Map<String, Fruit> newMap = new HashMap<String, Fruit>();


        Fruit fruit1 = new Fruit();
        fruit1.setWeight(200);
        fruit1.setName("apple");


        Fruit fruit2 = new Fruit();
        fruit2.setWeight(100);
        fruit2.setName("banana");


        List<Fruit> fruits = new ArrayList<>();

        fruits.add(fruit1);
        fruits.add(fruit2);


        newMap.put("first", fruit1);
        newMap.put("second", fruit2);


        System.out.println(newMap.get("first").getName() + "-----" + newMap.get("first").getWeight());


        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("first", 1);
        hashMap.put("second", "Apple");
        hashMap.put("third", fruit1);

        hashMap.put("third", fruits);


        System.out.println(hashMap.get("first"));

        System.out.println(hashMap.get("second"));

        String hhh = (String) hashMap.get("second");



        hashMap.putAll(newMap);



        hashMap.remove("third");


        for (Map.Entry m : hashMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }




}
