package ex_10_20JUNE;

import java.util.Arrays;

public class max_Array {
    public static void main(String[] args) {
        int [] array ={25,15,17,29,18,55};
        Arrays.sort(array);
        System.out.println(array[array.length-1]);
    }
}
