/*
Leet Code Problem 54
Spiral Matrix
Language Used : Java
Link: https://leetcode.com/problems/spiral-matrix/
Runtime: 0 ms, faster than 100.00% of Java online submissions for Spiral Matrix.
Memory Usage: 37.4 MB, less than 12.28% of Java online submissions for Spiral Matrix.

Logic: Maintain 4 counters top, bottom, left and right and every time the values are read, 
		update the values of top. For eg: once first row is processed increment top
*/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // As expecting a return List Create a list
        List<Integer> result = new ArrayList<>();
        // null check
        if(matrix==null||matrix.length==0) return result;
        int m = matrix.length;
        int n = matrix[0].length;
        int t=0;
        int l=0;
        int b=m-1;
        int r=n-1;
        while(l<=r&&t<=b)
        {
            //top
            for(int i=l;i<=r;i++)
            {result.add(matrix[t][i]);}
            t++;
            //right - cross
            if(l<=r&&t<=b){
                for(int i=t;i<=b;i++)
                {result.add(matrix[i][r]);}
                r--;
            }
            
            //bottom
            if(l<=r&&t<=b){
                for(int i=r;i>=l;i--)
                {result.add(matrix[b][i]);}
                b--;
            }
            
            //left
            if(l<=r&&t<=b){
                for(int i=b;i>=t;i--)
                {result.add(matrix[i][l]);}
                l++;
            }
        }
    return result;       
    }
}
