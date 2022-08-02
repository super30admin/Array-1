// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: maintain four directions top, bottom, left, right. Manipulate the direction once the element in that direction is traversed in spiral direction, store the value in the array and return it. Remember whenever you manupulate within the while loop make sure you always check the initial while condition

// Your code here along with comments explaining your approach





class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0) return new ArrayList<>();
        int m=matrix.length; int n=matrix[0].length;
        //maintain four direction to take care of boundaries
        int left=0; int right=n-1;
        int top=0; int bottom=m-1;
        
        List <Integer> result= new ArrayList <>();
        
        while(top<=bottom && left<=right){
            for(int j=left; j<=right; j++){
                result.add(matrix[top][j]);
            }top++;
            if(top<=bottom && left<=right){
                for(int i=top; i<=bottom; i++){
                    result.add(matrix[i][right]);
                }
            }right--;
            if(top<=bottom && left<=right){
                for(int j=right; j>=left; j--){
                    result.add(matrix[bottom][j]);
                }
            }bottom--;
            if(top<=bottom && left<=right){
                for(int i=bottom; i>=top; i--){
                    result.add(matrix[i][left]);
                }
            }left++;
        }
        return result;
    }
}