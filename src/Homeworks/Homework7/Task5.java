package Homeworks.Homework7;

import java.util.Random;

// 5) В стране А ездят машины с номерами от 1 до 10000, в городе Б большая проблема с парковками по выходным,
// чтобы уменьшить количество пробок, власти решили пускать в город по выходным только легковые машины с
// четными номерами, напишите программу, которая принимает на вход два параметра: номер машины и isLorry
// (грузовая машина или нет), в результате программа выводит можно заезжать машине или нет в город

// First & Second level

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int carNumber = random.nextInt(10000);
        boolean isLorry = random.nextBoolean();
        System.out.println("Номер авто " + carNumber);
        if (isLorry == true) {
            System.out.println("Грузовой автомобиль");
        } else {
            System.out.println("Легковой автомобиль");
        }
        if (carNumber % 2 == 0 && !isLorry) {
            System.out.println("Въезд в город разрешён");
        } else {
            System.out.println("Въезд в город запрещён");
        }
        if (isLorry == true) {
            System.out.println("Грузовым автомобилям въезд по выходным запрещён");
        } else if (carNumber % 2 != 0) {
            System.out.println("Легковым автомобилям с нечетными номерами въезд по выходным запрещён");
        }

        // Метод 2 - Уровень 1
        Random random2 = new Random();
        int number = random2.nextInt(1, 10000);
        boolean isLorry2 = random2.nextBoolean();
        System.out.printf("Номер %s грузовик? %s\n", number, isLorry2); // метод printF (%s %s\n
        // машина легковая = не грузовая и номер машины четный
        if (!isLorry2 && number % 2 == 0) {
            System.out.println("можно");
        } else {
            System.out.println("нельзя");
        }
    }
}
