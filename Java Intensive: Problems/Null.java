import java.util.Scanner;

public class Null {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if(num == 0){
                count++;
            }

        }
        System.out.println(count);
    }
}
//Задача №345. Нули
//        Входные данные
//        Вводится число N, а затем N чисел.
//
//        Выходные данные
//        Подсчитайте и выведите, сколько среди данных N чисел нулей.
//
//        Примеры
//        Входные данные
//        3
//        1
//        2
//        3
//        Выходные данные
//        0
