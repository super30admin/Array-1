//TC: O(m*n)
//SC: O(1)
public class DiagonalTraverse {
    class Solution {
        public int[] findDiagonalOrder(int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;
            if(mat == null || m == 0)
                return new int[0];

            int[] result = new int[m * n];
            int k = 0, i = 0, j = 0;
            int dir = 1;    //up

            while(k < m * n)
            {
                result[k++] = mat[i][j];
                if(dir == 1)
                {
                    if(j == n - 1)
                    {
                        i++;
                        dir = -1;
                    }
                    else if(i == 0)
                    {
                        j++;
                        dir = -1;
                    }
                    else
                    {
                        i--;
                        j++;
                    }
                }
                else
                {
                    if(i == m - 1)
                    {
                        j++;
                        dir = 1;
                    }
                    else if(j == 0)
                    {
                        i++;
                        dir = 1;
                    }
                    else
                    {
                        j--;
                        i++;
                    }
                }
            }
            return result;
        }
    }
}
