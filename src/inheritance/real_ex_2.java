package inheritance;

public class real_ex_2 extends common_to_all{
    //using values from comon to all
    void runnin2(){
        starting_a_browser();
        System.out.println("test case2");
        closing_the_browser();
        common_to_all c1=new test_case_1();
        c1.starting_a_browser();

    }
}
