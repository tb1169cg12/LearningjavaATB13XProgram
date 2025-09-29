package a1;

public class immutable {
    public static void main(String[] args) {
        String a="hello";//present in string constant pool
        String b="hello";
        String c="hello";
        System.out.println(a);

        String s1=new String("hello");//present in object area
        String s2=new String("hello");
        String s3=new String("hello");
        System.out.println(s1);
        //total 3 string only in string pool a,s1,s2,s3
        System.out.println(a==b);//code to find if bot stings are in same area
        System.out.println(a==s1);//will return true if in same and false if in different pool
        System.out.println(a.equals(b));//checks content in string is same
    }
}
