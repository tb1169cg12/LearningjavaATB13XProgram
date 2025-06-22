package ex_08_18JUNE;

import java.util.Scanner;

public class Lab_004_exercise {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a character");
        char ch = scanner.next().charAt(0);
// Convert to lowercase for easier comparison
        ch = Character.toLowerCase(ch);
// Check if the input is a letter
        if ((ch >= 'a' && ch <= 'z')) {
            if (ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                System.out.println("character is vovel");
            } else {
                System.out.println("character is consonent");
            }

        }
    }
}

