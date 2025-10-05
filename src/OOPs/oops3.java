package OOPs;

public class oops3 {
    public static void main(String[] args) {
        cat c1=new cat();//obejct created
        cat c2=new cat();
        cat c3;//object not created , behavious will not be available
        c1.running();
    }
}
class cat{
String name;
void running(){//behavious available
    System.out.println("running");

}
}