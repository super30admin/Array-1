/**
 *
 * Time Complexity - O(m*n) - m=rows n=cols
 * Space Complexity - O(1) - No extra Space
 */


class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        // base case
        if(matrix == null || matrix.length==0){
            return new int[0];
        }

        int rows = matrix.length, cols = matrix[0].length;
        int[] arr= new int[rows*cols];
        int r=0,c=0,i=0;
        while(i < rows*cols){
            arr[i] = matrix[r][c];
            if((r+c)% 2==0){
                if(c == cols-1){
                    r++;
                }else if(r == 0){
                    c++;
                }else{
                    r--;
                    c++;
                }
            }else{

                if(r == rows-1){
                    c++;
                }else if(c==0){
                    r++;
                }else{
                    r++;
                    c--;
                }
            }
            i++;
        }

        return arr;
    }
}