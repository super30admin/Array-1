class Solution {

    //Time Complexity: O(m*n)
    //Space Complexity: O(m*n)
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] result = new int[m*n];
        int r= 0, c=0;

        boolean dir = true;

        for(int i=0;i<m*n;i++)
        {
            result[i] = mat[r][c];
            if(dir){ //upward direction
                if(c==n-1){ // hits right boundary
                    r++;
                    dir = false;
                }
                else if(r==0){ // hits top boundary
                    c++;
                    dir = false;
                }
                else { //going in upward direction
                    c++;
                    r--;
                }
            }
            else // downward direction
            {
                if(r==m-1) // hits bottom boundary
                {
                    c++;
                    dir = true;
                }
                else if(c==0) // hits left boundary
                {
                    r++;
                    dir = true;
                }
                else // going in downward direction
                {
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}