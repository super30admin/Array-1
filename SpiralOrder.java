/*
 * Time Complexity : O(m*n)
 * Space Complexity : O(1)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No
 * 
 * Approach : We consider 4 pointers for our boundry, top, left, bottom and right. First we traverse from left to right of the top row and increment top by 1. Then we traverse from top to 
 * bottom of the right column and decrement right by 1. We traverse from right to left of the bottom row and decrement bottom by 1 and lastly we travserrse from left to right of the first column
 * and increment left by 1. We continue this until top pointer is greater than bottom pointer and left pointer is greater than right pointer.
 * 
 * //https://leetcode.com/problems/spiral-matrix/description/
 */


class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> result = new ArrayList<Integer>(); 
        int top=0,bottom=m-1,right=n-1,left=0;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            if(top<=bottom && left<=right){
                for(int i=top;i<=bottom;i++){
                    result.add(matrix[i][right]);
                }
            }
            right--;
            if(top<=bottom && left<=right){
                for(int i=right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if(top<=bottom && left<=right){
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        return result;
    }
}