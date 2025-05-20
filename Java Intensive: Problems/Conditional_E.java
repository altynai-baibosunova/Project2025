import java.util.Scanner;

public class Conditional_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a>b){
            System.out.println("1");
        }if(b>a){
            System.out.println("2");
        }

    }
}
//Задача №293. Какое из чисел больше?
//Входные данные
//Даны два целых числа, каждое записано в отдельной строке.
//
//Выходные данные
//Программа должна вывести число 1, если первое число больше второго,
// число 2, если второе больше первого, или число 0, если они равны.
//
//Примеры
//Входные данные
//1
//2
//Выходные данные
//2
