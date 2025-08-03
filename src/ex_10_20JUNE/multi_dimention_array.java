package ex_10_20JUNE;

public class multi_dimention_array {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(matrix.length);
        for (int i=0;i< matrix.length;i++)
        {
        for (int j=0;j<matrix[i].length;j++){
        System.out.print(matrix[i][j]+" | ");
        }
        System.out.println();
        }

        int[][] martrix2;
        martrix2= new int[][]{
                {10,20},
                {20,30},
                {30,40}
        };


        int [][] array =new int[3][3];
        array[0][0]=1;
        array[0][1]=2;
        array[0][2]=3;

        array[1][0]=4;
        array[1][1]=5;
        array[1][2]=6;

        array[2][0]=7;
        array[2][1]=8;
        array[2][2]=9;

        //jagged array
        int[][] jagged_array={
                {1,2},{1,3},
                {2,2},{2,4},{3,4},
                {2,6}
        };

    }
}
