package lesson3;

public class StudentNewAge {
    public static void main(String[] args) {
        int val = 1;
        Student student = new Student();
        System.out.println(student.birthYear);
        student.birthYear = 1991;
        System.out.println(student.birthYear);
    }
}
