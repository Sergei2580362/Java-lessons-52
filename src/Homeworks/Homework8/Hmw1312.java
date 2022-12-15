package Homeworks.Homework8;

import java.util.Scanner;

public class Hmw1312 {

    // First level:

    // 1) В первом подъезде квартиры с 1 по 20. Во втором с 21 по 48. В третьем с 49 по 90.
    // Пользователь вводит номер квартиры. Программа должна указать в каком подъезде находится данная квартира.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер квартиры");
        int numRoom = scanner.nextInt();
        if (numRoom > 90 || numRoom <=0) {
            System.out.println("Неверный номер квартиры");
        } else if (numRoom < 21) {
            System.out.println("1-й подъезд");
        } else if (numRoom < 49) {
            System.out.println("2-й подъезд");
        } else if (numRoom < 91) {
            System.out.println("3-й подъезд");
        }

        // 2) Переменная num может принимать 4 значения: 1, 2, 3 или 4.
        // Если она имеет значение '1', то в переменную result запишем 'зима', если имеет значение '2' –
        // 'весна' и так далее. Решите задачу через switch-case.

        int num = 3;
        switch (num) {
            case 1 -> System.out.println("Зима");
            case 2 -> System.out.println("Весна");
            case 3 -> System.out.println("Лето");
            case 4 -> System.out.println("Осень");
            default -> System.out.println("not supported");
        }

        // 3)  В переменной month лежит какое-то число из интервала от 1 до 12.
        // Определите в какую пору года попадает этот месяц (зима, лето, весна, осень).

        int month = 7;
        switch (month) {
            case 1, 2, 12 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("not supported");
        }
    }
}
