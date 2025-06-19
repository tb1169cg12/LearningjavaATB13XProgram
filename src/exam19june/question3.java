package exam19june;

public class question3 {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        boolean c= a==b;
        boolean d=a > b;
        boolean e=a < b;
        boolean f =(a > b) && (a > 0);
        boolean g =(a < b) || (a > 0);
        boolean h =!(a > b);
        System.out.printf("a == b: %b",c).println();
        System.out.printf("a>b: %b",d).println();
        System.out.printf("a<b: %b",e).println();
        System.out.printf("(a > b) && (a > 0):%b",f).println();
        System.out.printf("(a < b) || (a > 0) :%b",g).println();
        System.out.printf("!(a > b):%b",h).println();
    }
}
