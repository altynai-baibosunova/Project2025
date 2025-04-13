import java.util.Scanner;

public class next_previous {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int nextNumber = number+1;
        int previousNumber = number-1;

        System.out.println("The next number for the number "+number+" is "+nextNumber+".");
        System.out.println("The previous number for the number "+number+" is "+previousNumber+".");
    }
}
