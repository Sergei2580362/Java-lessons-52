package Lessons.Lesson12;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        String[] str = new String[10];
        str[5] = "fsd";
        str[9] = "fas";
        int sum = 0;
        for (int i = 0; i <str.length; i++) {
            if (str[i] != null) {
                sum++;
            }
        }
        System.out.println(sum);


        Random random = new Random();
        int evenNumbers = 0;
        int[] randomNumbers = new int[15];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(10);
            if (randomNumbers[i] % 2 == 0) {
                evenNumbers++;
            }
        }
        System.out.println(Arrays.toString(randomNumbers));
        System.out.println(evenNumbers);
    }

}
