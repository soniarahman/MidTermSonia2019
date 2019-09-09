package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String s1 , rev = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        s1 = sc.nextLine();

        int length = s1.length();

        for (int i = length-1; i >= 0; i--)
            rev = rev + s1.charAt(i);

        if (s1.equals(rev))
            System.out.println(s1 + " "+ "is a palindrome");
        else
            System.out.println(s1 + "isn't a palindrome");




    }
}
