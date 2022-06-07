// Time Complexity : O(m*n)
// Space Complexity : O(1) since we dont use any auxillary structures
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        int left=0, right=n-1, ceiling=0,floor = m-1;
        
        while(ceiling<=floor && left<=right)
        {   if(ceiling<=floor )
             {
            for(int i =left;i<=right;i++)
                res.add(matrix[ceiling][i]);
             }
            ceiling++;
           if( left<=right)
           { 
            for(int i=ceiling;i<=floor;i++)
                res.add(matrix[i][right]);
           
           }  
           right--;
           
            if(ceiling<=floor )
            {
            for(int i= right;i>=left;i--)
                res.add(matrix[floor][i]);
            }
            floor--;
            if(left<=right){
            for(int i =floor;i>=ceiling;i--)
                res.add(matrix[i][left]);
            }
            left++;
            
            
        }
        return res;
      
    }
}