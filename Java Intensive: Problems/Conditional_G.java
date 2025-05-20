import java.util.Scanner;

public class Conditional_G {
    public void isStep() {
        Scanner scanner = new Scanner(System.in);
        int a_ladiya = scanner.nextInt();
        int b_ladiya = scanner.nextInt();

        int c_figure = scanner.nextInt();
        int d_figure = scanner.nextInt();


        if (a_ladiya == b_ladiya && c_figure == d_figure) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
        public static void main (String[]args){
            Conditional_G obj = new Conditional_G();
            obj.isStep();
        }
    }

//Задача №254. Ладья
//Требуется определить, бьет ли ладья, стоящая на клетке с указанными координатами (номер строки и номер столбца),
// фигуру, стоящую на другой указанной клетке.
//
//Входные данные
//Вводятся четыре числа: координаты ладьи (два числа) и координаты другой фигуры (два числа),
// каждое число вводится в отдельной строке. Координаты - целые числа в интервале от 1 до 8.
//
//Выходные данные
//Требуется вывести слово YES, если ладья сможет побить фигуру за 1 ход и NO - в противном случае.
//
//Примеры
//Входные данные
//1
//1
//2
//2
//Выходные данные
//NO
//Входные данные
//1
//1
//2
//1
//Выходные данные
//YES