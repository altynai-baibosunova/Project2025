import java.util.Scanner;

public class trim {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine().trim();


        System.out.println("My name is "+name);
    }
}
