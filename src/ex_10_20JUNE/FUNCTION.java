package ex_10_20JUNE;

public class FUNCTION {
    public static void main(String[] args) {
    f1();//call function
        name_of_the_function(); //call again 2nd one also
    }
    static void f1 (){
        System.out.println("hi");
    }
    static void name_of_the_function (){
        System.out.println("hey");
    }
}
