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
            for(int j=fc; j<=lc; j++)
            {
                ans.add(matrix[fr][j]);
            }

            fr++;

            // DOWN
            for(int i=fr; i<=lr; i++)
            {
                ans.add(matrix[i][lc]);
            }

            lc--;

            // LEFT
            for(int j=lc; j>=fc; j--)
            {
                ans.add(matrix[lr][j]);
            }

            lr--;

            // UP
            for(int i=lr; i>=fr; i--)
            {
                ans.add(matrix[i][fc]);
            }
            fc++;
        }
        if(fr==lr)
        {
            for(int j=fc; j<=lc; j++)
            {
                ans.add(matrix[fr][j]);
            }
        }
        else if(fc==lc)
        {
            for(int i=fr; i<=lr; i++)
            {
                ans.add(matrix[i][fc]);
            }
        }
        return ans;
    }
}
