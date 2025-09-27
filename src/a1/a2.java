package a1;

public class a2 {
    public static void main(String[] args) {
        wp_wrt_greet();//calling function 1 wp_wrt
        String msg= greet_wrt_wp();//calling function 2 wp_wrt
        System.out.println(msg);
        greeting_with_details("pramod",15,10000);//callling function 3

    }

    //1. without parameter without return type
    static void wp_wrt_greet(){
        System.out.println("hi,how are u");
    }
    //2. without parameter with return type
    static String greet_wrt_wp(){
        System.out.println("hi");
        return "how are u ";
    }
    //3. with parameter ,without return type
    static void greeting_with_details( String name,int age ,double salary ){
        System.out.println("your name is " + name + "\n  your age is " + age + "\n your salary is "+ salary );

    }
}
