package com.dineshrestha;

import java.util.Date; //Date is reference type and should be imported. Since we are in com.dineshrestha package and need to import from different package we need to import it before hand.

public class Main {
    public static void main(String[] args) {
        byte age = 30;
        Date now = new Date(); //we need to allocate memory to reference type. Date variable is an instance of Date() class.
        // now.getTime()  // getTime() is a member for variable now. It returns time component of the object. Reference type has member but primmitive doesnt have member.
        long viewsCount =3_313_469_797L; //Use underscore to separate 3 digits same as comma (,) ** Use L at the last to make it long else java takes it as integer
        float price = 10.99F; // use F to convert double to float
        char letter = 'A'; // single character with single qoute, multiple chars (string) with double quote
        boolean isEligible = false;
        System.out.println(age); // shortcut = sout tab
        System.out.println(viewsCount);
        System.out.println(price);
        System.out.println(letter);
        System.out.println(isEligible);
        System.out.println(now);
    }
}