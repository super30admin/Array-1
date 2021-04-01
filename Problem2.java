//Diagonal Traversal Matrix
// Time Complexity :O(m*n)
// Space Complexity :O(1) if res array not considered
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
traverse the matrix in two direction, either up or down
assign a variable direction for it, having values, 1 or -1
whenever you go up, your row(i) gets decresing & column(j) 
gets increasing. Till the end of colum. After end you change the direction.
case2 if you are on the last row and go up, you just change the column and not row
Similarly for opp direction, you increase j and decrease i, till 0th column, For last row, just change the row and not col
*/


public class Problem2 {
    public static void main(String[] args){
        int M[][] = {
            { 1, 2, 3, 4 },     { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },  { 13, 14, 15, 16 },
            { 17, 18, 19, 20 },
        };
        int[] res = findDiagonalOrder(M);
        for(int num : res){
            System.out.print(" "+num);
        }

    }
    public static int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length ==0)
            return new int[]{};
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[] result = new int[m*n];
        int index = 0 , i = 0, j = 0, dir = 1;
        while(index < m*n){
            result[index] = matrix[i][j];
            if(dir==1){
                //i decreases j increases, generally
                if(j == n-1){
                    i++;
                    dir = -1;
                }
                else if(i==0){
                    j++;
                    dir = -1;
                }
                else{
                    i--;
                    j++;
                }
                
            }
            else{
                if(i == m-1){
                    j++;
                    dir = 1;
                }
                else if(j==0){
                    
                    i++;
                    dir = 1;
                }
                else{
                    //general case
                    i++;
                    j--;
                }
                
            }
            index++;
            
        }
        return result;
        
        
    }
    
    
}
