package com.dineshrestha;

public class EscapeSequences {
    public static void main(String[] args) {

        String message = "Hello \"Dinesh\""; // adding double quote to string
        // c:\Windows\... adding backslash
        String message1 = "c:\\Windows\\..."; //even though we have 2 backslashes output will have only 1.
        // new line
        String message2 = "My name is Dinesh Shrestha. \nI am learning Java programming\"";
        String message3 = "\tMy name is Dinesh Shrestha. I am learning Java programming. \nI am having fun learning Java. This language is awesome. \nI am enjoying it a lot.\""; //adding tab
        System.out.println(message);
        System.out.println(message1);
        System.out.println(message2);
        System.out.println(message3);
    }
}
