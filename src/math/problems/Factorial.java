package math.problems;

import java.sql.SQLOutput;

/**
 * Created by mrahman on 04/02/18.
 */

/* Question:
 * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
 * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
 *
 */
public class Factorial {
    //Recursion Factorial

    public static int fact(int n){
        if (n == 0)
            return 1;
        else
            return (n * fact(n - 1));
    }

    public static void main(String[] args) {
        int i, f = 1;
        int number = 5;
        f = fact(number);
        System.out.println("Factorial of" +" "+number+ " " +"is" + " " + f);

        System.out.println("************************************************");
       //Iteration Factorial
        int j,factorial=1;
        int num=5;
        for(j=1;j<=number;j++){
            factorial=factorial*j;
        }
        System.out.println("Factorial of "+num+" is: "+factorial);
    }
}

