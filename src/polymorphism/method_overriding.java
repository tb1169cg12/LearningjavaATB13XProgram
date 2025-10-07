package polymorphism;

public class method_overriding {
    public static void main(String[] args) {
        dog d1=new dog();
        d1.sound();
    }

}
class animal{
    void sound(){
        System.out.println("default sound");
    }

}
class dog extends animal{
    @Override   //if weuncomment this then default will run due to system overdiding this
    void sound() {
        System.out.println("bow wow");
    }
}
