package abstract_abstraction;

public class abstraction {
    public static void main(String[] args) {
        car c1= new car();
      //  father f1= new father(); // cannt create instance of a class as this is abstract
    }
}


class car{//concrete class-this does not have abstract method
void done(){ // this is complete
            }
}
abstract class father{
abstract void loan_501k();//incomplete function as this has abstract method
void loan501k(){
    System.out.println("give the 500k"); //complete function as it doesnt have abstract method
}
}
