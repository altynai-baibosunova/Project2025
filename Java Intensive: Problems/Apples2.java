import java.util.Scanner;

public class Apples2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int result = K/N;
        System.out.println(result);

    }
}
