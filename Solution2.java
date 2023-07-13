//Spiral Matrix
//Time Complexity:O(m*n)
//Space Complexity:O(1)
import java.util.ArrayList;
import java.util.List;

class Solution2 {
    public List<Integer> spiralOrder(int[][] matrix) {

        int m=matrix.length;//no of rows
        int n=matrix[0].length;//no of cols
        int top=0;
        int bottom=m-1;
        int left=0;
        int right=n-1;
        List<Integer> result=new ArrayList<>();
        while(top<=bottom && left<=right)
        {
            //go to left
            for(int i=left;i<=right;i++)
            {
                result.add(matrix[top][i]);
            }
            top++;
            //we go down       
            for(int i=top;i<=bottom;i++)
            {
                result.add(matrix[i][right]);
            }
            right--;
            //we go to left
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    result.add(matrix[bottom][i]);
                }
            }
            bottom--;
            //we go up
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        return result;
    }
}