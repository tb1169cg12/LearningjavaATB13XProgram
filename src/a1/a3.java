package a1;

import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a");
        int a= scanner.nextInt();
        System.out.println("enter b");
        int b= scanner.nextInt();
        int ssum=sum(a,b);
        System.out.println("sum is "+ssum);
        int multiply=multipli(a,b);
        System.out.println("multiply is "+multiply);
    }

    public static int sum(int a,int b ) {
        return a+b;

    }
    public static int multipli(int a,int b){
    return a*b;}

}
