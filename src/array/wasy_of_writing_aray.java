package array;

public class wasy_of_writing_aray {
    public static void main(String[] args) {
        //1,2,3
        //4,5,6
        //7,8,9
        int[][]array;
        array=new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };
        // 10,20
        // 30,40
        // 50,60
        System.out.println(array[0][0]);
        int[][]array2={
                {10,20},
                {30,40},
                {50,60}
        };
        System.out.println(array2[1][1]);
    }
}
