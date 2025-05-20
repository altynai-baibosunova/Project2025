import java.util.Scanner;

public class Numberof_N2 {
    public void isNumber_in2(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 1;

        for (int i = 0; i < N; i++) {
            sum *= 2;

        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Numberof_N2 obj = new Numberof_N2();
        obj.isNumber_in2();

    }
}
//
//    Напишите программу, вычисляющую 2 N. Операцию возведения в степень использовать запрещено.
//
//        Входные данные
//        Вводится целое неотрицательное число N, которое не превосходит 30.
//
//        Выходные данные
//        Выведите число 2 N.
//
//        Примеры
//        Входные данные
//        4
//        Выходные данные
//        16
