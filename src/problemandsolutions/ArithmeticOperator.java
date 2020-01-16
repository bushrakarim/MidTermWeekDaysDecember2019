package problemandsolutions;

import java.util.Scanner;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.


    public static void main(String[] args) {
        double number1;
        double number2;
        Scanner sc = new Scanner(System.in);
        System.out.println("pls enter the first number..");
        number1 = sc.nextDouble();
        System.out.println("pls enter the second number..");
        number2 = sc.nextDouble();
        System.out.println("The addition of the numbers are : " + (number1 + number2));
        System.out.println("The subtraction of the numbers are : " + (number1 - number2));
        System.out.println("The multiplication of the numbers are : " + (number1 * number2));
        System.out.printf("The division of the numbers are : %.3f" , (number1 / number2));
    }


}
