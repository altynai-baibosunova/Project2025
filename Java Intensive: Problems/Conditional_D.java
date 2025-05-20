import java.util.Scanner;

public class Conditional_D {
    public void isNumber(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(num>1){
            System.out.println("1");
        }if (num<0){
            System.out.println("-1");
        }if (num==0){
            System.out.println("0");
        }
    }
    public static void main(String[] args) {
      Conditional_D obj = new Conditional_D();
      obj.isNumber();

    }
}
//Задача №2959. Знак числа
//В математике функция sign(x) (знак числа) определена так:
//sign(x) = 1,   если x > 0,
//sign(x) = -1, если x < 0,
//sign(x) = 0,   если x = 0.
//
//Для данного числа x выведите значение sign(x).
//Входные данные
//Вводится число x.
//
//Выходные данные
//Выведите ответ на задачу.
//
//Примеры
//Входные данные
//179
//Выходные данные
//1