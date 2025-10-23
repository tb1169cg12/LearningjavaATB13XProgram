package static_exercise;

public class Static {
    public static void main(String[] args) {
        P p1= new P();
        P p2= new P();
        System.out.println(P.a);
        p1.a=20;
        System.out.println(P.a);
        p1.b=30;
        System.out.println(p1.b);
    }
}

class P{
    static int a=10;
    int b=10;
    static {
        //this is static block
        //this is called when class is loaded , see line 5 when P is mentioned
        System.out.println(" this is called when class is loaded");
    }
}
