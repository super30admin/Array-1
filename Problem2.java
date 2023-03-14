// Time: O(N)
// Space: O(m*n) total elements
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)   return new int[]{};
        
        boolean flag = true;
        int i = 0, j = 0, m = matrix.length, n = matrix[0].length, count = 0;
        int[] res = new int[m * n];
        
        while(i <= m - 1 && j <= n - 1){
            if(flag){
                while(i > 0 && j < n - 1){
                    res[count++] = matrix[i][j];
                    i--;
                    j++;
                }
                res[count++] = matrix[i][j];
                if(j != n - 1)  j++;
                else            i++;
            }else{
                while(i < m - 1 && j > 0){
                    res[count++] = matrix[i][j];
                    i++;
                    j--;
                }
                res[count++] = matrix[i][j];
                if(i != m - 1)  i++;
                else            j++;
            }
            flag = !flag;
        }
        
        return res;
    }
}


// Time: O(N)
// Space: O(m*n) total elements
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)   return new int[]{};
        
        boolean flag = true;
        int i = 0, j = 0, m = matrix.length, n = matrix[0].length, count = 0;
        int[] res = new int[m * n];
        
        while(i <= m - 1 && j <= n - 1){
            if(flag){
                while(i > 0 && j < n - 1){
                    res[count++] = matrix[i][j];
                    i--;
                    j++;
                }
                res[count++] = matrix[i][j];
                if(j != n - 1)  j++;
                else            i++;
            }else{
                while(i < m - 1 && j > 0){
                    res[count++] = matrix[i][j];
                    i++;
                    j--;
                }
                res[count++] = matrix[i][j];
                if(i != m - 1)  i++;
                else            j++;
            }
            flag = !flag;
        }
        
        return res;
    }
}

