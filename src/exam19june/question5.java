package exam19june;

import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter number");
        int number = scanner.nextInt();
        String is_number_positive= (number>0)?"number is positive":((number<0)?"number is negative":"number is zero");
        System.out.println(is_number_positive);
    }
}
