// Time Complexity : O(nm)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//a. you take 4 indexes - namely rowStart, rowEnd, colStart, colEnd - as we need to update the indexes to go in spiral
//b. when going to the right we need to only update the cols index and while going bottom the rows index
//c. we go left or to the top only if the rowStart<=rowEnd or colStart<=colEnd - otherwise we can end the cycle

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix.length==0){
            return null;
        }
        
        int rowStart = 0;
        int rowEnd = matrix.length-1;
        int colStart = 0;
        int colEnd = matrix[0].length-1;
        
        while(rowStart<=rowEnd && colStart<=colEnd){
            //case1 - towards right
            for(int j=colStart;j<=colEnd;j++){
                result.add(matrix[rowStart][j]);
            }
            rowStart++;
            
            //case2 - towards bottom
            for(int i=rowStart;i<=rowEnd;i++){
                result.add(matrix[i][colEnd]);
            }
            colEnd--;
            
            //case3 - towards left
            if(rowStart<=rowEnd){
                for(int j=colEnd;j>=colStart;j--){
                    result.add(matrix[rowEnd][j]);
                }      
            }
            rowEnd--;
            
            //case4 - towards top
            if(colStart<=colEnd){
                for(int i=rowEnd;i>=rowStart;i--){
                    result.add(matrix[i][colStart]);
                }
            }
            colStart++;
        }
        
        return result;
    }
}