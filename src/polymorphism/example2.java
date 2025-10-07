package polymorphism;

public class example2 {
    public static void main(String[] args) {
home h1=new home();
h1.task(true);
h1.task();
h1.task(1);
    }
}
class home{
         void task(){
        System.out.println("task 1");
         }
        int task(int a) {
            System.out.println("task1 ");
            return a;
        }
        boolean task(boolean a ){
            System.out.println("taskk 1");
            return a;
        }
}
