package Lessons.Lesson9;

import java.util.Random;

public class HouseBuilder {

    public static int MAX_HIGH = 10; // Постоянная переменная для всей программы! - выводим в начало нашей программы!

    public static void main(String[] args) {
        Random random = new Random();
        boolean isHasRoof = random.nextBoolean();
        boolean isHasWall = random.nextBoolean();
        int high = random.nextInt(15);
        // printF:
        // %s строка (чтобы мы не подали как параметр он будет переведен в строку)
        // %b - boolean
        // %d - digit input - число на входе
        // %n - перенос строки
        System.out.printf("Крыша есть? %b, Стены есть? %b, высота : %d%n", isHasRoof, isHasWall, high);
        // мы принимаем объект если есть крыша, есть стены и высота меньше 10
        if (isHasRoof && isHasWall && high <= MAX_HIGH) {
            System.out.println("Принимаем");
        } else if (!isHasRoof) {
            System.out.println("Нет крыши");
        } else if (!isHasWall) {
            System.out.println("Нет стены");
        } else if (high > MAX_HIGH) {
            System.out.println("Не соответствует высота");
        } else {
            System.out.println("Everything is ok");
        }
    }
}
