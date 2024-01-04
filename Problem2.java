// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int [] result = new int[m*n];
        int i = 0;
        int j = 0;
        boolean dir = true; //up
        //

        for(int idx = 0; idx < result.length; idx++)
        {
            result[idx] = mat[i][j];
            if(dir )
            {
                if(i == 0 && j !=n-1 ) //if we are at first row but not int the last column then then increment column, nd change dir.
                {
                    j++;
                    dir = false;
                }else if(j == n-1)   //when we are any at row except first but at the last column, then increment row, and chaange dir
                {
                    i++;
                    dir = false;
                }
                else{
                    i--;
                    j++;
                }
            }else{
                if(j == 0 && i != m-1 )  //if we are first column, but not at last row then increemnt row. and chaange dir
                {
                    i++;
                    dir = true;
                }else if(i == m-1)  //if we are last row, and any col except first col, then increament col, and chaange dir
                {
                    j++;
                    dir = true;
                }
                else{
                    j--;
                    i++;
                }
            }
        }
        return result;
    }
}