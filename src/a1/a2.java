package a1;

public class a2 {
    public static void main(String[] args) {
wp_wrt_greet();//calling function 1 wp_wrt
        String msg= greet_wrt_wp();
        System.out.println(msg);
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
}
