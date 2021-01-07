// Time Complexity : O(n*m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english
//we choose direction at every step, that whether we want to move up or down and modify i and pointer accordingly
//boundary check is very important here

class DiagonalTraversal {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0){
            return new int[0];
        }
        
        int i =0;
        int j= 0;
        int index=0;
        
        int m = matrix.length;
        int n = matrix[0].length;
        int[]res = new int[m*n];
        Di
        int dir =1;
        while(index < res.length){
            res[index] = matrix[i][j];
            
            if(dir == 1){//moving upwards
                if(j == n-1){
                    i++;
                    dir = -1;
                }else if(i == 0){
                    j++;
                    dir = -1;
                }else{
                    //as we are moving up
                    i--;
                    j++;
                }
            }
            else{//moving downwards
                
                if(i == m-1){
                    j++;
                    dir = 1;
                }else if(j == 0){
                    i++;
                    dir = 1;
                }else{
                    i++;
                    j--;
                }
                
            }
            
            index+=1;//for result array
         
           
        }
        
            return res;
            
    }
}