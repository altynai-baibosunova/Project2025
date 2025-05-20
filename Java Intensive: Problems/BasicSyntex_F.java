import java.util.Scanner;

public class BasicSyntex_F {
    public void NaturalNumber(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int naturalN = num%10;
        System.out.println(naturalN);

    }

    public static void main(String[] args) {
        BasicSyntex_F obj = new BasicSyntex_F();
        obj.NaturalNumber();
    }
}
//Задача №2941. Последняя цифра
//Дано натуральное число. Выведите его последнюю цифру.
//
//Входные данные
//Вводится натуральное число.
//
//Выходные данные
//Выведите ответ на задачу.
//
//Примеры
//Входные данные
//179
//Выходные данные
//9
