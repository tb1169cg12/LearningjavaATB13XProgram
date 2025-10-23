package static_exercise;

public class iib2 {
    public static void main(String[] args) {
        new A1();
    }

}
class A1{
    A1(){
        System.out.println("hi");
    }
    {
        System.out.println("hey");
    }
    static {
        System.out.println("yo");
    }
}
