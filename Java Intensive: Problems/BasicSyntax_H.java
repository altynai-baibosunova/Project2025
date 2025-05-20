import java.util.Scanner;

public class BasicSyntax_H {
    public void IsSecondNum(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int result = (num/10)%10;
        System.out.println(result);
    }

    public static void main(String[] args) {
        BasicSyntax_H obj = new BasicSyntax_H();
        obj.IsSecondNum();
    }
}
//Задача №2943. Число десятков
//Дано неотрицательное целое число.
// Найдите число десятков в его десятичной записи (то есть вторую справа цифру его десятичной записи).
//
//Входные данные
//Вводится неотрицательное целое число.
//
//Выходные данные
//Выведите ответ на задачу.
//
//Примеры
//Входные данные
//179
//Выходные данные
//7