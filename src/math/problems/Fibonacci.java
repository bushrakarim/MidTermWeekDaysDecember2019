package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int a = 0;
        int b = 1;
        int n = 1;
        System.out.println("The 40 fibonacci numbers are :");
        while (n <= 40) {
            System.out.print(" " + a);
            a = a + b;
            b = a - b;
            n++;

        }

    }
}
