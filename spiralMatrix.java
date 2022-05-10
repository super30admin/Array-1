class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>result = new ArrayList<>();
        int m= matrix.length,n=matrix[0].length;
        int top=0,bottom=m-1,left=0,right=n-1,i,j;
        while(left<=right && top<=bottom){
            for(j=left;j<=right;j++){
                result.add(matrix[top][j]);
            }
            top++;
            for(i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(left<=right && top<=bottom){
                for(j=right;j>=left;j--){
                result.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left<=right && top<=bottom){
                for(i=bottom;i>=top;i--){
                result.add(matrix[i][left]);
                }
                left++;
            }
            
        }
        return result;
    }
}