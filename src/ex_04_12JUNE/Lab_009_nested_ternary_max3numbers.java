package ex_04_12JUNE;

public class Lab_009_nested_ternary_max3numbers {
    public static void main(String[] args) {
        int a=2;
        int b=1;
        int c=0;
        String max=(a>b)?(a>c)?"a":"c":(b>c)?"b":"c";
        System.out.printf(max);
    }
}
