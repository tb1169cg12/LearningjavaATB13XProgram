package class_again;

import java.util.Scanner;

public class switch_stateent_browser {
    public static void main(String[] args) {
        System.out.println("enter browser which u want to use");
        Scanner scanner = new Scanner(System.in);
        String browser = scanner.next();
        switch (browser)
        {
            case "firefox" :
                System.out.println("starting firefox");
                break;
            case "chrome":
                System.out.println("starting chrome");
                break;
            default :
                System.out.println("enter again");


        }
    }
}
