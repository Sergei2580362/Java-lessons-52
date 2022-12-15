package Lessons.Lesson7;

import java.util.Random;

public class MethodTest {
    public static void main(String[] args) {
        System.out.println(getRandomStudent());
    }

    //    int i = 3;
    //    int j = 4;
    //    swap(i, j);
    //    System.out.println(i);
    //    System.out.println(j);

    // метод выбора студента

    public static int getRandomStudent(){
        Random random = new Random();
        return random.nextInt(10);

    }

    // метод который принимает 2 числа и должен поменять местами эти 2 числа
    // first = [3] second = [4] temp = [3]
    public static void swap(int first, int second) {
        int temp = first;
        first = second;
        second = temp;

    }

}
