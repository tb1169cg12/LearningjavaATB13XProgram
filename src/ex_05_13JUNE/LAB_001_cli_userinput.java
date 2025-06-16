package ex_05_13JUNE;

public class LAB_001_cli_userinput {
    public static void main(String[] args) {
        String age_string=args[0];
        int age =Integer.parseInt(age_string);
        String can_i_vote= age>18 ? "yes" :"no";
        System.out.println(can_i_vote);
    }
}
