package com.Edward;

import java.util.Arrays;

public class CalMaxAndMinArrays {
    public static void main(String[] args) {

        int[] mylist = {1,-1, 23,45,78,100,60,89, 98,12,67};

        int total =0;
        int min = mylist[0];
        int max = mylist[0];
        int avg= 0;



//        int[] myList = new int[5];
//        myList[0]= 12;
//        myList[1]= 23;
//        myList[2]= 45;
//        myList[3]= 78;
//        myList[4]=90;

//        int total = (myList[0]+myList[1]+myList[2]+myList[3]+myList[4]);

//        int  min = mylist[0];
//        int max = mylist[0];

       // int total = myList[]
//        int[] total = new int[[myList[0]+myList[1]+myList[2]+myList[3]+myList[4]];
//
//       int total = (myList[0]+myList[1]+myList[2]+myList[3]+myList[4);

        // introduction of the for each loop

       // for (int i :mylist){


        for (int i=0; i<mylist.length; i++){

            avg = total/mylist[i];
//            avg =total/2;

            total+= mylist[i];

            if (mylist[i] < min) {
                min = mylist[i];
            }

            if (mylist[i]> max){
                max= mylist[i];
            }else {
                mylist[i]=1;
            }
        }
        System.out.println("the total is " + total);
        System.out.println("the min " + min);
        System.out.println("the max " + max);
        System.out.println("the avg " + avg);


        // Application of a switch statement

        switch ( avg){
            case 8:
                System.out.println("Very good");
            break;
            default:
                System.out.println("wrong input");
                break;



        }

//        for (int i = 0; i<10; i++){
//            if (mylist[i]> max) max=mylist[i];
//            if (mylist[i]< min) min=mylist[i];

//        }
//       System.out.println("the max value is:  " +max);
//        System.out.println("the min value is  " + min);



//
//
//        int[] min = [0];
//        int[] max =[0];
//
//
//
        //int[] myList = {12,23,23,45,45,56};
    }
}
