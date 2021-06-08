import java.util.ArrayList;
import java.util.List;


/*
TC : O(m*n) where m*n  is the size of the matrix
SC : O(1)
 Did this code successfully run on Leetcode : Yes
 Any problem you faced while coding this : No
 */

/**
 * we take four pointers that represent the first column(a) = 0, last column(b) = n-1, first row(c) = 0, last row(d) = m-1
 * Then we start adding elements in the sprial order, incrementing a/b/c/d/ at appropriate junctures
 * we use the fact that first row pointer <= last row pointer && firs tcol pointer <= last row pointer as our condition to keep adding elements
 */


public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        int counter=0;
        int total = matrix.length*matrix[0].length;
        List<Integer> soln = new ArrayList<>();
        int a=0;
        int b=matrix[0].length-1;
        int c=0;
        int d =matrix.length-1;

        while(true)
        {

            for(int i=a; i<=b; i++)
            {
                soln.add(matrix[c][i]);
                counter++;

            }
            c++;
            if(c>d)
                break;
            for(int i =c; i<=d ;i++)
            {
                soln.add(matrix[i][b]);
                counter++;

            }
            b--;
            if(b<a)
                break;
            for(int i=b; i>=a;i--)
            {
                soln.add(matrix[d][i]);
                counter++;

            }
            d--;
            if(d<c)
                break;
            for(int i =d; i>=c; i--)
            {
                soln.add(matrix[i][a]);
                counter++;

            }
            a++;
            if(a>b)
                break;
        }
        return soln;
    }
}
