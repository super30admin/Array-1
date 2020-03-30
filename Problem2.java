// Time Complexity :O(r(r+c)) where r is # of rows and c is # of columns
// Space Complexity : O(r*c)
// Did this code successfully run on Leetcode : yes 

// i have to look for leet code for the solution.
import java.util.ArrayList;
import java.util.Collections;

class Problem2 {
    public static int[] findDiagonalOrder(int[][] matrix) {
        
        //ege cases
        if(matrix==null || matrix.length==0) return new int[0];
        int R = matrix.length;
        int C = matrix[0].length;
        
        // Result array
        int [] output = new int[R*C];
        
        ArrayList<Integer> temp  = new ArrayList<>();
        int k = 0;
        for(int i = 0 ; i <R+C-1;i++)
        {
            int r = i<C?0:i-C+1;
            int c = i<C?i:C-1;
            
            while(r<R && c>=0)
            {
                temp.add(matrix[r++][c--]);
            }
            
            if(i%2==0) Collections.reverse(temp);
            
            for(int j = 0 ; j < temp.size();j++)
            {
                output[k++]= temp.get(j);
            }
            temp.clear();
        }
        return output;
    }
    public static void main(String[] args)
    {
       int[] result= findDiagonalOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
       for(int i = 0;i<result.length;i++)
       {
           System.out.print(result[i]);
       }

    }
}