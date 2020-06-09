// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

//In order to traverse the matrix accordingly we are using the all the edge cases like row == 0 where column == n-1 with the help of these 
//we can find that we have reached the end of the element and we have to rotate the direction of the traversal and we traverse by
//increase and decrease the column and row indices accordingly.

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix == null || matrix.length==0)return new int[0];
        int m = matrix.length;
        int n = matrix[0].length;
        int [] result = new int [m*n];
        int i=0;
        int r=0;
        int c=0;
        int dir =1;
        while(i < m*n){
            result[i] = matrix[r][c];
            if(dir == 1){
                if(c==n-1){
                    r++;
                    dir = -1;
                }else if(r == 0){
                    c++;
                    dir = -1;
                    }else{
                    r--;
                    c++;
                }
            }else{
                if(r==m-1){
                    c++;
                    dir = 1;
                }else if(c == 0){
                    r++;
                    dir = 1;
                    }else{
                    c--;
                    r++;
                }
            }
            i++;
        }
        return result;
    }
}