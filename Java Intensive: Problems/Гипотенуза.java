import java.util.Scanner;

public class Гипотенуза {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();


        //for (int i = 0; i <c ; i++) {
            double c = Math.sqrt (a*a+b*b);

            System.out.println(c);
            scanner.close();

        }





    }
//}
