// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] arr = new int[m*n];
        int UP = 0, DOWN = 1;
        int direction = UP;
        int i=0, j=0;
        int index = 0;
        while(i>=0 && i<m && j>=0 && j<n){
            arr[index] = mat[i][j];
            index++;
            if(direction == UP){
                if(j==n-1){         //For changing direction, if it is in the last column then moving down.
                    i++;
                    direction = DOWN;
                }
               else if(i==0){   //If it is in first row and not in last column then moving right and changing direction.
                    j++;
                    direction = DOWN;
                }
                else{
                    i--;            //else continue the diagnol in the up side
                    j++;
                }
            }
            else{
                 if(i==m-1){ //For changing direction, if it is in the last row then moving right
                    j++;
                    direction = UP;
                }
                else if(j==0){ //Else if in first column then moving down to change direction.
                    i++;
                    direction = UP;
                }
                else{               //else continue the diagnol in the down side
                    i++;
                    j--;
                }
            }
        }
        return arr;
    }
}
