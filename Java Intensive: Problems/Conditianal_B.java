import java.util.Scanner;

public class Conditianal_B {
    public void isYear() {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();


        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {

            System.out.println("Yes");

        } else {
            System.out.println("No");
        }
    }

        public static void main (String[]args){
            Conditianal_B obj = new Conditianal_B();
            obj.isYear();
        }
    }

//Задача №253. Високосный год
//Требуется определить, является ли данный год високосным.
// (Напомним, что год является високосным, если его номер кратен 4, но не кратен 100, а также если он кратен 400.)
//
//Входные данные
//Вводится единственное число - номер года (целое, положительное, не превышает 30000).
//
//Выходные данные
//Требуется вывести слово YES, если год является високосным и NO - в противном случае.
//
//Примеры
//Входные данные
//2007
//Выходные данные
//NO
//Входные данные
//2000
//Выходные данные
//YES
