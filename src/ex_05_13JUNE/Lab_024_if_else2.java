package ex_05_13JUNE;

import java.util.Scanner;

public class Lab_024_if_else2 {
    public static void main(String[] args) {
        System.out.println("enter age");
        Scanner scanner= new Scanner(System.in);
        int age=scanner.nextInt();
        if(age>18){
            System.out.println("allowed to vote");}
        else{
            System.out.println("not allowed to vote");}
    }
}
