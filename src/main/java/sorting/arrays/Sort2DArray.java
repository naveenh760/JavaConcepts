package sorting.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Sort2DArray {
    public static void main(String args[]) {
        int[][] multi = new int [][]{
                {4, 9, 8},
                {7, 5, 2},
                {3, 0, 6},

        };
        print2D(multi);
        Sort2DArrayBasedOnColumnNumber(multi,2);
        System.out.println("after sorting");
        print2D(multi);
    }
    public static  void Sort2DArrayBasedOnColumnNumber (int[][] array, final int columnNumber){
        Comparator<int[]> comparator1 = (a, b) -> a[columnNumber] - b[columnNumber];
        Comparator<int[]> comparator = Comparator.comparingInt(a -> a[columnNumber]);
        Arrays.sort(array, comparator);
    }

    public static void print2D(int[][] multi){
        for(int i = 0; i< multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++)
                System.out.print(multi[i][j] + " ");
            System.out.println();

        }
    }
}
