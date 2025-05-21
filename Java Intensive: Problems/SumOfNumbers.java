import java.util.Scanner;

public class SumOfNumbers {

public void IsSumNum(){
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int sum = 0;
    for (int i = 0; i <N ; i++) {
        int num = scanner.nextInt();
        sum += num;
    }
    System.out.println(sum);
    scanner.close();
    }

    public static void main(String[] args) {
        SumOfNumbers obj = new SumOfNumbers();
        obj.IsSumNum();
    }
}

//
//Задача №343. Сумма чисел
//        Вычислите сумму данных N натуральных чисел.
//
//        Входные данные
//        Вводится число N, а затем N чисел, сумму которых необходимо вычислить.
//
//        Выходные данные
//        Выведите единственное число - сумму введенных чисел.
//
//        Примеры
//        Входные данные
//        3
//        9
//        5
//        1
//        Выходные данные
//        15
