public class A_509_FibonacciNum {
    public int fib(int n) {
        if(n<=1) return n;

        return fib(n-1)+fib(n-2);
    }
}
