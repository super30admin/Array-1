package Array_1.DiagonalElements;
import java.util.Arrays;
//Leetcode: 498
public class DiagonalArrayElements
{
    public int[] findDiagonalOrder(int[][] mat) {
        int row = 0, col =0, m = mat.length, n = mat[0].length;
        int len = 0, dir =1;
        int[] result = new int[m*n];
        System.out.println(m*n);

        while(len < m*n)
        {
            System.out.println("length : "+len + "  row= "+row+ "  col= "+col );
            result[len] = mat[row][col];
            if(dir ==1)
            {
                if(col == n-1)
                {
                    row++;
                    dir =-1;
                }
                else if(row == 0)
                {
                    col++;
                    dir = -1;
                }
                else
                {
                    row--;
                    col++;
                }

            }
            else //dir = -1
            {
                if(row == n-1)
                {
                    col++;
                    dir =1;
                }
                else if(col == 0)
                {
                    row++;
                    dir = 1;
                }
                else
                {
                    row++;
                    col--;
                }
            }
            len++;
        }
        return result;

    }
}

class Main
{
    public static void main(String[] args) {
        int[][] mat = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        DiagonalArrayElements d = new DiagonalArrayElements();
        int[] arr = d.findDiagonalOrder(mat);
        System.out.println(Arrays.toString(arr));
    }
}


/*
* approach: consider the edge cases while going up, and change the direction to down
* same way, for down direction, consider the edge cases and change the direction accordingly.
*
* Time Complexity: O(N)
* Space Complexity: O(1)
* Whatever space we are using for storing, we are returning the same array, so that will not count towards space/ */