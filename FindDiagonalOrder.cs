// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

public int[] FindDiagonalOrder(int[][] mat) {
        
     if (mat == null || mat.Length == 0)
            return new int[] { };

        int m = mat.Length;
        int n = mat[0].Length;
        int[] result = new int[m * n];

        int r = 0;
        int c = 0;
        int dir = 1; ///1 is upward and -1 is downward
        int i = 0;

        while (r < m && c < n)
        {   
            result[i] = mat[r][c];
            
            if(dir == 1) //going up
            {
                if(c == n-1)
                {
                    dir = -1;
                    r++;
                }
                else if(r == 0)
                {
                    dir = -1;
                    c++;
                }
                else
                {
                    r--;
                    c++;
                }
            }
            else //going down
            {
                if(r == m-1)
                {
                    dir = 1;
                    c++;
                }
                else if(c == 0)
                {
                    dir = 1;
                    r++;
                }
                else
                {
                    r++;
                    c--;
                }
            }
            
            i++;
        }
        
        return result;
    }