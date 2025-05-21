import java.util.Scanner;

public class BasicSyntex_I {
    public void ReturnSumNum(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); //179

        int a = num%10; // 1
        int b = (num/10)%10; //7
        int c = num/100; //9

        int sum = a+b+c;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        BasicSyntex_I obj = new BasicSyntex_I();
        obj.ReturnSumNum();
    }
}
//Задача №2944. Сумма цифр
//Дано трехзначное число. Найдите сумму его цифр.
//
//Входные данные
//Вводится трехзначное число.
//
//Выходные данные
//Выведите ответ на задачу.
//
//Примеры
//Входные данные
//179
//Выходные данные
//17

//    int c = num % 10;          // Единицы
//    int b = (num / 10) % 10;   // Десятки
//    int a = num / 100;         // Сотни