package com.dineshrestha;

public class Strings {
    public static void main(String[] args) {
        String message = " Hello World" + "!!";
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("e"));
        System.out.println(message.indexOf("sky"));
        System.out.println(message.replace("!", "*")); // target and replacement are parameters (holes that we define in our methods and ! and * are arguments (actual values we pass to these methods)
        System.out.println(message); // strings cannot be modified
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim()); // trims unnecessary spaces
    }
}
