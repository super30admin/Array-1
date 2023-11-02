// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Keep track of the direction.
// While going up if we are at last column move down and switch direction, if in first row move right and switch direction
// While going down if we are at last row move right and switch direction, if in first column move down and switch direction


class Solution {
    
    public int[] findDiagonalOrder(int[][] mat) {
        int m= mat.length;
        int n= mat[0].length;  // as it is not a square matrix

        boolean UP=true;
        
        int[] result = new int[m*n];
        int resIndex=0;   //index for our result array
        
        int i=0, j=0;     // index for the matrix
        
        while(resIndex<m*n){   //we will run the loop until all elements get filled
            result[resIndex]= mat[i][j];
            resIndex++;
            
            if (UP){
                if(j==n-1){ // if we are in the last column we will switch down
                    i++;
                    UP=false;
                }
                else if(i==0){//if we are in the first row, we will switch down
                    j++;
                    UP=false;
                }
                else{ // if we are not at an edge we will simply traverse
                    i--;
                    j++;
                }
            }
            else{ // if the direction is down
                if(i==m-1){  //if we are in the last row we will switch right
                    j++;
                    UP=true;
                }
                else if(j==0){ //if we r in first column we will switch down
                    i++;
                    UP=true;
                }
                else{  // if we are not at an edge we will simply traverse
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
}