package com.Edward;



public class PassingArrayToMethod {
    public static void main(String[] args) {
       // printArray(new int[]{3,1,2,6,4});
        printEdt(new double[]{1.2,3.4,5.6});// invoking of passing method

    }


    // pass the array to  the method

//    public static void printArray ( int[] array){
//        for (int i = 0; i<array.length; i++){
//            System.out.println(array[i] + "");
//        }
    public static void  printEdt( double[] lucky){
        for (int i =0; i<lucky.length; i++){
            System.out.println("the values = " +lucky[i]);
        }


    }
}
