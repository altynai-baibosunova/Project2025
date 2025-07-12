class Fibonacci1 {

        public static int fib(int n) {
            if(n<=1){
                return n;
            }else{
                return fib(n-1)+fib(n-2);
            }

        }
        public static void main(String[] arg){
            Fibonacci1 obj = new Fibonacci1();

            System.out.println(fib(2));
        }

    }

