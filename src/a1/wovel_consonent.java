package a1;

public class wovel_consonent {
    public static void main(String[] args) {
        //Java Program to Count Vowels and Consonants
        String input ="Java Program to Count Vowels and Consonants";
        input=input.toLowerCase();
        System.out.println(input);
        int volvels=0;
        int consonents=0;
        for(int i=0;i<input.length();i++)
        {
        char ch=input.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            volvels++;
        }
        else {
            consonents++;

        }
    }
        System.out.println("number of vovels" +volvels);
        System.out.println("number of consonents"+consonents);

}}
