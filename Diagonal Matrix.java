//time compelxity: o(m*n)
//space complexity: O(1)
// Did this code successfully run on Leetcode :yes

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
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
       
        return array;
        
        
    }
}