package ex_05_13JUNE;

public class Lab_013_increment_exercise {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a++ + ++a);
        //A+B
        //A-a++ first assign then increase - so a++>10 and then a=11
        //B-++a first increate then assign - value a -11-so 11+1=12
        //output-10+12=22
        System.out.println(a);//output 12

    }


}
