import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number is: ");
        int number = scanner.nextInt();

        if(number %5 ==0 && number %3==0) {
            System.out.println("Fizz Buzz");
        }
        else if(number %5 == 0){
            System.out.println("Fizz");
        }
        else if(number %3 ==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(number);
        }

        }
    }

