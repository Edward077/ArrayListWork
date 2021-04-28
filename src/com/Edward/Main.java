package com.Edward;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

	// ArrayList application
        String[] myElement = new String[3];
        ArrayList mylist = new ArrayList();
        mylist.add(2);
        mylist.add(4);
        mylist.add(5);
        mylist.remove(2);
        
        System.out.println("values" + mylist);
    }
}
