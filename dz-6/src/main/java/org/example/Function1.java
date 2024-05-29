package org.example;

import java.util.ArrayList;

public class Function1 {


    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Kyiv");
        cities.add("Lviv");
        cities.add("Kharkiv");
        for (String city : cities) {
            if (city.contains("Kyiv")){
                System.out.println("True");
            }
        }
    }
}