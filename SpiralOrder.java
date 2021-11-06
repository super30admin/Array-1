class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        List<Integer> result = new ArrayList<>();
        while(left<=right && top <= bottom){
            for(int i=left;i<=right&&top<matrix.length;i++)
                result.add(matrix[top][i]);
            for(int i=top+1;i<=bottom&&right>=0;i++)
                result.add(matrix[i][right]);
            for(int i=right-1;i>=left&&bottom!=top&&bottom>=0;i--)
                result.add(matrix[bottom][i]);
            for(int i=bottom-1;i>=top+1&&left!=right&&left<matrix[0].length;i--)
                result.add(matrix[i][left]);

            left++;
            top++;
            right--;
            bottom--;
        }
        return result;
    }
}