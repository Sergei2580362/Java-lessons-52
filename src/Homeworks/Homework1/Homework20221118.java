package Homeworks.Homework1;

public class Homework20221118 {
    //Задание 1
    public static void main(String[] args) {
        char g = 'G';
        int i = 89;
        byte b = 4;
        short s = 56;
        float f = 4.7333436f;
        double d = 4.355453532;
        long l = 12121L;

    //Задание 2
        int a = 555;
        System.out.println(a);

    //Задание 3
        int n = 10;
        int nn = n * n;
        System.out.println("Значение переменной в квадрате = " + nn);

    int n0 = 0;
    int n1 = 1;
    int n2 = 2;
    int n3 = 3;
    int n4 = 4;
    int n5 = 5;
    int n6 = 6;
    int n7 = 7;
    int n8 = 8;
    int n9 = 9;
    int NSum = (n0 + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9) / 10;
    int mod = (n0 + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9) % 10;
        System.out.println("Среднее арифметическое = " + NSum);
        System.out.println("Дробная часть = " + mod);

    //Задание 4
        int PriceA = 1000;
        int PriceB = 500;
        int Discount = 100;
        int SumAB = PriceA + PriceB - Discount;
        System.out.println("Цена за 2 товара со скидкой = " + SumAB + " р.");
        System.out.println("Скидка составила = " + Discount + " р.");

    }
}

