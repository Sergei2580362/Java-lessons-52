package Lessons.Lesson10;

public class Palindrom {
    public static void main(String[] args) {
        //арозаупаланалапуазора
        String str = "арозаупаланалапуазора"; // length - 1

        System.out.println(isPalindrom(str));

    }

    public static boolean isPalindrom(String str) {
        boolean isPalindrom = true;
        for (int i = 0; i < str.length() / 2; i++) {
            char firstPart = str.charAt(i);
            char secondPart = str.charAt(str.length() - 1 - i);
            if (firstPart != secondPart) {
                isPalindrom = false;
                break;
            }
        }
        return isPalindrom;
    }
}
