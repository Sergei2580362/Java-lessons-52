package Lesson7;

public class MethodExamples {
    public static void main(String[] args) {
        int res = Integer.valueOf("123");
        res++; // результат +1
        String str = "123" + "123"; // результат будет 123123
        System.out.println(res);
        System.out.println(str);

        String first = "125";
        String second = "126";
        int result = sum(first, second);
        System.out.println(first + "+" + second + "=" + result);

    //мой вариант без метода:
        // int a = Integer.valueOf(first);
        // int b = Integer.valueOf(second);
        // int sum = a + b;
        // System.out.println(sum);

    }

    // метод, который принимает 2 строки и возвращает 1 число - int -> сумма двух строк переведенных в int
    public static int sum(String first, String second){
        int a = Integer.valueOf(first);
        int b = Integer.valueOf(second);
        return a + b;
    }
}
