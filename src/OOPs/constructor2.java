package OOPs;

public class constructor2 {
    public static void main(String[] args) {
        Babya b1=new Babya();
        System.out.println(b1.name);
    }
}
class Babya{
    String name;
    int age;
    String adharNumber;
    int year;
    int month;
    int date;
    Babya(){
        name="nona";
        age='2';
        adharNumber="a";
        year=2;
        month=1;
        date=1;
    }
}
