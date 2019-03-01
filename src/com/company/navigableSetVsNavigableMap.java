package com.company;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class navigableSetVsNavigableMap {

    public static void main(String[] args) {

        // Creating a TreeSet which implements NavigableSet
        NavigableSet<Integer> myNavigableSet = new TreeSet<>();
        myNavigableSet.add(0);
        myNavigableSet.add(1);
        myNavigableSet.add(2);
        myNavigableSet.add(3);

        // Print the Set
        System.out.println(myNavigableSet);

        // one of the method of NavigableSet
        System.out.println(myNavigableSet.pollFirst());
        System.out.println(myNavigableSet);

        // one of the method of NavigableSet
        System.out.println(myNavigableSet.pollLast());
        System.out.println(myNavigableSet);



        // Creating a TreeMap which implements NavigableMap
        NavigableMap<String, Integer> myNavigableMap = new TreeMap<String, Integer>();

        myNavigableMap.put("A", 1);
        myNavigableMap.put("B", 2);
        myNavigableMap.put("C", 3);
        myNavigableMap.put("D", 4);

        System.out.printf(myNavigableMap.lastKey());
        System.out.printf(myNavigableMap.firstKey());




    }
}
