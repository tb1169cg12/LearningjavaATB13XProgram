package ex_05_13JUNE;

import java.util.Scanner;

public class LAB_003_scanner_class_userinput {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter age");
        int age = scanner.nextInt();
        String can_i_vote= age>18? "yes":"no";
        System.out.println(can_i_vote);
    }
}
