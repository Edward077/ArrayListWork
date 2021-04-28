package com.Edward;

public class Autoboxing {
    public static void main(String[] args) {

        // application of the Autoboxing
        //Autoboxing is the automatic conversion that the Java compiler makes between the primitive types
        // and their corresponding object wrapper classes.
        // For example, converting an int to an Integer, a double to a Double,

        char a = 'A';

        // Create an object and pass the character a

//        Character c = new Character(a); // This is call Autoboxing
//        Integer c = new Integer(a);
//        System.out.println(c);

        // Another example of Autoboxing
        int[] li ={1,2,3,4};
        int sum = 0;
        for (Integer i: li)
            if (i % 2 == 0)
                sum += i;
        System.out.println(sum);




        // Application of unboxing
        //Converting an object of a wrapper type (Integer) to its corresponding primitive (int) value is called unboxing.
        // The Java compiler applies unboxing when an object of a wrapper class is:
        //
        //Passed as a parameter to a method that expects a value of the corresponding primitive type.
        //Assigned to a variable of the corresponding primitive type.

        Integer c = new Integer(43);
        int d = c;
        System.out.println(d);


        Integer myInt = 24;
        Character myChar= 'A';
        Double doubleNum = 2.6;
        System.out.println(myInt);
        System.out.println(myChar);
        System.out.println(doubleNum);

        System.out.println("====================");
        Integer myInt2 = 24;
        Character myChar2= 'A';
        Double doubleNum2 = 2.6;
        System.out.println(myInt2.intValue());
        System.out.println(myChar2.charValue());
        System.out.println(doubleNum.doubleValue());

        System.out.println("=======================");
        // to string method
        Integer myIntt = 100;
        String myString = myInt.toString();
        System.out.println(myString.length());







    }

}
