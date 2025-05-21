import java.util.Scanner;

public class Remainder {
    public void isNumberDividedBy_d(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for (int i = a; i <=b ; i++) { //count from a to b   2,3,4,5
            int remaindr = 0;
            if(i % d == c){  // |2(d)   2/2;  2/3; 2/4; 2/5;
              if(remaindr==c){ // 0
                  System.out.print(i+ " "); //0; 0;
              }
            }
        }
    }
    public static void main(String[] args) {
        Remainder obj = new Remainder();
        obj.isNumberDividedBy_d();

    }
}
//Задача №334. Остаток
//        Входные данные
//        Вводятся 4 числа: a, b, c и d.
//
//        Выходные данные
//        Выведите все числа на отрезке от a до b, дающие остаток c при делении на d. Если таких чисел не существует, то ничего выводить не нужно.
//
//        Примеры
//        Входные данные
//        2
//        5
//        0
//        2
//        Выходные данные
//        2 4
