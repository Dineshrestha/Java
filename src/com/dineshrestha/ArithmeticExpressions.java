package com.dineshrestha;

public class ArithmeticExpressions {
    public static  void main(String[] args) {
        int result = 10+3; // Arithmetic Exp for intger
        System.out.println(result);

        double result1 = (double)10 / (double)3; // Arithmetic Exp for double
        System.out.println(result1);

        // increment operators
        int x = 1;
        //x++; //This can be done using post-fix  and pre-fix as ++x;
        int y = x++; //But using ++ in pre-fix and post-fix can get different results
        int y1 = ++x;
        // x = x+2;
        // x +=2;  These two line give same results. this type of operator is called agmunted or compound assignment operators
        System.out.println(x);
        System.out.println(y);
        System.out.println(y1);

        // Order of operators
        // int x = 10+3*2; result = 16. Use parenthesis to change the order e.g.: (10+3)*2 = 26.
    }
}
