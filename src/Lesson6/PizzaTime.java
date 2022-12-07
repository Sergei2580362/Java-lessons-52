package Lesson6;

public class PizzaTime {
    public static void main(String[] args) {
        // 28 и 24 см диаметр
        // 40 калорий
        // на сколько калорий больше в большой пицце?
        double sqrDmall = Math.PI * 24 * 24;
        double sqrBig = Math.PI * 28 * 28;
        double diff = (sqrBig - sqrDmall) * 40;
        System.out.println("Разницв в калориях = " + diff);
        String str1 = "wow";
        String str2 = "ogo"; // str1, str2 -> wow-ogo-wow
        String res = magicFunc(str1, str2);
        System.out.println(res);

    }

    public static String magicFunc(String s1, String s2) {
        return s1 + "-" + s2 + "-" + s1;
    }
}
