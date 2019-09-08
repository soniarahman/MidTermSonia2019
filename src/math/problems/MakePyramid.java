package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        int rows = 6, k = 0;
        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.println(" ");

            }
            while (k != 2 * i-1) {
                System.out.println("* ");
                ++k;
            }
            System.out.println();

        }


    }
}



