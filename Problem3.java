// Time Complexity : O(n*m) as it is is looping through all elements in matrix
// Space Complexity : O(1) as we are using and returning same list
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Problem3 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0 || matrix == null){
            return new ArrayList<Integer>();
        }

        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;

        while(left <= right && top <= bottom){
            //moving from left to right
            for(int i = left; i <= right; i++){
                list.add(matrix[top][i]);
            }
            top++;

            //moving from top to bottom
            for(int i = top; i <= bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;

            //moving from right to left
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //moving from bottom to top
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }
}
