package math.problems;


import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
    Scanner sc = new Scanner(System.in);
        System.out.println("pls enter the number whose factorial to be found....");
        int num=sc.nextInt();
        //int n=5;
        System.out.println("The factorial of the given "+num+" number is : "+factorial(num));

    }
    public static int factorial(int n){
        if(n==0)
            return  1;
        else
        return (n * factorial(n-1));
    }
}
