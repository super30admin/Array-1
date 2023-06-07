// Time Complexity : O(m*n)
// Space Complexity :  O(n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return new int[]{};
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];

        int c=0,r =0;
        result[0]= mat[0][0];
        int index = 0;
        int direction = 1;// 1=> upward direction , -1 => downward direction
        while(index < m * n ){
            result[index] = mat[r][c];
            index++;
            if(direction==1){//traversing upward direction
                if(c==n-1){// checking if the column is at the last
                direction = -1;
                r++;
                }
                else if(r==0){
                    direction = -1;
                    c++;

                }
                else{
                    //base case when moving upwards row increase and column decrease
                    r--;
                    c++;

                }
            }
            else{//traversing through downward direction
            if(r== m-1){
                direction = 1;
                c++;

            }
            else if(c==0){
  direction = 1;
  r++;

            }
            else{
                r++;
                c--;

            }

            }
        }
return result;
        
    }
}