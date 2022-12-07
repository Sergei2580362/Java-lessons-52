package Homeworks.Homework4;

import java.util.Scanner;

public class HouseTest {
    public static void main(String[] args) {
        House house = new House(50,40,10,"Moscow","Petrov");
        House houseWithoutOwner = new House(50, 40, "Moscow");

        Scanner scanner = new Scanner(System.in);
        //int y = f(x); // y = x +5 -> f(x) = x +5   -> y = f(3)

        int y = f(9);
        System.out.println(y);

        build (3, houseWithoutOwner);

    }

    public static void build(int high, House house) {
        house.high = high;
    }

    public static int f(int x) {
        return x + 5;
    }
}
