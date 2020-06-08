// Time Complexity : O(m*n) where m is number of rows, n is number of columns
// Space Complexity :O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length==0) return result;
       int l = 0;
        int r = matrix[0].length-1;
        int t = 0;
        int b = matrix.length-1;
        
        
        int len = 0;
        while(l<=r & t<=b)
        {
            for(int i=l;i<=r;i++)
            {
                result.add(matrix[t][i]);
            }
            t++;
            for(int j = t;j<=b;j++)
            {
                result.add(matrix[j][r]);
            }
            r--;
            if(t<=b)
            for(int j=r;j>=l;j--)
            {
                result.add(matrix[b][j]);
            }
            b--;
            if(l<=r)
            for(int i = b;i>=t;i--)
            {
                result.add(matrix[i][l]);
            }
            l++;
            
            
        }
        return result;
    }
}