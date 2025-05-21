import java.util.Scanner;

public class sumofSqueres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <=N; i++) {
            sum += i*i;

        }
        System.out.println(sum);
        scanner.close();
    }
}
//Задача №315. Сумма квадратов
//        По данному натуральному n вычислите сумму 12+22+...+n2.
//
//        Входные данные
//        Вводится единственное натуральное число n, не превосходящее 100
//
//        Выходные данные
//        Необходимо вывести  вычисленную сумму.
//
//        Примеры
//        Входные данные
//        2
//        Выходные данные
//        5
