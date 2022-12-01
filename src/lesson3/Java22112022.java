package lesson3;

// перевод чисел в двоичную, восьмиричную, десятичную системы

public class Java22112022   {
    public static void main(String[] args) {
        int val = 123;
        System.out.println(Integer.toBinaryString(val));
        // System.out.println(Integer.toOctalString(val));
        // System.out.println(Integer.toHexString(val));
        val = val>>1; // = val/2 (такого рода действия могут быть нужны в компаниях топящих за оптимизацию, ускорение процессов)
        System.out.println(Integer.toBinaryString(val));
        val = val<<1; // = val*2
        System.out.println(Integer.toBinaryString(val));
    }
}
