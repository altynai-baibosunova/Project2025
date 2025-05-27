public class Fibonacci {
    public static int fibonnacciSimple(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonnacciSimple(n - 1) + fibonnacciSimple(n - 2);

    }

    public static void main(String[] args) {
        Fibonacci1 obj = new Fibonacci1();
        System.out.println(fibonnacciSimple(6));
    }
}

//slowest time complexity
//1,1,2,3,5,8,