package com.mkyong.config.core;

/**
 * Created by deepali on 2/4/2015.
 */
public class ClassA {
    public int getValue() {
        int value=0;
        boolean setting = true;
        String title="Hello";
   /*     if (true || (setting && title == "Hello")) {
            System.out.println("1st if");
            return 1;
        }*/
        if (value == 1 & title.equals("Hello")) {
            System.out.println("1st if");
            return 2;
        }
        return 0;
    }
}
