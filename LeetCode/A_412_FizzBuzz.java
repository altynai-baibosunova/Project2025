import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A_412_FizzBuzz {
    public static List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if(i%3==0 || i%5==0) {
                list.add("FizzBuzz");
            }else if(i%3==0){
                list.add("Buzz");
            }else if(i%5==0){
                list.add("Fizz");
            }else{
                list.add("Number");
            }

        }
        return list;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System .in);
        int number = scanner.nextInt();
        List<String> result = fizzBuzz(number);

        System.out.println(result);
    }

}
