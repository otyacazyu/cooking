package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> cookingList = List.of("カレーライス", "オムライス", "餃子");

        cookingList.forEach(System.out::println);
    }
}