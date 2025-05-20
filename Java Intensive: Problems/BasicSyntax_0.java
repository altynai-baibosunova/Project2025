import java.util.Scanner;

public class BasicSyntax_0 {
    public void costOFfoof(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int total_dollars = a * 100 + b;
        int total_cents = b * n;

        int dollars = total_dollars/100;
        int cents = total_cents%100;
        System.out.println(dollars+" "+cents);
    }

    public static void main(String[] args) {
        BasicSyntax_0 obj = new BasicSyntax_0();
        obj.costOFfoof();
    }
}

//Задача №2951. Стоимость покупки
//Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.
//
//Входные данные
//Программа получает на вход три числа: a, b, n.
//
//Выходные данные
//Программа должна вывести два числа: стоимость покупки в рублях и копейках.
//
//Примеры
//Входные данные
//10
//15
//2
//Выходные данные
//20 30
//Входные данные
//2
//50
//4
//Выходные данные
//10 0
