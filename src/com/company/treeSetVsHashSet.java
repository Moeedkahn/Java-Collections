package com.company;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class treeSetVsHashSet {

    public static void main(String[]args) {
        // Creating a tree set
        TreeSet<String> myTreeSet = new TreeSet<String>();

        // Add elements to the set
        myTreeSet.add("Moeed");
        myTreeSet.add("Raza");
        myTreeSet.add("Khan");

        // Iterating over the elements in the set
        for (Object element :  myTreeSet) {
            // Get element
            System.out.println(element.toString());
        }



        // Creating a HashSet
        HashSet<String> myHashSet = new HashSet<String>();
        // Adding elements into HashSet usind add()
        myHashSet .add("Karachi");
        myHashSet .add("Lahore");
        myHashSet .add("Lahore");// adding duplicate elements
        myHashSet .add("Islamabad");


        // Removing items from HashSet using remove()
        myHashSet .remove("Islamabad");
        System.out.println("\n\nList after removing Islamabad:"+myHashSet );

        // Displaying the HashSet
        System.out.println(myHashSet);
        System.out.println("List contains Lahore or not:" + myHashSet  + "\n\n");

        for (Object element :  myHashSet) {
            // Get element
            System.out.println(element.toString());
        }
    }
}
