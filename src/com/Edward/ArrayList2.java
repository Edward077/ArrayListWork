package com.Edward;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {

        // The difference between a built-in array and an ArrayList in Java,
        // is that the size of an array cannot be modified
        // (if you want to add or remove elements to/from an array, you have to create a new one).
        // While elements can be added and removed from an ArrayList whenever you want.
        // The syntax is also slightly different:

//        ArrayList<Integer> numbers = new ArrayList<Integer>();// Creating an array List
//        numbers.add(1);
//        numbers.add(5);
//        numbers.add(3);
//        numbers.add(7);
//        numbers.add(2);
//        numbers.remove(2);// to remove an element from the arrayList
//        numbers.set(2,4); //
//        System.out.println(numbers);
//
//
//        //Sort an ArrayList
//        Collections.sort(numbers);
//        System.out.println(numbers);
//
//        // loopint through the array
//        for (int i=0; i<numbers.size(); i++);
//        System.out.println(numbers.size());
//        System.out.println(numbers.get(2));




        //Elements in an ArrayList are actually objects.
        // In the examples below, we created elements (objects) of type "String".
        // Remember that a String in Java is an object (not a primitive type).
        // To use other types, such as int, you must specify an equivalent wrapper class:
        // Integer. For other primitive types, use: Boolean for boolean, Character for char,
        // Double for double, etc:

        List<String> stringObject = new ArrayList<String>();
        stringObject.add("AAA");
        stringObject.add("BBB");
        stringObject.add("CCC");
        stringObject.add("DDD");
        stringObject.add("EEE");
        System.out.println(stringObject);
        Collections.sort(stringObject);// sorting the arrayList

        // looping the ArrayList using the foreach condition
        for (String i:stringObject);
        System.out.println(stringObject);

    }



}
