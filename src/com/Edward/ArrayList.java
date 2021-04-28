
package com.Edward;

import java.util.Collections;
import java.util.LinkedList;

public class ArrayList {
    public static void main(String[] args) {

        LinkedList<String> car = new LinkedList<String>();
        car.add("aaa");
        car.add("bbb");
        car.add("ccc");
        car.add("ddd");
        car.add("eee");
        car.push("kkk");

        System.out.println(car);
        System.out.println(car.size());
        Collections.sort(car);
        System.out.println(car);

//        car.pop();
        for (int i = 0; i < car.lastIndexOf(car); i++) {

            {
                System.out.println(i + " " + car);

            }
        }
    }


    public void DisplayList() {

    }
}
