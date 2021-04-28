package com.Edward;

public class ReturningArray {
    public static void main(String[] args) {
        int [] scores = { 1,2,3,4,5,6};
        //INVOKE THE METHOD
        Displace(scores);
        System.out.println("====================");

        Displace( Return(scores));


    }
    public static void Displace(int[] input){
        for (int i = 0; i<input.length; i++){
            System.out.println(input[i]);
        }

    }
    public static int[] Return(int[] marks){
        int[] reverseMarks = new int[marks.length];

        // apply the for loop
        for (int i=0, j=reverseMarks.length-1; i<marks.length; i++, j--){
            reverseMarks[j]= marks[i];
        }
        return reverseMarks;

    }
}
