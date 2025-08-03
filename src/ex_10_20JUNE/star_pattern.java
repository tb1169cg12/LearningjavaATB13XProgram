package ex_10_20JUNE;

import java.util.Scanner;

public class star_pattern {
    public static void main(String[] args) {
        System.out.println("enter the no of rows and column");
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i ;j++)
            {
                System.out.print('*'+" ");
            }
            System.out.println();
        }
    }
}
