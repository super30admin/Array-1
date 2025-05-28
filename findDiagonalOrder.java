//time Complexity : O(m*n)
//space complexity : O(m*n)

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length; // no. of rows or column length
        int n = mat[0].length; // no. of columns or row length
        int[] result = new int[m*n];
        int i = 0;
        int j = 0;
        int k = 0;
        boolean direction = false;
        
        while(k < m*n){
            result[k] = mat[i][j];
            //logic towards top or forward
            if(!direction){
                if(j == n-1 ){
                    i++;
                    direction = true;
                }
                else if(i == 0){
                    j++;
                    direction = true;
                }
                else{
                    i--; j++;
                }
            }
            else{ // logic for bottom or downwards
                if(i == m-1){
                    j++;
                    direction = false;
                }
                else if(j == 0){
                    i++;
                    direction = false;
                }
                else{
                    i++; j--;
                }
            }
            k++;
        }

        return result;
    }
}