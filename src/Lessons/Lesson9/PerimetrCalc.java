package Lessons.Lesson9;

import java.util.Scanner;

public class PerimetrCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую фигуру будем считать?");
        String figureType = scanner.nextLine(); // пример: КвадРаТ
        switch (figureType.toLowerCase()) { // преведёт любой вариант нашего ввода в нижний регистр (итог: квадрат)
            case "квадрат" -> {
                System.out.println("введите сторону квадрата");
                int size = scanner.nextInt();
                System.out.println(size * 4);
            }
            case "круг" -> {
                System.out.println("введите радиус");
                int r = scanner.nextInt();
                System.out.println(2 * r * Math.PI);
            }
            case "треугольник" -> {
                System.out.println("введите 1 сторону треугольника");
                int first = scanner.nextInt();
                System.out.println("введите 2 сторону треугольника");
                int second = scanner.nextInt();
                System.out.println("введите 3 сторону треугольника");
                int third = scanner.nextInt();
                System.out.println(first + second + third);
            }
            default -> System.out.println("Эту фигуру я не знаю");
        }
    }
}
