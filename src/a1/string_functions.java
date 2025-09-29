package a1;

public class string_functions {
    public static void main(String[] args) {
        String s="abcd";
        System.out.println(s);
        System.out.println(s.charAt(3)); //will find character on 3rd position starting from 0
        System.out.println(s.length());//will find length
        System.out.println(s.contains("c"));//will find if string contais c word and output is true or false
        System.out.println(s.equals("d"));//will check if string matches
        System.out.println(s.equalsIgnoreCase("d"));//wil check above only
        System.out.println(s.indexOf("c"));//will check location of word in string
        System.out.println(s.lastIndexOf("c"));//wil check the last words place if two similar exist
        System.out.println(s.replace("a","B"));//will replace the word (act as ctrl+h)
        String c="rahul@tarun@203";
        String[] split_c=c.split("@"); //will split
        System.out.println(split_c[0]);
        System.out.println(split_c[1]);
        System.out.println(split_c[2]);
        System.out.println(s.toUpperCase());//changes to caps
        System.out.println(s.toLowerCase());//changes to lowers caps
        System.out.println(s.startsWith("a"));//will check if string starts with given char
        System.out.println(s.endsWith("d"));
        String another_palindrom="Niagara. 0 roar again!";
        System.out.println(another_palindrom.length());
        String extra=another_palindrom.substring(11,15);//will fetch word starting from 11 but end on 14th
        System.out.println(extra);
        String x="rahul";//concatination
        String y="bajaj";
        String concat=x+y;
        System.out.println(concat);
    }
}
