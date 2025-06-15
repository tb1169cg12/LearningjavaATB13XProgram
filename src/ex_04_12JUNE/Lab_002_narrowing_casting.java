package ex_04_12JUNE;

public class Lab_002_narrowing_casting {
    public static void main(String[] args) {
        int a=200;
       // byte b=a;//narrowing(int>>byte) not allowed
        byte b = (byte)a;
        System.out.println(b);//output will give -56
    }
}
