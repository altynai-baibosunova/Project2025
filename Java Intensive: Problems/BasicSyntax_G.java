import java.util.Scanner;

public class BasicSyntax_G {

    public void isHowManyApplesLeft() {
        Scanner scanner = new Scanner(System.in);
        int N_students = scanner.nextInt();
        int K_apples = scanner.nextInt();

        int remainder = K_apples % N_students;

        System.out.println(remainder);

        }



    public static void main(String[] args) {
        BasicSyntax_G obj = new BasicSyntax_G();
        obj.isHowManyApplesLeft();
        
    }
}
//Задача №2939. Дележ яблок - 2
//N школьников делят K яблок поровну, неделящийся остаток остается в корзинке. Сколько яблок останется в корзинке?
//
//Входные данные
//Программа получает на вход числа N и K.
//
//Выходные данные
//Программа должна вывести искомое количество яблок.
//
//Примеры
//Входные данные
//3
//14
//Выходные данные
//2
