package polymorphism;

public class calculator {
    public static void main(String[] args) {
        calc c1= new calc();
        c1.add(2,3);
        c1.add(1.1,1.2);
        System.out.println(c1);
    }
}
class calc{
    int attribute;
    public int add(int a,int b ){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;

    }
}
