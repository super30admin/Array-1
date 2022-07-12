//Time Complexity: O(m*n)
//Space Complexity: O(1)
//Does this code run on leetcode: Yes
// Any issues faced while running this code: No. 

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        ArrayList<Integer> ans = new ArrayList<>();
        int top = 0;
        int left = 0;
        int right = n-1;
        int bottom = m-1;

        while (top <= bottom && left <= right){
            for(int i = left ; i <= right ; i++)
                ans.add(matrix[top][i]);

            top++;

            if(top <= bottom && left <= right){
                for(int i = top; i <= bottom; i++)
                ans.add(matrix[i][right]);

                right--;
            }

            if(top <= bottom && left <= right){
                for(int i=right; i >= left; i--)
                    ans.add(matrix[bottom][i]);
                bottom--;
            }


            if(top <= bottom && left <= right){
                for(int i = bottom; i >= top; i--)
                    ans.add(matrix[i][left]);
                left++;  
            }
        }

        return ans;
    }
} 