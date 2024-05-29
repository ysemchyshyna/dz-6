package org.example;

import java.util.ArrayList;
import java.util.HashSet;

public class Function2 {

    public static void main (String[] args) {
        ArrayList<String> cities1 = new ArrayList<>();
        cities1.add("Lviv");
        cities1.add("Yaremche");
        cities1.add("Lviv");
        HashSet<String> mySet = new HashSet<>();
        mySet.addAll(cities1);
        for (String set : mySet){
            System.out.println(set);
        }
    }
}
