// Time Complexity : O(n*m) where n and m are dimensions of matrix mat[][]
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//There are two movements Up and Down
//We will start with up direction and write conditions for up and down movements
// We will repeat untill we have covered all the elements in the matrix i.e. m*n

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        /* Up direction movement - x-1, y+1
        start with up, shift to down when x < 0, y > n
        
        Down direction movement - x+1, y-1
        shift to up when y < 0 and x > m
        When to end - when reached matrix position x = m-1, y = n-1;
        */
        int n = mat[0].length;
        int m = mat.length;
        int[] array = new int[n * m];
        int x = 0, y = 0, count = 0;
        boolean goUp = true;
        while(count < n*m){
            array[count++] = mat[x][y];
            if(goUp){
                x = x - 1;
                y = y + 1;
            }
            else{
                x = x + 1;
                y = y - 1;
            }
            if(x < 0 || y >= n){
                //go down
                goUp = false;
                x++;
                if(y >= n){
                    x++;
                    y--;
                }
            }
            else if(x >= m || y < 0){
                //go up
                goUp = true;
                y++;
                if(x >= m){
                    x--;
                    y++;
                }
            }
        }
        //array[count-1] = mat[m - 1][n - 1];
        return array;
    }
}