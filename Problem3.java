//ZigZag order
// Time Complexity : O(m*n)
// Space Complexity :O(1) if res array not counted
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Your code here along with comments explaining your approach
/*
traverse the matrix from 0,j=0, when you reach last column, increase the row, till
last row, when you reach last row, decrease colu, 
then again decrease the row, if you reach first column, and go on, till you cover all elem 
*/
public class Problem3 {
    public static void main(String[] args){
        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] input2 = {{1,2,3,4},{5,6,7,8,},{9,10,11,12}};
        int[] res = ZigZagOrder(input2);
        for(int num : res){
            System.out.print(" "+num);

        }
        

    }
    public static int[] ZigZagOrder(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int[] res = new int[n*m];
        int last_col = m-1;
        int last_row = n-1;
        int k =0,l=0, index=0;
        while(k <= last_row && l <= last_col){
            //traverse the 1st row 
            //1,2,3
            for(int i = l; i<=last_col; i++){
                res[index++] = matrix[k][i]; 
            }
            k++;
            //3,6,9
            for(int i = k; i<=last_row; i++){
                res[index++] = matrix[i][last_col];
            }
            //you reach last row and last col
            last_col--;
            if(k<=last_row){
                for(int i = last_col; i>=l; i--){
                    res[index++] = matrix[last_row][i];
                }
                last_row--;
            }
            if(l <= last_col){
                for(int i = last_row; i>=k; i--){
                    res[index++] = matrix[i][l];
                }
                l++;
            }


        }
        
        return res;
    }
    
}
