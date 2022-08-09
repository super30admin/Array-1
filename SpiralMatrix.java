import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

/*
1.  updating top: row start, bottom: row end, left: column start, right: column end at each itertaion and making sure top<=bottom && left<=right
*/

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
     
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        List<Integer> output=new ArrayList<>();
        if(matrix==null||matrix.length==0)
        return output;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                output.add(matrix[top][i]);

            }
            top++;
            if(left<=right)
            {
                for(int i=top;i<=bottom;i++)
                {
                    output.add(matrix[i][right]);

                }   
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    output.add(matrix[bottom][i]);
                }
            }
            if(left<=right)
            {
                bottom--;
                for(int i=bottom;i>=top;i--)
                {
                    output.add(matrix[i][left]);
                }
            }
           left++;

        }
        return output;
        
    }

    public static void main(String[] args)
    {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(matrix));
    }
}