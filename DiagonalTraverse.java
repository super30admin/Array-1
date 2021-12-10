// Time Complexity : O(nm)
// Space Complexity : O(1)
public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0)
            return new int []{};
        int n = mat.length, m = mat[0].length;
        int result[] = new int[n*m];
        int dir = 1, i = 0, j = 0;
        for(int idx = 0 ; idx < n*m ; idx ++)
        {
            result[idx] = mat[i][j]; // since we do not have control over i and j 
            // out of bound index should be considered in directions
            if(dir == 1) // going upwards
            {
                if(j == m-1) // to avoid array index out of bound
                {
                    dir = -1;
                    i++;
                    
                }
                else if(i == 0)
                {
                    dir = -1;
                    j++;
                }
                else
                { // general case
                    i--;
                    j++;
                }
            }
            else // going downwards
            {
                if(i == n-1) // avoid array index out of bound
                {
                    dir = 1;
                    j++;
                }
                else if(j == 0)
                {
                    dir = 1;
                    i++;
                }
                else
                {// general case 
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
}