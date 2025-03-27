// Time Complexity : O(m * n) m number of rows and n number of columns
// Space Complexity : O(m* n)
// Did this code successfully run on Leetcode : Yes

// Approach:
// 1. We traverse the matrix in a spiral order (right, down, left, up) while maintaining boundaries.
// 2. We update boundaries after completing each directional traversal to prevent revisiting elements.
// 3. The loop continues until all elements are added to the output list.


import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        ArrayList<Integer> op = new ArrayList<>();
        int limit = matrix.length*matrix[0].length;
        int c= 0;
        char operation = 'r';

        int r = matrix[0].length;
        int l = -1;
        int d = matrix.length;
        int u = 0;

        int i = 0;
        int j=0;
        while(c!=limit)
        {
            op.add(matrix[i][j]);
            if(operation == 'r')
            {
                j = j+1;
                if(j == r)
                {
                    operation = 'd';
                    i = i+1;
                    j = j-1;
                    r= r-1;
                }
            }

            else if(operation == 'd')
            {
                i = i+1;
                if(i == d)
                {
                    operation = 'l';
                    i = i-1;
                    j = j-1;
                    d=d-1;
                }
            }

            else if(operation == 'l')
            {
                j = j-1;
                if(j == l)
                {
                    operation = 'u';
                    i = i-1;
                    j = j+1;
                    l=l+1;
                }
            }

            else
            {
                i = i-1;
                if(i == u)
                {
                    operation = 'r';
                    i = i+1;
                    j = j+1;
                    u = u+1;
                }
            }
            c++;
        }
        return op;
    }
}
