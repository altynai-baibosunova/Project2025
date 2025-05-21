import java.util.Scanner;

public class Conditianal_A {
    public void BiggestNum() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int perm = Math.max(a,b);
        System.out.println(perm);
        }

    public static void main(String[] args) {
        Conditianal_A obj = new Conditianal_A();
        obj.BiggestNum();
    }
}
//Задача №292. Максимум из двух чисел
//Входные данные
//Даны два целых числа, каждое число записано в отдельной строке.
//
//Выходные данные
//Выведите наибольшее из данных чисел.
//
//Примеры
//Входные данные
//1
//2
//Выходные данные
//2