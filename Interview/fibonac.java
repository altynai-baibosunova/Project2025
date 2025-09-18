public class fibonac {
    public int fib(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fib(n-1)+ fib(n-2);
    }

    public static void main(String[] args) {
        int result = new fibonac().fib(4);
        System.out.println(result);
    }
}
//4-1 + 4-2   3+2 5
//3-1 + 3-2   2+1 3
//2-1 + 2-2   1+0 1