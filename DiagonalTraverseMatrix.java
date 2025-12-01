// Time Complexity : O(M*N)
// Space Complexity : O(M*N)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        // for up r-- and c++
        // for down r++ and c--
        // use a flag to determine if to go up or down - true is up and false is down
        // edge cases - a. to move to next element in row for going down and going up
        // for first anf last row
        // b. go to next element in col for first and last col

        boolean flag = true;
        int[] result = new int[mat.length * mat[0].length];
        int r = 0, c = 0;
        for(int i = 0; i < mat.length * mat[0].length; i++)
        {
            result[i] = mat[r][c];
            if(flag)
            {
                if(r == 0 && c != mat[0].length - 1)
                {
                    c++;
                    flag = false;
                }
                else if(c == mat[0].length - 1)
                {
                    r++;
                    flag = false;
                }
                else
                {
                    r--;
                    c++;
                }
            }
            else
            {
                if(c == 0 && r != mat.length - 1)
                {
                    r++;
                    flag = true;
                }
                else if(r == mat.length - 1)
                {
                    c++;
                    flag = true;
                }
                else
                {
                    r++;
                    c--;
                }
            }
        }

        return result;
    }
}