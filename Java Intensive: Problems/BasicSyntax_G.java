import java.util.Scanner;

public class BasicSyntax_G {
    public void Numbers(){
        Scanner scanner = new Scanner(System.in);
        int numInput = scanner.nextInt();

        int result = numInput/10;

        System.out.println(result);
    }

    public static void main(String[] args) {
        BasicSyntax_G obj = new BasicSyntax_G();
        obj.Numbers();
    }
}
//Задача №2942. Число десятков двузначного числа
//Дано двузначное число. Найдите число десятков в нем.
//
//Входные данные
//Вводится двухзначное число.
//
//Выходные данные
//Выведите ответ на задачу.
//
//Примеры
//Входные данные
//42
//Выходные данные
//4