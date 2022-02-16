//TC : O(n*m)
//SC: O(n*m)

// import java.io.*;
// class MAIN {
//   public static void spiralMatrixPrint(int[][] arr) {

//     int rows = arr.length;
//     int cols = arr[0].length;
//   // Defining the boundaries of the matrix.
//   int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

//   // Defining the direction in which the array is to be traversed.
//   int dir = 1;

//   while (top <= bottom && left <= right) {

//     if (dir == 1) {    // moving left->right
//       for (int i = left; i <= right; ++i) {
//         System.out.print(arr[top][i] + " ");
//       }
//       // Since we have traversed the whole first
//       // row, move down to the next row.
//       ++top;
//       dir = 2;
//     }
//     else if (dir == 2) {     // moving top->bottom
//       for (int i = top; i <= bottom; ++i) {
//           System.out.print(arr[i][right]+ " ");
//       }
//       // Since we have traversed the whole last
//       // column, move left to the previous column.
//       --right;
//       dir = 3;
//     }
//     else if (dir == 3) {     // moving right->left
//       for (int i = right; i >= left; --i) {
//           System.out.print(arr[bottom][i]+ " ");
//       }
//       // Since we have traversed the whole last
//       // row, move up to the previous row.
//       --bottom;
//       dir = 4;
//     }
//     else if (dir == 4) {     // moving bottom->up
//       for (int i = bottom; i >= top; --i) {
//           System.out.print(arr[i][left]+ " ");
//       }
//       // Since we have traversed the whole first
//       // col, move right to the next column.
//       ++left;
//       dir = 1;
//     }
//   }
// }
//   public static void main(String[] args)
//   {
//     // Driver code
//     // Change the following array to test
//     // on some other input
//     int a[][] = { {1,2,3,4},
//                 {5,6,7,8},
//                 {9,10,11,12}};
//     spiralMatrixPrint(a);
//   }
// }


class Solution
{
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        int m = matrix.length , n = matrix[0].length;
        int firstRow=0, lastRow= m-1;
        int firstCol=0, lastCol=n-1;

        while(firstRow <=lastRow  && firstCol <= lastCol)
        {

            //Right ==> ++j
            for (int j = firstCol; j<=lastCol ;++j)
            {
                result.add(matrix[firstRow][j]);
            }
            ++firstRow;

            //Down => ++x
            for (int i=firstRow ; i <= lastRow ;++i)
            {
                result.add(matrix[i][lastCol]);
            }
            --lastCol;

            //left
            if(firstRow <= lastRow)
            {
                for (int j=lastCol ; j>=firstCol ; --j)
                {
                    result.add(matrix[lastRow][j]);
                }
                --lastRow;
            }



            //UP
            if (firstCol <=lastCol )
            {
                for(int i = lastRow ; i>=firstRow ; --i)
                {
                    result.add(matrix[i][firstCol]);
                }
                ++firstCol;
            }


        }
        return result;
    }
}

