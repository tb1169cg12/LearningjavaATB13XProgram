package ex_06_16JUNE;

import java.util.Scanner;

public class LAB_001_switch_statment {
    public static void main(String[] args) {
//take user input and tell them whihc day it is
        //if 1-7 then monday -tuesday...friday
        //>7 not allowed
        System.out.println("enter number from 1 to 7");
        Scanner scanner =new Scanner(System.in);
        int day=scanner.nextInt();
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
                System.out.println("satday");
                break;
            case 7 :
                System.out.println("sunday");
                break;
            default:
                System.out.println("not allowed");
                break;
        }
    }
}
