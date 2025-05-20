import java.util.Scanner;

public class Increase {
    public void isIncresing() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();


        for (int x = 0; x < 1000; x++) {
            long value = a * (long) x * x * x + b * (long) x * x + c * (long) x + d;

            if (value == 0) {
                System.out.print(x + " ");
            }
        }
        scanner.close();
    }

    public static void main (String[]args){
        Increase obj = new Increase();
        obj.isIncresing();
    }
}
//Задача №348. Уравнение по возрастанию
//        Входные данные
//        Вводятся 4 числа: a, b, c и d.
//
//        Выходные данные
//        Найдите все целые решения уравнения ax3 + bx2 + cx + d = 0 на отрезке [0,1000] и выведите их в порядке возрастания.
//        Если на данном отрезке нет ни одного решения, то ничего выводить не нужно.
//
//        Примеры
//        Входные данные
//        1
//        -5
//        6
//        0
//        Выходные данные
//        0 2 3
