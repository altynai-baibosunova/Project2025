public class overloadingMethod {
    // Overloaded methods for sum
    public int sum(int a, int b) {
        // Your code here
       // int result1 = Math.addExact(a,b);
       // return result1;
       return a+b;
    }

    public double sum(double a, double b) {
        // Your code here
        return a+b;
    }

    public static void main(String[] args) {
        overloadingMethod obj = new overloadingMethod();
        System.out.println("sum of ints: "+obj.sum(4,8));
        System.out.println("sum of doubles: "+obj.sum(2.2,7.8));

    }



}

