package lesson4;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        String str = "test"; // (нумерация) 0 = t  1 = t  2 = s  3 = t
        System.out.println(str);
        System.out.println(str.length()); // длина строки
        System.out.println("Wow! " + str);
        System.out.println(str.charAt(1)); // печать символа по нормеру позиции в слове
        System.out.println(str.indexOf('t'));
        System.out.println(str.lastIndexOf('t'));
        System.out.println(str.indexOf("st"));
        System.out.println(str.substring(2));
        System.out.println(str.substring(1, 3));
        System.out.println(str.toUpperCase());
        System.out.println(str.replace('t', 'v'));
        System.out.println(str.startsWith("te"));
        String sumRes = str + "tt"; // str.conсat("tt");

        Scanner scanner = new Scanner(System.in);
        String readVal = scanner.nextLine();
        System.out.println(readVal);

    }
}
