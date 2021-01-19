package com.knoldus;

public class StringFunctions {
    public static String reverse(String word) {
        StringBuilder reverse_str=new StringBuilder(word);
        reverse_str.reverse();
        return reverse_str.toString();
    }
    public static int findLength(String word) {
        return word.length();
    }


}
