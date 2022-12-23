package Lessons.Lesson12;

public class ArrayTest {
    public static void main(String[] args) {
        int i = 1;
        int[] array = new int[5];
        String[] str = new String[5];
        System.out.println(array.length);
        i = array[0];
        //System.out.println(array);
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        for (int j = 0; j < str.length; j++) {
            System.out.println(str[j]);
        }
    }
}
