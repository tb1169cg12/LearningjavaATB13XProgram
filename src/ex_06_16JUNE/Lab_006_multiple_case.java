package ex_06_16JUNE;

public class Lab_006_multiple_case {
    public static void main(String[] args) {
        int itemcode=006;
        switch(itemcode){
            case 001,002,003 :
                System.out.println("all are electronic");
                break;
            case 004,005,006:
                System.out.println("not electronic");
                break;
            default:
                System.out.println();
        }

    }
}
