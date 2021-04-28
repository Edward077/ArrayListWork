package com.Edward;

import java.util.Arrays;

public class SmallestNumberInArray {
    public static void main(String[] args) {

        int[] a ={0,1,3,4,-1};
        int[]b ={23,45,67,34,};
        System.out.println("The smallest number is = " +smallest(a,5));
        System.out.println("The smallest number is = " +smallest(b,4));

    }
    public static int smallest(int[]a,int total){
        Arrays.sort(a);
        return a[0];

    }
}
