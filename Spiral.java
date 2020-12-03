class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        if(matrix == null || matrix.length == 0){
            return ans;
        }
        int row_lower = 0;
        int row_upper = matrix.length-1;
        int col_lower = 0;
        int col_upper = matrix[0].length-1;
        while(row_lower<=row_upper && col_lower<=col_upper){
            for(int i=col_lower;i<=col_upper;i++){
                ans.add(matrix[row_lower][i]);
            }
            for(int i=row_lower+1;i<=row_upper;i++){
                ans.add(matrix[i][col_upper]);
            }
            if(row_lower<row_upper && col_lower<col_upper){
                for(int i=col_upper-1;i>=col_lower;i--){
                    ans.add(matrix[row_upper][i]);
                }
                for(int i=row_upper-1;i>row_lower;i--){
                    ans.add(matrix[i][col_lower]);
                }
            }
            row_lower++;
            row_upper--;
            col_lower++;
            col_upper--;
        }
        return ans;
    }
}