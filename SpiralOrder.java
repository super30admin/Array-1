// Time Complexity : O(n*m) , n and m are dimensions of input matrix
// Space Complexity : O(1) . result space in not extra space
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        List<Integer> answer = new ArrayList();

        int top=0, bottom=n-1, left=0, right=m-1;

        while(top <= bottom && left <= right)
        {
            for(int i=left; i<=right; i++)
                answer.add(matrix[top][i]);
            top++;

            for(int i=top; i<=bottom; i++)
                answer.add(matrix[i][right]);
            right--;

            if(top>bottom || left>right)
                break;

            for(int i=right; i>=left; i--)
                answer.add(matrix[bottom][i]);
            bottom--;

            for(int i=bottom; i>=top; i--)
                answer.add(matrix[i][left]);
            left++;
        }

        return answer;

    }
}
