package class_again;

import java.util.Scanner;

public class switch_statment {
    public static void main(String[] args) {
        System.out.println("enter day from 1 to 7");
        Scanner scanner= new Scanner(System.in);
        int day= scanner.nextInt();
        switch (day){
            case 1 :
                System.out.println("monday");
                break;
            case 2 :
                System.out.println("tuesday");
                break;
            case 3 :
                System.out.println("wednesday");
                break;
            case 4 :
                System.out.println("thursday");
                break;
            case 5 :
                System.out.println("friday");
                break;
            case 6 :
                System.out.println("saturday");
                break;
            default :
                System.out.println("not allowed");
        }
    }
}
