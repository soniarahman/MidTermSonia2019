package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {
     //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
     //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


    static boolean areAnnagram (char s1 [], char s2 [])
    {
         int i = s1.length;
         int j = s2.length;

         if (i != j )
              return false;
         Arrays.sort(s1);
         Arrays.sort(s2);

         for (int m= 0; m <i; m ++)
              if (s1[m] != s2[m])
                   return false;
         return true;
    }
    public static void main (String args[]){
         char s1 [] = { 'l', 'i', 's', 't', 'e', 'n'};
         char s2 [] = {'s', 'i', 'l', 'e', 'n', 't'};
         if (areAnnagram(s1,s2))
              System.out.println("Two strings are anagram");
         else
              System.out.println("Two strings aren't anagram");
 }
}


