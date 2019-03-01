package com.company;

import java.util.ArrayList;
import java.util.List;

public class arrayVsList {

    public static void main (String[] args) {
        // declares an Array of integers.
        int[] myArray;

        // allocating memory for 5 integers.
        myArray = new int[5];

        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;

        // accessing the elements of the specified array
        for (int i = 0; i < myArray.length; i++)
            System.out.println(myArray[i] + "\n");


        // Creating an ArrayList which implements List
        List<String> myList=new ArrayList<>();
        myList.add("Hello World");
        myList.add("Karachi Kings");
        myList.add("Lahore Qalanders");

        System.out.println(myList.get(0));

        // ArrayList will remove the element at index 0
        // will move all the other elements accordingly
        myList.remove(0);

        System.out.println(myList.get(0));
    }
}
