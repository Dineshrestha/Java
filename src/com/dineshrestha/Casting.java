package com.dineshrestha;

public class Casting {
    public static void main(String[] args){
        // Implicit casting
        // byte > short > int > long > float > double

        // Integer to integer
        short x =1;
        int y = x+2;

        // double to float
        double x1 = 1.1;
        double y1 = x1+2; //Java automaticllay cast this int 2 to double

        // double to int
        double x3 = 1.1;
        int y3 = (int)x3 +1; // we need to implecitly cast int to x3

        // we cannot cast a string to an integer

        System.out.println(y);
        System.out.println(y1);
        System.out.println(y3);
    }
}
