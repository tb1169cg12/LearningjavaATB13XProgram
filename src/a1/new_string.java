package a1;

public class new_string {
    public static void main(String[] args) {
        String x="aa"; //2 strings in pool 1st
        x=x.toUpperCase();//2nd
        System.out.println(x);
    }
}
