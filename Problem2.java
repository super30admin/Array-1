class Solution {
    
    private static int UP=0;
    private static int DOWN=1;
    
    public int[] findDiagonalOrder(int[][] mat) {
        int m= mat.length;
        int n= mat[0].length;  // as it is not a square matrix
        
        int[] result = new int[m*n];
        int resIndex=0;   //index for our result array
        
        int i=0, j=0;     // index for the matrix
        int direction = UP; //initilally we will go in the upward direction
        
        while(resIndex<m*n){   //we will run the loop until all elements get filled
            result[resIndex]= mat[i][j];
            resIndex++;
            
            if (direction==UP){
                if(j==n-1){ // if we are in the last column we will switch down
                    i++;
                    direction=DOWN;
                }
                else if(i==0){//if we are in the first row, we will switch down
                    j++;
                    direction=DOWN;
                }
                else{ // if we are not at an edge we will simply traverse
                    i--;
                    j++;
                }
            }
            else{ // if the direction is down
                if(i==m-1){  //if we are in the last row we will switch right
                    j++;
                    direction=UP;
                }
                else if(j==0){ //if we r in first column we will switch down
                    i++;
                    direction=UP;
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