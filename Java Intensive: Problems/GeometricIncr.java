import java.util.Scanner;

public class GeometricIncr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        int n = scanner.nextInt();

        double sum = 1.0;
        double temp = 1.0;

        for (int i=0; i<n; i++){
            temp *= a;
            sum += temp;
        }
        System.out.println(sum);
        scanner.close();
    }

}
//Задача №319. Геометрическая прогрессия
//        По данному действительному числу a и натуральному n вычислите сумму 1+a+a2+...+an,
//        не используя формулу суммы геометрической прогрессии и операцию возведения в степень.
//        Время работы программы должно быть пропорционально n.
//
//        Входные данные
//        Вводятся 2 числа - a и n.
//
//        Выходные данные
//        Необходимо вывести  значение суммы.
//
//        Примеры
//        Входные данные
//        2
//        2
//        Выходные данные
//        7

