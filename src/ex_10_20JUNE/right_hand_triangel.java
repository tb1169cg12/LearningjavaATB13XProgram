package ex_10_20JUNE;

import java.util.Scanner;

public class right_hand_triangel extends RuntimeException {
    public static void main(String[] args) {
        System.out.println("enter size of triangle");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = x; i >= 1; i--) {
            for (int j =1 ; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
