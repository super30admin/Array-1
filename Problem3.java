// Time Complexity : O(N * M)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
/*
Traverse a 2D array in spiral order by maintaining four boundaries: top, bottom, left and right
Once the elements in a boundary are traversed and stored in the result list, increment or decrement the boundaries accordingly
 */
//Problem statement: https://leetcode.com/problems/spiral-matrix/

class Problem3 {
    public List<Integer> spiralOrder(int[][] matrix) {

        int left = 0, top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        List<Integer> list = new ArrayList<>();

        while(top <= bottom && left <= right){

            if(top <= bottom && left<= right){
                for(int i=left; i<= right; i++){
                    list.add(matrix[top][i]);
                }
                top++;
            }

            if(left <= right){
                for(int i=top; i<= bottom; i++){
                    list.add(matrix[i][right]);
                }
                right--;
            }

            if(top <= bottom){
                for(int i=right; i>= left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
                for(int i=bottom; i>= top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}