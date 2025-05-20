import java.util.Scanner;

public class BasicSyntax_J {
        public void IsEven() {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int nextEven = (n % 2 == 0) ? n + 2 : n + 1;
            System.out.println(nextEven);

        }

    public static void main(String[] args) {
        BasicSyntax_J obj = new BasicSyntax_J();
        obj.IsEven();

    }
}
//Задача №2945. Следующее четное
//Дано целое число n. Выведите следующее за ним четное число.
// При решении этой задачи нельзя использовать условную инструкцию if и циклы.
//
//Примечание. До 01 марта 2019 г. задачу нельзя сдать на языке Паскаль.
//Входные данные
//Вводится натуральное число.
//
//Выходные данные
//Выведите ответ на задачу.
//
//Примеры
//Входные данные
//7
//Выходные данные
//8
//Входные данные
//8
//Выходные данные
//10
