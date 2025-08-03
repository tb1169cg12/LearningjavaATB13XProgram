package ex_10_20JUNE;

import java.util.Scanner;

public class left_hand_triangle {
    public static void main(String[] args) {
        System.out.println("enter size of matrix");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(i*j + "  | ");

            }
            System.out.println();
        }
    }
}
