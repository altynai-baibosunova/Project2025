import java.util.Scanner;

public class BasicSyntex_E {
    public void IsStopHere() {
        Scanner scanner = new Scanner(System.in);
        int v_speed = scanner.nextInt();
        int t_time = scanner.nextInt();

        int line = v_speed * t_time;
        int carstop = (line % 109 + 109) % 109;
        System.out.println(carstop);
    }



    public static void main(String[] args) {
        BasicSyntex_E obj = new BasicSyntex_E();
        obj.IsStopHere();
    }

    }



//Задача №2940. МКАД
//Длина Московской кольцевой автомобильной дороги —109 километров.
// Байкер Вася стартует с нулевого километра МКАД и едет со скоростью v километров в час.
// На какой отметке он остановится через t часов?
//
//Входные данные
//Программа получает на вход значения v и t. Если v>0, то Вася движется в положительном направлении по МКАД,
// если же значение v<0, то в отрицательном.
//
//Выходные данные
//Программа должна вывести целое число от 0 до 108 — номер отметки, на которой остановится Вася.
//
//Примеры
//Входные данные
//60
//2
//Выходные данные
//11
//Входные данные
//-1
//1
//Выходные данные
//108