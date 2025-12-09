package com.gloriane;

import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        System.out.println("======= Ex1 =======");
        List<String> daysOfWeek = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        System.out.println(daysOfWeek);

        System.out.println("======= Ex2 =======");
        List<String> days = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        for (String day : days) {
            System.out.println(day);
        }
    }
}
