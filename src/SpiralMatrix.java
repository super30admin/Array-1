// Time Complexity:           O(m*n)
// Space Complexity:          O(1)
// where m is number of rows of array, n is number of columns of array
// Yes, this code ran successfully
// No, I didn't face any problem in this problem statement

package src;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        SpiralMatrix sm = new SpiralMatrix();
        int[][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> list = sm.spiralOrder(nums);
        System.out.println(list);
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int fr = 0 ;
        int lr = m-1;
        int fc = 0 ;
        int lc = n-1;


        while(fr<lr && fc<lc)
        {
            // RIGHT
            for(int j=fc; j<=lc; j++)                                   // traversing first to last column in first row
            {
                ans.add(matrix[fr][j]);
            }

            fr++;                                                      // decrementing first row

            // DOWN
            for(int i=fr; i<=lr; i++)                                   // traversing first to last row in last column
            {
                ans.add(matrix[i][lc]);
            }

            lc--;                                                       // decrementing last column

            // LEFT
            for(int j=lc; j>=fc; j--)                                   // traversing last to first column in last row
            {
                ans.add(matrix[lr][j]);
            }

            lr--;                                                       // decrementing last row

            // UP
            for(int i=lr; i>=fr; i--)                                   // traversing last to first row in first column
            {
                ans.add(matrix[i][fc]);
            }
            fc++;                                                       // decrementing first column
        }
        if(fr==lr)                                                      // one extra row
        {
            for(int j=fc; j<=lc; j++)                                   // traversing first to last column in extra row
            {
                ans.add(matrix[fr][j]);
            }
        }
        else if(fc==lc)                                                 // one extra column
        {
            for(int i=fr; i<=lr; i++)                                   // traversing first to last row in extra column
            {
                ans.add(matrix[i][fc]);
            }
        }
        return ans;
    }
}
