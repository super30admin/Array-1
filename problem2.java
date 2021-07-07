//time- O(M*N)- m-row, n-col
//space- O(1)

class Solution {
public int[] findDiagonalOrder(int[][] mat) {
        
    int dir=1;
    int m=mat.length, n= mat[0].length, i=0, row=0, col=0;
    
    int[] res= new int[m*n];
    
    while(i< m*n){
        
        res[i++]= mat[row][col];
        if(dir==1){
            
            if(col==n-1){
                row++;
                dir=-1;
                
            }
            else if(row==0){
                col++;
                dir=-1;
                
            }
            else{
                col++;
                row--;
            }
            

        }
        else{
            if(row==m-1){
                col++;
                dir=1;
                
                
            }
            else if(col==0){
                row++;
                dir=1;
                
                
            }
            else{
                row++;
                col--;
            }
        }
    }
    
    return res;
    
    
    
    
}
}