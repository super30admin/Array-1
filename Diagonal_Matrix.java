/*
    Time Complexity : O(M*N) M =  no of rows, N = no of columns
    Space Complexity : O(1) No space except output array
    Is Worked on LeetCode : YES
    Difficulty Faced : While Handling edge case 
*/
public class Diagonal_Matrix{

    public int[] findDiagonalOrder(int[][] matrix) {
        
        if (matrix == null  || matrix.length == 0) return new int[0];
        int m = matrix.length;
        int n = matrix[0].length;
        
        int row=0;
        int col=0;
        int dir =1 ;
        int index = 0;
        int[]  arr = new int [m*n];
        
        while(index < m*n){
            
            arr[index]  = matrix[row][col];
//             upword direction
            if(dir == 1){
                // what if we are in last column change the direction and increment row 
                if(col ==  n-1){
                    dir = -1;
                    row++;
                }
                // first row you can not go upword so change the direction increment the 
                // column                
                else if( row == 0){
                    col++;
                    dir = -1;
                }
                //                 if we are not in first row and not in last column then 
                //                 increment row and  column
                else{
                    col++;
                    row--;
                }
            } 
            // direction is downword             
            else{
                // What if we are in  last row then increment the column and change the                    direction to upwrod
                if( row == m-1){
                    dir = 1;
                    col++;
                }
                // What if we are in first column  then    incremenet the row and change 
                // the direction
                else if(col == 0){
                    dir = 1;
                    row++;
                }else{
                    col--;
                    row++;
                }
            }
            index++;
        }
        return arr;
    }
}