package ex_03_11JUNE;

public class Lab_11JUNE_concat_plus {
    public static void main(String[] args) {
        String first_name ="rahul";
        String last_name ="bajaj";
        int a=10;
        int b=20;

        System.out.println(first_name + last_name+a+b);//if string comes first it will act as string
        System.out.println(a+b+first_name+last_name);// if int comes first it act like int
        System.out.println(first_name+last_name+(a+b));//bodmas principle
    }
}
