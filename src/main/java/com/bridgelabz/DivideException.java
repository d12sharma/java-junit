package com.bridgelabz;

public class DivideException {
    public static  int divide(int a , int b){
        if(b==0){
            throw new ArithmeticException();
        }
        return a / b;
    }
}
