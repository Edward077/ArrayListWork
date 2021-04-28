package com.Edward;

public class Array {
    public static void main(String[] args) {
        // Decleration of arrays
        int[] myArray;
        double[] myNuber;

        // creating an array
        int[] scores = new int[10];
        int [] marks = { 23,45,67,78,89,90};

        // looping through the array list
        for( int i =0; i<scores.length; i++);


        // Multiple Array
        int[][] num ={{2,4,3,},{3,5,6}};
        // to access any element in the array reference the array the array and the element
//        int s =num [1][3];
//        System.out.println(s);

        System.out.println("============");

        // loop the two arrays

        for (int i =0; i<num.length; ++i) {
            for (int j = 0; j < num[i].length; ++j) {
                System.out.println(num[i][j]);
            }
        }
    }
}
