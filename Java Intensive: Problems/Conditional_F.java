import java.util.Scanner;

public class Conditional_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a>b && a>c){
            System.out.println(a);
        } if (b>a && b>c){
            System.out.println(b);
        } if (c>b && c>a){
            System.out.println(c);
        }
    }
}
//Задача №294. Максимум из трех
//Входные данные
//Даны три целых числа, каждое записано в отдельной строке.
//
//Выходные данные
//Выведите наибольшее из данных чисел (программа должна вывести ровно одно целое число).
//
//Примеры
//Входные данные
//1
//2
//3
//Выходные данные
//3