// Time Complexity : O(m * n)
// Space Complexity : O(1) -> ArrayList being created is for returning our answer, all we utilize are different pointers
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english
    //Use 4 variable : top, bottom, left, right to keep track of row and column
    //update it respectively after each iteration
    //append the element visited to the answer arrayList

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        //base case
        if(matrix == null || matrix.length == 0){
            return new ArrayList<>();
        }

        int m = matrix.length;
        int n = matrix[0].length;

        //Answer List
        List<Integer> answer = new ArrayList<>();

        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        
        while(top <= bottom && left <= right){
            //move left to right
            for(int i = left; i <= right; i++){
                answer.add(matrix[top][i]);
            }
            top++;
            //move top to bottom
            for(int i = top; i<=bottom; i++){
                answer.add(matrix[i][right]);
            }
            right--;
            //move right to left
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    answer.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //move bottom to top
            if(left<=right){
                for(int i = bottom; i >= top; i--){
                    answer.add(matrix[i][left]);
                }
                left++;
            }
        }

        return answer;

    }
}