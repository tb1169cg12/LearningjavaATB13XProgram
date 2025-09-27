package a1;

import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
// Create a Function of Sub, Sum, Mul and Div
// with parameter, a, b (take the parameter from the User)
// Logic Building
// Step 1 →> Inputs and Outputs
// a, b - int -> Scanner
// int →> variable result →>
// Step 2 - Rough logic -> Create functions
// function -> type 4th - with return and with arguments/ parameters
// Step 3 - Write the code and Find and Fix -> Edge Cases

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number 1");
        int a= scanner.nextInt();
        System.out.println("enter number 2");
        int b= scanner.nextInt();
        int result=sum(a,b);
        System.out.println("sum_is" +result);
    }
    static int sum(int a, int b){
        return a+b;
    }

}
