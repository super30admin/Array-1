class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int []result = new int[mat.length*mat[0].length];
        int direction = 1;
        int i =0;
        int j = 0;
        for(int k =0; k<mat.length*mat[0].length;k++) {
            result[k] = mat[i][j];
        if(direction == 1) {
            if(j == mat[0].length-1) {
                i++;
                direction = -1;
            }else if(i==0 ) {
               j++;
               direction = -1; 
            } else {
                i = i-1;
                j= j+1;
        }
        }else  {
            if(i == mat.length-1) {
                j++;
                direction = 1;
            }else if(j == 0) {
                i++;
                direction =1;
            } else {
                i= i+1;
                j = j-1;
            }
        }
        }
        return result;
    }
}