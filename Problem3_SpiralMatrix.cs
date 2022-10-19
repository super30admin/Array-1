// Approach: case analysis
// Time Complexity: O(mn) m is the number of rows and n is the number of columns in the matrix
// Space Complexity: O(1)
public class Solution {
    public IList<int> SpiralOrder(int[][] matrix) {
        int m = matrix.Length, n = matrix[0].Length;
        int rowStart = 0, colStart = 0, rowEnd = m-1, colEnd = n-1;
        int count = 0;
        
        List<int> ans = new List<int>();
        
        while(count < m*n){
            
            // left
            for(int i=colStart; i<=colEnd; i++){
                ans.Add(matrix[rowStart][i]);
                count++;
            }
            
            rowStart++;
            if(count == m*n) break;
            
            //down
            for(int i=rowStart; i<=rowEnd; i++){
                ans.Add(matrix[i][colEnd]);
                count++;
            }
            colEnd--;
            if(count == m*n) break;
            
            //right
            for(int i=colEnd; i>=colStart; i--){
                ans.Add(matrix[rowEnd][i]);
                count++;
            }
            rowEnd--;
            if(count == m*n) break;
            
            //up
            for(int i=rowEnd; i>=rowStart; i--){
                ans.Add(matrix[i][colStart]);
                count++;
            }
            colStart++;
        }
        
        return ans;
    }
}
