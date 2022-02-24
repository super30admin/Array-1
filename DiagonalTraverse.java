// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int[] arr = new int[mat.length*mat[0].length];
        int row = 0;
        int col = 0;
        int index = 0;
        boolean flag = true;
        while(row < mat.length && col <mat[0].length){
            arr[index] = mat[row][col];
            index = index+1;
            if(flag==true && col == mat[0].length-1){
                row = row +1;
                flag = false;
            }
            else if(flag==false && row == mat.length-1){
                col = col +1;
                flag = true;
            }
            else if(flag==true && row ==0 && col != mat[0].length-1){
                col = col +1;
                flag = false;
            }
            else if(flag==false && col==0 && row != mat.length-1){
                row = row +1;
                flag = true;
            }
            else if(flag == true){
                row = row -1;
                col = col +1;
            }
            else if(flag==false){
                row = row +1;
                col = col -1;
            }
        }
        return arr;
    }
}