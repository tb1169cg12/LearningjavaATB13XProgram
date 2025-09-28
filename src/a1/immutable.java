package a1;

public class immutable {
    public static void main(String[] args) {
        String a="hello";
        String b="hello";
        String c="hello";
        System.out.println(a);

        String s1=new String("hello");
        String s2=new String("hello");
        String s3=new String("hello");
        System.out.println(s1);
        //total 3 string only in string pool a,s1,s2,s3
    }
}
