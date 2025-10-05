package OOPs;

public class default_constructor {
    public static void main(String[] args) {
        Car c2= new Car();
        c2.name="tesla";
        System.out.println(c2.name);
        System.out.println(c2.year);
        System.out.println(c2.model);
}
}
class Car{
    String name;
    int year;
    String model;
    Car(){
        name="bmw";
        year=2000;
        model="x1";

    }
}

