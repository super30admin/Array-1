
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix)
    {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int top =0, bottom = m-1, left =0, right = n-1, len=0;
        while (top <= bottom && left <=right)
        {
            //going left to right
            for(int i = left; i<= right; i++)
            {
                result.add(matrix[top][i]);
            }top++;

            //top to bottom
            for(int i =top; i <= bottom ; i++)
            {
                result.add(matrix[i][right]);
            }right--;

            //going right to left
            for(int i = right; i >=left && top<=bottom; i-- )
            {
                result.add(matrix[bottom][i]);
            }bottom--;

            //going up
            for(int i =bottom; i >= top && left<=right; i--)
            {
                result.add(matrix[i][left]);
            }left++;
        }

        return  result;
    }
}

class Main
{
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4},{10,11,12,5},{9,8,7,6}};

        SpiralMatrix s = new SpiralMatrix();
        List<Integer> list = s.spiralOrder(matrix);
        System.out.println(list);
    }
}


/*
* Approach: considered Edge Case: move right, down, left, up
* rotated through array in the same manner from left to right, and vice versa; top to bottom and vice versa.
*
* Space Complexity: O(1) - No auxiliary space used.
* Time Complexity: O(M*N)
*  */