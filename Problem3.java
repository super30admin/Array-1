// Time Complexity :
//      spiralOrder() - O(m*n)
//      
// Space Complexity :
//      spiralOrder - O(1)
//
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        
        if(matrix == null || matrix.length == 0)
            return res;
        
        int t = 0, l = 0, r = matrix[0].length - 1, b = matrix.length - 1;
        
        int i = 0;
        
        while(t <= b || l <= r)
        {
            if(l <= r)
            {
                i = l;
                while(i <= r)
                {
                    res.add(matrix[t][i]);
                    ++i;
                }
                ++t;
            }
            else if(l > r) return res;
            
            if(t <= b)
            {
                i = t;
                while(i <= b)
                {
                    res.add(matrix[i][r]);
                    ++i;
                }
                --r;
            }
            else if(t > b) return res;
            
            if(l <= r)
            {
                i = r;
                while(i >= l)
                {
                    res.add(matrix[b][i]);
                    --i;
                }
                --b;
            }
            else if(l > r) return res;
            
            if(b >= t)
            {
                i = b;
                while(i >= t)
                {
                    res.add(matrix[i][l]);
                    --i;
                }
                ++l;
            }
            else if(t > b) return res;
        }
        
        return res;
    }
}