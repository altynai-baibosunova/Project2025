import java.util.Stack;

public class wee17_Stack_Class {
    public static int fibon(int n){


        if(n==0) return 0;
        if(n==1) return 1;
         return  fibon(n-1) + fibon(n-2);     //5(5-1) + 5(5-2) = 20+15


    }

    public static void main(String[] args) {

        int number = 5;
        System.out.println(fibon(number));
    }
    }

//6.0 Draw call stack for our Fibonacci program with n = 5