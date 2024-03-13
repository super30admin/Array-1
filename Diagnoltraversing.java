class Solution {

    /* Time complexity : O(m* n);
    Space complexity : O(1);

    executed on leetcode;
    */ 
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int i =0;
        int j =0;
        int[] result = new int[m * n];
        boolean dir = true;
        for (int idx = 0; idx < m*n ; idx++){
            result[idx] = mat[i][j];
            if (dir){
                if (j ==n-1){
                    i++;
                    dir = false;
                }else if (i ==0){
                    j++;
                    dir =false;
                }else{
                    i--;
                    j++;
                }
            }else{
                if (i == m-1){
                    j++;
                    dir = true;
                }else if (j == 0){
                    i++;
                    dir = true;
                }else{
                    i++;
                    j--;
                }
            }
        }
        return result;
        
    }
}
