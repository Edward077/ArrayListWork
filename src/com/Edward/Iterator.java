package com.Edward;
import java.util.Iterator;
import java.util.ArrayList;
class Iterator2 {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        // Application of iterator
        Iterator<String> IT = cars.iterator();

        // print the iterator to the console
        System.out.println(IT.next());

        // LOOPING THROUGH THE THE ARRAY ITERATOR
        while (IT.hasNext()) {
            System.out.println(IT.next());

            // application for removing elements

            String i = IT.next();
            if(i =="Ford") {
                IT.remove();
            }
        }
    }
}
