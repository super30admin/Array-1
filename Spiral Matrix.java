// time - n^2
// space - constant

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int top = 0;
        int bottom = matrix.length-1;
        int right = matrix[0].length-1;
        int left = 0;
        List<Integer> ans = new ArrayList<>();

        while(left <= right && top <= bottom)
        {
            for(int i=left ; i<=right ; i++)
            {
                ans.add(matrix[top][i]);
            }

            top++;

            for(int i=top ; i<=bottom ; i++)
            {
                ans.add(matrix[i][right]);
            }

            right--;

            for(int i=right ; i>=left ; i-- )
            {
                ans.add(matrix[bottom][i]);
            }

            bottom --;

            for(int i=bottom ; i>=top ; i--)
            {
                ans.add(matrix[i][left]);
            }

            left++;
        }

        while(ans.size()>matrix.length*matrix[0].length)
        {
            ans.remove(ans.size()-1);
        }

        return ans;
    }
}
