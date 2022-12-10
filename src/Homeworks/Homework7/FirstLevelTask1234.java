package Homeworks.Homework7;

import java.util.Random;
import java.util.Scanner;

public class FirstLevelTask1234 {

    // First level:
    //
    // #1) С консоли вводится число - возраст человека
    // после чего вызывается метод, который возвращает ответ можно ли этому человеку смотреть фильм, у фильма
    // ограничение по возрасту не меньше 18.
    // Пример:
    // на входе число 19 пишется Можно идти смотреть кино
    // на входе число 7 пишется Нельзя идти смотреть кино

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваш возраст ");
        int age = scan.nextInt();
        yesOrNo (age);


        // 2) напишите программу, которая принимает 1 число - год (можно с помощью Scanner или с помощью Random)
        // и выводит високосный год или нет
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите год ");
        int year = scan1.nextInt();
        if (year % 4 == 0) {
            System.out.println("Данный год високосный");
        } else {
            System.out.println("Данный год не является високосным");
        }


        // 3)Покупатель приходит в магазин печенья, 1 печенье стоит 0.5 евро
        // Напишите программу которая спрашивает у покупатель сколько он хочет купить печенья, после этого с помощью
        // Scanner считывается число сколько печенья хочет купить покупатель, после спрашивается сколько денег у
        // покупателя и считывается число (сколько денег у покупателя), программа должна написать может ли купить
        // столько печенья за такие деньги, например
        // покупатель хочет купить 10 печенек, у него 4 евро ответ  нельзя
        // покупатель хочет купить 12 печенек, у него 8 евро ответ  можно
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Сколько печенья вы хитете купить?");
        double cookie = scan2.nextInt();
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Сколько у вас денег?");
        double money = scan3.nextInt();
        if (money/cookie >= 0.5) {
            System.out.println("Можно");
        } else {
            System.out.println("Нельзя");
        }


        // 4) напишите программу, которая говорит выпал орел или решка
        // true - орел
        // false -решка
        // используйте Random и метод nextBoolean,
        Random random = new Random();
        boolean flipACoin = random.nextBoolean();
        if (flipACoin == true) {
            System.out.println("Орёл");
        } else {
            System.out.println("Решка");
        }

    }

    private static void yesOrNo(int age) {
        if (age > 100 || age < 0) {
            System.out.println("Невалидный бал");
        } else if (age < 18) {
            System.out.println("Нельзя идти смотреть кино");
        } else {
            System.out.println("Можно идти смотреть кино");
        }
    }


}



