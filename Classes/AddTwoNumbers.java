import java.util.function.DoubleToIntFunction;

public class AddTwoNumbers {
    // Function to add two integers
    public static int addTwoNumbers(int a, int b) {
        // Your code here
      // int sum = a+b;
        int result = Math.addExact(a,b);
        return result;
    }

    public static void main(String[] args) {

        System.out.println(addTwoNumbers(2,2));

    }
}

