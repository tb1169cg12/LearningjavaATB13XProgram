package array;

import java.util.Scanner;

public class upper_right_triangel {
    public static void main(String[] args) {
        System.out.println("enter n");
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j>i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
