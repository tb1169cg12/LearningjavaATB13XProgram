package class_again;

import java.util.Scanner;

public class switch_stateent_browser {
    public static void main(String[] args) {
        System.out.println("enter browser which u want to use");
        Scanner scanner = new Scanner(System.in);
        String browser = scanner.next();
        browser=browser.toLowerCase();//will accept any form of input capital small
        switch (browser)
        {
            case "firefox" :
                System.out.println("starting firefox");
                break;
            case "chrome":
                System.out.println("starting chrome");
                break;
            default :   //will break if no input from cases
                System.out.println("enter again");


        }
    }
}
