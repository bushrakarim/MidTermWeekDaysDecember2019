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
        //for 6 layers of pyramid....
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");  //print empty space
            }
            for (int j = 1; j < i + 1; j++) {  //number of asterisk
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}






