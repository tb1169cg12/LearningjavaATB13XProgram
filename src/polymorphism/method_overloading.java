package polymorphism;

public class method_overloading {
    public static void main(String[] args) {
mathoperations m1=new mathoperations();
int r1= m1.add(3,4);
int r2= m1.add(1,2,3);
double r3= m1.add(1.1,2.2,3.3,4.4);
String r4=m1.add("rahul","bajaj");
//jvm will get erros at complie time only ie before runing program
    }
}
//multiple method wiht different paramaeter and different return type
class mathoperations{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b, double c,double d){
        return a+b+c+d;
    }
    String add(String a,String b){
        return a+b;
    }
}
