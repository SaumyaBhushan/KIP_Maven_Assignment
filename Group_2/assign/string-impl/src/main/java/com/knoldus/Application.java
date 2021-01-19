package com.knoldus;
import java.util.Scanner;
public class Application {
    public static void main(String... x)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your string : ");
        String word = scan.nextLine();
        System.out.println("Reverse of your string is: "+ StringFunctions.reverse(word));
        System.out.println("Length of your string is: "+StringFunctions.findLength(word));
    }
}