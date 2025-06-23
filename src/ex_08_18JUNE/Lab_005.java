package ex_08_18JUNE;

import java.util.Scanner;

public class Lab_005 {
    public static void main(String[] args) {
        System.out.println("enter a character");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a') {
                System.out.println("its a vovel");

            } else {
                System.out.println("ITS A CONSONENT");
            }
        }
    }
}
