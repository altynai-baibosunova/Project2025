//import java.util.Scanner;
//
//public class Inf_310 {
//    public static int Sqrfit(int n) {
//        Scanner scanner = new Scanner(System.in);
//        int sqrt = (int) Math.floor(Math.sqrt(n));
//        boolean is_prime = true;
//
//        for (int i = 2; i <= sqrt; i++) {
//            if (n % i == 0) {
//                is_prime = false;
//                break;
//            }
//        }
//            return;
//
//        System.out.println(is_prime ? "prime" : "composite");
//    }
//}
//

//Задача №310. Проверка на простоту
//Ввод и вывод данных производится через стандартные потоки ввода-вывода.
//Проверьте, является ли число простым.
//
//Входные данные
//Вводится одно натуральное число n не превышающее 2000000000 и не равное 1.
//
//Выходные данные
//Необходимо вывести  строку prime, если число простое, или composite, если число составное.
//
//Примеры
//Входные данные
//5
//Выходные данные
//prime