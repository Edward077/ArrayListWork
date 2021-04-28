package com.Edward;

public class MultipleDimissionalArray {
    public static void main(String[] args) {


        // Application of the tinary Diemissional Array
//        int[][] myMarks = {{12, 34, 56, 34},{1,2,3}, {45, 60, 25, 21}};
//
//        for (int i =0; i< myMarks.length; i++) {
//            System.out.println("============");
//            for (int j = 0; j < myMarks[i].length; j++) {
//                System.out.println(myMarks[i][j]);
//            }
//        }

        int[]scores ={2,3,4,4};
        Class c =scores.getClass();
        String name =c.getName();
        System.out.println(name);
    }
}
