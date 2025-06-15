package ex_04_12JUNE;

public class Lab_008_nested_ternary {
    public static void main(String[] args) {
        //result = condition ? expression: (condition2 ? expression2 : expression3);
        /*age<18-child
         18 <age>65- adult
          age>65 senior
         */
        int age =65;
        String type =(age<18)?"minor":((age>=18 && age<65)? "adult":"senior");
        System.out.println(type);
    }
}
