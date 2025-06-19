package ex_05_13JUNE;

public class Lab_022_task6 {
    public static void main(String[] args) {
        int x = 5;

        int y = x++ + ++x + x++ + ++x;//5+7+7+9=28=y x=9

        System.out.println("x = " + x + ", y = " + y);
    }
}
