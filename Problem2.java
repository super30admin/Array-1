// Time Complexity : o(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// I used the direction variable to keep the track of direction to up or down
	
// Your code here along with comments explaining your approach

class problem2 {
    public int[] findDiagonalOrder(int[][] matrix) {
        int result[]=null;
        if (matrix==null|| matrix.length==0){
            return new int[0];
        }
        int m=matrix.length;
        int n=matrix[0].length;
        int row=0;
        int col=0;
        result=new int[m*n];
        int index=0;
        int direction=1;
        
        while(index<m*n){
            //System.out.
            result[index]=matrix[row][col];
            
            if(direction==1){
                if(col==n-1){
                    direction=0;
                    row++;
                }
                else if(row==0){
                    direction=0;
                    col++;
                }
                else{
                    row--;
                    col++;
                }
                
            }
            else if(direction==0){
                if(row==m-1){
                    direction=1;
                    col++;
                }
                else if(col==0){
                    direction=1;
                    row++;
                }
                else{
                    row++;
                    col--;
                }
                
            }
            index++;
        }
        
        return result;
        
    }
}