// Time Complexity : O(n*m) , n and m are dimensions of matrix
// Space Complexity : O(1) . result space in not extra space
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        //we handle upward and downward movement separately while taking care of edge cases - hitting boundaries

        //result array will be of length rows*cols;

        int n = mat.length;
        int m = mat[0].length;

        int[] result = new int[n*m];

        int i=0,j=0,k=0; //indices to traverse mat and result
        boolean dir = true; // true means moving up

        while(k < n*m)
        {
            //put current mat element in result
            result[k] = mat[i][j];
            //increase index of result
            k++;

            //now decide how to move in mat

            //case : moving up
            if(dir)
            {
                if(j==m-1)
                {
                    dir = false;
                    i++;
                }
                else if(i==0)
                {
                    dir = false;
                    j++;
                }
                else
                {
                    i--;
                    j++;
                }
            }

            //case : moving down
            else
            {
                if(i==n-1)
                {
                    dir = true;
                    j++;
                }
                else if(j==0)
                {
                    dir = true;
                    i++;
                }
                else
                {
                    i++;
                    j--;
                }
            }
        }

        return result;
    }
}
