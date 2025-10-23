package static_exercise;

public class Static {
    public static void main(String[] args) {
        P p1= new P();
        P p2= new P();
        System.out.println(P.a);
        p1.a=20;
        System.out.println(P.a);
    }
}

class P{
    static int a=10;
}
