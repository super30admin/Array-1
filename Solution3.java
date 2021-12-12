import java.util.ArrayList;
import java.util.List;

// Time Complexity :O(mn) m=no of rows,n=no of columns
// Space Complexity :O(1) no extra space used
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Defined the boundaries using 4 variables
// Tried both iterative and recursive solutions
public class Solution3 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null|| matrix[0].length==0)
            return new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        int m=matrix.length;
        int n=matrix[0].length;
        //specifying boundaries with 4 variables
        int top=0;
        int bottom=m-1;
        int left=0;
        int right=n-1;
        while(top<=bottom && left<=right){
            
            for(int j=left;j<=right;j++){
                result.add(matrix[top][j]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            // to check if the variables are still in boiunds to avoid duplicate entry
            if(top<=bottom && left<=right){
                
                for(int j=right;j>=left;j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
            
        }
        return result; 

    }
    //
    public List<Integer> spiralOrderrecursive(int[][] matrix) {
        if(matrix==null|| matrix[0].length==0)
            return new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        int m=matrix.length;
        int n=matrix[0].length;
        //specifying boundaries with 4 variables
        int top=0;
        int bottom=m-1;
        int left=0;
        int right=n-1;
      
        helper(matrix,0,m-1,0,n-1,result);
        return result;
    }
    private void helper(int [][] matrix,int top,int bottom, int left,int right,List<Integer> result){
        
        
        //base case
        if(top>bottom || left>right)
            return;
        
        // logic
        for(int j=left;j<=right;j++){
                result.add(matrix[top][j]);
            }
            for(int i=top+1;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            // to check if the variables are still in boiunds to avoid duplicate entry
            if(top+1<=bottom && left+1<=right){
                
                for(int j=right-1;j>=left;j--){
                    result.add(matrix[bottom][j]);
                }
                for(int i=bottom-1;i>top;i--){
                    result.add(matrix[i][left]);
                }
            }
        helper(matrix,top+1,bottom-1,left+1,right-1,result);
    }
}
