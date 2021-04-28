package com.Edward;

public class CoppyOfAnArray {
    public static void main(String[] args) {

        // application of the copy Array
        char[] copyFrom = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o'};

        // declear the copy array
        char[] copyTo = new char[7];

     System.arraycopy(copyFrom,0,copyTo,0,5);
        System.out.println(String.valueOf(copyTo));
    }
}
