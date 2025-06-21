package ex_06_16JUNE;

import java.util.Scanner;

public class Lab_003_swutch_withiut_default {
    public static void main(String[] args) {
        //ask user which browser he want to use
        System.out.println("enter browser");
        Scanner scanner= new Scanner(System.in);
        String browser= scanner.next();
        browser=browser.toLowerCase();//used for case senstitivty exclude
        switch(browser){
            case "chrome":
                System.out.println("starting the browser");
                System.out.println("....");
                System.out.println("tc1");
                System.out.println("tc2");
                break;
            case "firefox":
                System.out.println("starting the browser");
                System.out.println("....");
                break;
            default:
                System.out.println("i dont know which browser is this");
                break;

        }
    }



}
