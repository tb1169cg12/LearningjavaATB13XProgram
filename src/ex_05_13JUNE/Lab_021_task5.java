package ex_05_13JUNE;

public class Lab_021_task5 {
    public static void main(String[] args) {
        int a = 5;

        int b = a++ + ++a;//5+7==12

        System.out.println("a: " + a); // Output: 7

        System.out.println("b: " + b); // Output: 12
    }
}
