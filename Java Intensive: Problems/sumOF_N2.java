import java.util.Scanner;

public class sumOF_N2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int sum = 1;
        int temp = 1;

        for (int i = 1; i <= N; i++) {
            temp *= 2;
            sum += temp;
        }
        System.out.println(sum);
    }
}
//Задача №353. Сумма степеней
//Входные данные
//Вводится натуральное число N, которое не превосходит 30.
//
//Выходные данные
//Вычислите 1+2+22+23+…+2 N.
//
//Операцией возведения в степень пользоваться запрещено
//
//Примеры
//Входные данные
//4
//Выходные данные
//31
