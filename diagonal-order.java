// Time - O(MN)
// Space - O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int dir = 1;
        int i = 0, j = 0;
        if(matrix == null || matrix.length == 0) {
            return new int[] {} ;
        }
        int m = matrix.length, n = matrix[0].length;
        int total = n * m;
        int[] res = new int[total];
        int ele = 0;
        while(ele < total) {
            res[ele] = matrix[i][j];
            ele += 1;
            
            if(dir == 1) {
                    if(j== n - 1) {
                        dir = -1;
                        i++;
                    }
                    else if(i==0) {
                        dir = -1;
                        j++;
                    }
                    else {
                        i--;
                        j++;
                    }
                    
            }
            else {
                if(i==m-1) {
                    dir = 1;
                    j++;                    
                }
                else if(j==0) {
                    dir = 1;
                    i++;
                }
                else {
                    j--;
                    i++;
                } 
            }
            
        }
        return res;
    }
}
