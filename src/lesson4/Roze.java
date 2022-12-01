package lesson4;

public class Roze {
    public static void main(String[] args) {
        int i = 4; // 5
        int b = i; // 4
        i++; // 5
        Flower roze = new Flower();
        Flower роза = roze;
        roze.size = 5;
        роза.size = 3;
        System.out.println(роза.size);
        // System.out.println(b);
    }
}
