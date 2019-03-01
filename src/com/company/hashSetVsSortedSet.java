package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class hashSetVsSortedSet {

    public static void main(String[]args)
    {
        HashSet<String> mySet = new HashSet<String>();

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
        System.out.println("List contains Lahore or not:" + mySet + "\n\n");


        // Create the sorted set
        SortedSet<String> mySortedSet= new TreeSet<String>();

        // Add elements to the set
        mySortedSet.add("Moeed");
        mySortedSet.add("Raza");
        mySortedSet.add("Khan");

        // Iterating over the elements in the set
        for (Object element : mySortedSet) {
            // Get element
            System.out.println(element.toString());
        }



    }
}
