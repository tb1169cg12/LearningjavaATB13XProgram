package array;

public class Array_3d {
    public static void main(String[] args) {
        String[][] array_3d={
                {"aa","ab"},
                {"cc","cd"}
        };
        int[][] array_new=new int[3][3];
        array_new[0][0]=1;
        array_new[0][1]=2;
        array_new[0][2]=3;

        array_new[1][0]=1;
        array_new[1][1]=2;
        array_new[1][2]=3;

        array_new[2][0]=1;
        array_new[2][1]=2;
        array_new[2][2]=3;
        for(int i=0;i<array_new.length;i++){
            for(int j=0;j<array_new[i].length;j++){
                System.out.print(array_new[i][j] + "  |  ");

        }
            System.out.println();//for better output , space after each row




    }
}}
