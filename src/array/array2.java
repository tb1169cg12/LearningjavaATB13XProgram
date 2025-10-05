package array;

import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {
        String[] names={"rahul","tarun","sonu","monu"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            Arrays.sort(names);
        }

}}
