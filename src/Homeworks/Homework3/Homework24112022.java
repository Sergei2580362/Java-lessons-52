package Homeworks.Homework3;

import java.util.Scanner;

public class Homework24112022 {
    public static void main(String[] args) {

        //Задание 1
        String str = "I love Java Lessons !";
        System.out.println(str);

        //Задание 2
        System.out.println(str.charAt(0));

        //Задание 4
        System.out.println(str.contains("love"));

        //Задание 5
        System.out.println(str.replace('o', 'a'));

        //Задание 6
        System.out.println(str.toUpperCase());

        //Задание 7
        System.out.println(str.toLowerCase());

        //Задание 8
        System.out.println(str.substring(str.indexOf('L'), str.lastIndexOf('!')));

        //Задание 10
        System.out.println(str.lastIndexOf('L'));

        //Задание 11
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "!");

        //Задание 12
        System.out.println("What's your name?");
        String name2 = sc.nextLine();
        System.out.println("Your name begins from letter - " + name2.charAt(0));

        //Задание 13
        double doubleNumber = 59.976;
        int number = (int) doubleNumber;
        System.out.println(number);

        //Задание 14
        int intNumber = 475;
        short number2 = (short) intNumber;
        System.out.println(number2);

    }
}
