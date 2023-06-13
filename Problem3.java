// Time Complexity : O(n*m)
// Space Complexity : O(1)
    // n is the number of rows and m is the number of columns

// Your code here along with comments explaining your approach
    //We maintain 4 variables topRow, bottomRow, leftCol & rightCol. We first traverse the numbers in topRow bounded by leftCol and rightCol.
    //We then traverse the numbers in rightCol bounded by topRow and bottomRow, we traverse the numbers in bottomRow, now in reverse order. Lastly we traverse the numbers in leftCol, also in reverse order.
    //After every round in the matrix, we move our variables by 1 towards the center. We keep checking if the list has "n*m" numbers, that is all the numbers in the matrix. If yes, we come out of the loop.

    
import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> list = new ArrayList<Integer>();
        int topRow = 0;
        int bottomRow = n-1;
        int leftCol = 0;
        int rightCol = m-1;
        while(list.size()<(n*m))
        {
            //top row
            for (int j=leftCol; j<=rightCol && list.size()<(n*m); j++)
            {
                list.add(matrix[topRow][j]);
            }
            topRow++;
            //right column
            for (int i=topRow; i<=bottomRow && list.size()<(n*m); i++)
            {
                list.add(matrix[i][rightCol]);
            }
            rightCol--;
            //bottom row
            for (int j=rightCol; j>=leftCol && list.size()<(n*m); j--)
            {
                list.add(matrix[bottomRow][j]);
            }
            bottomRow--;
            //right column
            for (int i=bottomRow; i>=topRow && list.size()<(n*m); i--)
            {
                list.add(matrix[i][leftCol]);
            }
            leftCol++;
        }
        return list;
    }
}