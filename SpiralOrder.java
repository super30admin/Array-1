// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     
        int r1 =0 , r2 = matrix.length-1;
        int c1 =0 , c2 = matrix[0].length-1;
        
        List<Integer> output = new ArrayList<>();
        
        while(r1<=r2 && c1<=c2)
        {
            for(int c=c1; c<=c2;c++) output.add(matrix[r1][c]);
            for(int r=r1+1;r<=r2;r++) output.add(matrix[r][c2]);
            if(r1<r2 && c1<c2)
            {
            for(int c=c2-1; c>=c1;c--) output.add(matrix[r2][c]);
            for(int r=r2-1;r>r1;r--) output.add(matrix[r][c1]);
            }
            
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return output;
    }
}