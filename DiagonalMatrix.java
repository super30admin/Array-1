// Time Complexity : O(Row * Col) - as we traverse every element in the matrix
// Space Complexity :O(1) - constant space
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english


//Here we represent direction as upward or downward. 
//Check of three conditions in each case. 
// Upward: 1. If col reached max, change dir, then increment row because col will go out of bounds.
//         2. If row is zero, change dir, increment col. 
//         3. else row-- & col++.
//Downward: 1. If row reached max, change dir, then increment col because row will go out of bounds.
//          2. If col is zero, change dir, increment row. 
//          3. else row++ & col--.

public class DiagonalMatrix {

    public static int[] diagonalMatrix(int[][] matrix){

        if( matrix == null || matrix.length == 0) return new int[0];

        int n = matrix.length, m = matrix[0].length;
        int[] output = new int[n*m];
        boolean isUp = true;

        int pointer = 0, i = 0, j = 0;

        while( pointer < n*m ){
            output[pointer++] = matrix[i][j];
            if(isUp){

                if( j == n-1){
                    i++;
                    isUp = false;
                }else if( i == 0){
                    j++;
                    isUp = false;
                }else{
                    i--;
                    j++;
                }

            }else{
                if(i == m-1){
                    j++;
                    isUp = true;
                }else if( j == 0){
                    i++;
                    isUp = true;
                }else{
                    i++;
                    j--;
                }
            }
        }

        return output;

    }

    public static void main(String[] args){

        int[][] matrix =  {{1,2,3},{4,5,6},{7,8,9}};
        int[] res  = diagonalMatrix(matrix);

        for( int num: res){
            System.out.print(num+ " ");
        }
    

    }
    
    
}
