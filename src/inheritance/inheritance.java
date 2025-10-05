package inheritance;

public class inheritance {
    public static void main(String[] args) {
        father f1=new father();
        System.out.println(f1.gold_f);
        f1.bhk2();
        son s2=new son();
        s2.bhk3();
        System.out.println(s2.gold_f);
        s2.bhk2();

    }

}
class father{
    int gold_f=1000;
    void bhk2(){
        System.out.println("father 2 bhk");
    }
}
class son extends father{
void bhk3(){
    System.out.println("son has 3bhk");
    }
}
