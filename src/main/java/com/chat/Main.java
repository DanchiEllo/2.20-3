package com.chat;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(15) + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nПовторяющиеся элементы и их количество:");

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                if (entry.getValue() % 10 >= 5 || entry.getValue() % 10 == 0 || entry.getValue() % 10 == 1) {
                    System.out.println("Число \'" + entry.getKey() + "\' встречается " + entry.getValue() + " раз");
                } else {
                    System.out.println("Число \'" + entry.getKey() + "\' встречается " + entry.getValue() + " раза");
                }

            }
        }
    }
}
