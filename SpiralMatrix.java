// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// with the help of 4 pointers, top, bottom, left and right, traverse through the matrix
// first traverse the top row and increment the top pointer
// then traverse the right column and decrement the right pointer
// then traverse the bottom row from right to left and decrement the bottom pointer
// then travers the left row from bottom to top and increment the left pointer

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>(); // initialize new ArrayList
        // return the empty list if the matrix is null or empty
        if(matrix == null || matrix.length == 0) return list;
        // initialize top, bottom, left and right pointers
        int top = 0; int bottom = matrix.length - 1;
        int left = 0; int right = matrix[0].length - 1;
        // while the pointers don't cross each other
        while(top <= bottom && left <= right){
            // traverse and store the top row from left to right
            if(top <= bottom && left <= right){
                for(int i = left; i <= right; i++){
                    list.add(matrix[top][i]);
                }
                top++;
            }

            // travserse and store the right column from top to bottom
            if(top <= bottom && left <= right){
                for(int i = top; i <= bottom; i++){
                    list.add(matrix[i][right]);
                }
                right--;
            }

            // travserse and store the bottom row from right to left
            if(top <= bottom && left <= right){
                for(int i = right; i >= left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // travserse and store the left column from bottom to top
            if(top <= bottom && left <= right){
                for(int i = bottom; i >= top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}