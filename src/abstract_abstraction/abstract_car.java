package abstract_abstraction;

public class abstract_car {
    public static void main(String[] args) {
       Wagonr Car = new Wagonr();
        car.drive();
    }
}
abstract class engine{
    abstract void startengine();
    abstract void stopengine();
    void check_engine(){
        System.out.println(" normal function");
    }
    abstract class Wagonr extends engine{
        @Override
        void startengine() {
            System.out.println("starting the engine");

        }

        @Override
        void stopengine() {
            System.out.println("stopping the engine");

        }
        void drive (){
            startengine();
            stopengine();
            check_engine();
        }
    }
}

