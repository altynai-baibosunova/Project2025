import java.util.Scanner;

public class Factorial2 {
    public void isFactNum() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        Factorial2 obj = new Factorial2();
        obj.isFactNum();
    }
}



//Задача №351. Факториал
//        Вычислите N! ("эн-факториал") – произведение всех натуральных чисел от 1 до N ( N!=1∙2∙3∙…∙ N ).
//
//        Входные данные
//        Вводится единственное число N – натуральное, не превосходит 12.
//
//        Выходные данные
//        Выведите полученное значение N!
//
//        Примеры
//        Входные данные
//        3
//        Выходные данные
//        6
