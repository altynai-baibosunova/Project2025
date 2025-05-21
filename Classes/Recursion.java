public class Recursion {
    // Iterative and Recursive factorial functions
    public int iterativeFactorial(int n) {
        // Your code here
        int result=1;
        for(int i=2; i<=n; i++){
            result *= i;
        }
          return result;
        }


    public int recursiveFactorial(int n) {
        // Your code here
        if(n<=1){
            return 1;
        }else{
            return n*recursiveFactorial(n-1);
        }
    }

    public static void main(String[] args) {
        Recursion r = new Recursion();
        System.out.println("Iterator: "+r.iterativeFactorial(5));
        System.out.println("Recursive: "+r.recursiveFactorial(5));
    }

    }

