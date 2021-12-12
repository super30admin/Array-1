// Time Complexity :O(mn)m=no of rows,n=no of columns
// Space Complexity :O(1) no extra space used
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// use a direction variable to manipulate theindices
// observed when the direction changes from upward to downward what happen to i and j
// observed the same for downward movement as well
// Your code here along with comments explaining your approach
public class Solution2 {
    public int[] findDiagonalOrder(int[][] mat) {
    int m=mat.length;
    int n=mat[0].length;
    // dir=1 upwards
    //dir=-1 downwards
    //initially moving up
    int dir=1;
    int[] result=new int[m*n];
    int i,j,index;
    i=0;
    j=0;
    index=0;
    //when both row and column index are within bounds
   while(i<m &&j<n){
            result[index]=mat[i][j];
            if(dir==1){
                //in the last column we only move the next row for downward movement
                if(j==n-1){
                    i++;
                    dir=-1;
                }
                //in the first row we only move to next column for the downward movement
                else if(i==0){
                    j++;
                    dir=-1;
                }
                // general cases
                else{
                    i--;
                    j++;
                }
                
            }
       // for downward movement
            else{
                // in the last row we just move the column for upward movement
                if(i==m-1){
                    j++;
                    dir=1;
                }
                // in the first column we just move row for upward movement
                else if(j==0){
                    i++;
                    dir=1;
                }
            // for general cases
                else{
                    j--;
                    i++;
                }
            
        }
       index++;
    }
    return result;
}
}
