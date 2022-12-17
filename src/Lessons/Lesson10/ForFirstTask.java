package Lessons.Lesson10;

public class ForFirstTask {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 2 == 0) { // делится на 3 и делится на 2
                System.out.println(i);
                sum += i; // в конце считает сумму всех чисел
                count++;
                if (count == 3) { // считаем первые 3 варианта
                    break;
                }
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
    }
}
