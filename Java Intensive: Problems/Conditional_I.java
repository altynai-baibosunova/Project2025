import java.util.Scanner;

public class Conditional_I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (a==b && c>=d){
            System.out.println("YES");

        }else {
            System.out.println("NO");
        }
    }
}
//Задача №256. Ферзь
//Требуется определить, бьет ли ферзь, стоящий на клетке с указанными координатами (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.
//
//Входные данные
//Вводятся четыре числа: координаты ферзя и координаты другой фигуры. Координаты - целые числа в интервале от 1 до 8.
//
//Выходные данные
//Требуется вывести слово YES, если ферзь может побить фигуру за 1 ход, в противном случае вывести слово NO
//
//Примеры
//Входные данные
//1
//1
//8
//1
//Выходные данные
//YES
//Входные данные
//3
//2
//8
//3
//Выходные данные
//NO