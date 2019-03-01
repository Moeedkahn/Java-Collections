package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class listVsSet {
    public static void main (String[] args) {


        // Creating an ArrayList which implements List
        List<String> myList = new ArrayList<>();
        myList.add("Hello World");
        myList.add("Karachi Kings");
        myList.add("Lahore Qalanders");

        System.out.println(myList.get(0));

        // ArrayList will remove the element at index 0
        // will move all the other elements accordingly
        myList.remove(0);
        System.out.println(myList.get(0)+ "\n\n");


        // Creating a HashSet which implements Set
        Set<String> mySet = new HashSet<String>();

        // Adding elements into HashSet usind add()
        mySet.add("Karachi");
        mySet.add("Lahore");
        mySet.add("Lahore");// adding duplicate elements
        mySet.add("Islamabad");


        // Removing items from HashSet using remove()
        mySet.remove("Islamabad");
        System.out.println("List after removing Islamabad:"+mySet);

        // Displaying the HashSet
        System.out.println(mySet);
        System.out.println("List contains Lahore or not:" + mySet );



    }
}
