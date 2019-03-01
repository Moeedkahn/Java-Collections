package com.company;

import java.util.ArrayList;
import java.util.Vector;

public class arrayListVsVector {

    public static void main (String[] args)
    {
        // creating an ArrayList
        ArrayList<String> myList = new ArrayList<String>();


        myList.add("Hello World");
        myList.add("Karachi Kings");
        myList.add("Lahore Qalanders");

        System.out.println(myList.get(0));

        // ArrayList will remove the element at index 0
        // will move all the other elements accordingly
        myList.remove(0);

        System.out.println(myList.get(0));

        // creating Vector
        Vector<String> myVector = new Vector<String>();
        myVector.addElement("Islamabad");
        myVector.addElement("Peshawar");
        myVector.addElement("Quetta");

        // traversing elements using Enumeration
        System.out.println(myVector.get(0));

        // vector will remove the element at index 0
        // will move all the other elements accordingly
        myVector.remove(0);

        System.out.println(myVector.get(0));

    }
}
