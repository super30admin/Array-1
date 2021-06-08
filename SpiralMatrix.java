// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Traversing the matrix sprially in recursion with four pointer top, bottom, left, right

// Your code here along with comments explaining your approach
class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ls =new ArrayList<>();
        if(matrix==null || matrix.length==0) return ls;
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                ls.add(matrix[top][i]);
            }
            top++;
            
            if(top<=bottom){
                for(int i=top;i<=bottom;i++){
                    ls.add(matrix[i][right]);
                }   
            }
            right--;
            
            if(left<=right && top<=bottom){
                for(int i=right;i>=left;i--){
                    ls.add(matrix[bottom][i]);
                }
            }
            bottom--;
            
            if(left<=right && top<=bottom){
                for(int i=bottom;i>=top;i--){
                    ls.add(matrix[i][left]);
                }
            }
            left++;
            
        }
        return ls;
    }
}