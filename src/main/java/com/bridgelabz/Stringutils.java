package com.bridgelabz;

public class Stringutils {
        public static  String reverse(String str){
            return new StringBuilder(str).reverse().toString();
        }
        public static boolean palindrome(String str){
            StringBuilder sb = new StringBuilder(str);
            String reversed = sb.reverse().toString();
            return str.equals(reversed);
        }
        public static String uppercase(String str){
            return str.toUpperCase();
        }
}
