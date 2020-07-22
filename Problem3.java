// Time Complexity : O(mn)
// Space Complexity : O(1) if we dont consider the output array
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

1.We assign 4 boundaries left, top, right, bottom
2.We start traversing in the given order and every time we traverse a whole row or column we shrinnk the boundaries
3.And respectively add all the traversed elements to the output array

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li = new LinkedList<>();
        
        if(matrix == null || matrix.length == 0)
            return li;
        
        int top = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;
        int left = 0;
        int size = (right+1)*(bottom+1);
        
        while(li.size()<size){
            for(int i=left; i<=right && li.size()<size; i++){
                li.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=bottom && li.size()<size; i++){
                li.add(matrix[i][right]);
            }
            right--;
            for(int i=right; i>=left && li.size()<size; i--){
                li.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i=bottom; i>=top && li.size()<size; i--){
                li.add(matrix[i][left]);
            }
            left++;
        }
        return li;
    }
}