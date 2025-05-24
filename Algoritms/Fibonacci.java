public class Fibonacci {
    public static int fibonnacciSimple(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonnacciSimple(n - 1) + fibonnacciSimple(n - 2);

    }

    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        System.out.println(fibonnacciSimple(4));
    }
}

//slowest time complexity
