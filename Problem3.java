import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(m*n)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode : Yes
// Any issues faced: No Problems faced

// Your code here along with comments explaining your approach
public class Problem3 {
	public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        
        //base case
        if(matrix.length==0)
            return res;
        //initialization of rows and col index
        int rowBegin=0;
        int rowEnd = matrix.length-1;
        int colBegin =0;
        int colEnd = matrix[0].length -1;
        
        while(rowBegin<=rowEnd && colBegin<=colEnd){
            
            //traverse left to right
            for(int i = colBegin;i<=colEnd;i++){
                res.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            
            //traverse top-down
            for(int i = rowBegin; i<=rowEnd ; i++){
                res.add(matrix[i][colEnd]);
            }
            colEnd--;
            
            if(rowBegin<=rowEnd){
                //traverse right to left
                for(int i = colEnd; i>= colBegin ;i--){
                    res.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;
            
            if(colBegin<=colEnd){
                //traverse bottom-up
                for(int i = rowEnd;i>=rowBegin;i--){
                    res.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        return res;
    }
}
