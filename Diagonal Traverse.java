// time - n
// space - constant

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        boolean up = true;
        int i = 0;
        int j = 0;
        int m = mat.length;
        int n = mat[0].length;
        int index = 0;
        int[] ans = new int[m*n];

        while(index<m*n)
        {
            ans[index++] = mat[i][j];

            if(up)
            {
                if(j==n-1)
                {
                    i++;
                    up = false;
                }
                else if(i == 0)
                {
                    j++;
                    up = false;
                }
                else
                {
                    i--;
                    j++;
                }
            }
            else
            {
                if(i == m-1)
                {
                    j++;
                    up = true;
                }
                else if(j==0)
                {
                    i++;
                    up = true;
                }
                else
                {
                    i++;
                    j--;
                }
            }
        }

        return ans;

    }


}
