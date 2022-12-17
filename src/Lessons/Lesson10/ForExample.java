package Lessons.Lesson10;

public class ForExample {
    public static void main(String[] args) {
        int i0 = 1;
        int i2 = 2;
        int i3 = 3;
        // -H-
        int i9 = 10;

        int sum = 0;
        for (int i = 0; i <= 10; i++) { // i++ -> i=i+1
            //         for (int i = 0; i <= 10; i+=2) { // i+=2 -> i=i+2
            sum += i;
            System.out.println(i);
        }
        System.out.println("Сумма " + sum);
    }
}
