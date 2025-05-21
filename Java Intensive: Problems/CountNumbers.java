import java.util.Scanner;

public class CountNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int NumZero = 0;
        int Positive= 0;
        int Negative = 0;

        for (int i=0; i<N; i++){
            int num= scanner.nextInt();

            if(num==0){
                NumZero++;
            }
            else if(num>0){
                Positive++;
            }
            else {
                Negative++;
                }

            }

        System.out.println(NumZero+" "+Positive+" "+Negative);
        scanner.close();
    }


}



//Задача №346. Подсчет чисел
//        Подсчитайте, сколько среди данных N чисел нулей, положительных чисел, отрицательных чисел.
//
//        Входные данные
//        Вводится число N, а затем N целых чисел.
//
//        Выходные данные
//        Необходимо вывести сначала число нулей, затем число положительных и отрицательных чисел.
//
//        Примеры
//        Входные данные
//        5
//        28
//        0
//        0
//        0
//        0
//        Выходные данные
//        4 1 0
