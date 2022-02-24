// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output = new ArrayList<Integer>();
        int count = 0;
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int dir = 1;
        int row =0;
        int col =0;
        while(count<matrix.length*matrix[0].length){
            output.add(matrix[row][col]);
            if(dir == 1){
                if(col==right){
                    row++;
                    dir = 2;
                    top++;
                }
                else{
                    col++;
                }
            }
            else if(dir == 2){
                if(row==bottom){
                    col--;
                    dir =3;
                    right--;
                }
                else{
                    row++;
                }
            }
            else if(dir == 3){
                if(col==left){
                    row--;
                    dir =4;
                    bottom--;
                }
                else{
                    col--;
                }
            }
            else if(dir == 4){
                if(row==top){
                    col++;
                    dir =1;
                    left++;
                }
                else{
                    row--;
                }
            }
            count++;
        }
        return output;
    }
}