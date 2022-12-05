package Homeworks.Homework4;
// создайте параметры length, width, hight типа int
// создайте параметры address, owner типа String
// создайте несколько различных конструкторов
// высота и владелец могут меняться извне, адрес, ширина и длина не может (поля должны быть private и должны быть getter для них)

public class House {
    private int length;
    private int width;
    private String address;
    int hight;
    String owner;

    public House(int length, int width, int hight, String address, String owner) {
        this.length = length;
        this.width = width;
        this.hight = hight;
        this.address = address;
        this.owner = owner;
    }

    public House(int length, int width, String address) {
        this.address = address;
        this.length = length;
        this.width = width;
    }

    public int build(int high) {
        this.high = high;
        return this.high;
    }

    public int getWidth() {
        return this.width;
    }

    public int getLength() {
        return this.length;
    }

    public String getAddress() {
        return this.address;
    }

}
