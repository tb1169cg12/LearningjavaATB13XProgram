package class_again;
import java.util.Scanner;//without this file scanner wont work
public class scanner_input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //takes input
        System.out.println("enter age");
        int age=scanner.nextInt();
        String canivote = age <18 ?"no":"yes";
        System.out.println(canivote);

    }
}
