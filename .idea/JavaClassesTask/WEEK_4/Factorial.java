package WEEK_4;

public class Factorial {// Recursive function for factorial
    public static void main (String[] args){
        System.out.println(factorial(5));
    }
    public static int factorial(int n) {
        // Your code here
        if (n == 1) {
            return 1;

        } else {
            return n * factorial(n - 1);
        }

    }
    }
