package static_exercise;

public class iib {
    public static void main(String[] args) {
        A a=new A();
        A a1=new A();
        //both will give output twice
        // but static will come omly once
    }
}
class A{
    A(){
        System.out.println("dc");
    }
    {
        System.out.println("ji i am iib");

    }
    {
        System.out.println("if u want to call or execute something");
    }
    static {
        System.out.println("static");
    }
}
