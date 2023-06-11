class Solution {
    //Time Complexity:-O(m*n)//Because you need to travel through all the element of the matrix
    //Space Complexity:-O(1)//Because you using the result List as the final return List so it will not be considered
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;int n=matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int top=0;int bottom = m-1;
        int left=0;int right=n-1;

        while(top<=bottom && left<=right){ 
            //top
            if(top<=bottom && left<=right){
                for(int i=left;i<=right;i++){
                    result.add(matrix[top][i]);
                }
                top++;
            }
            //right
            if(top<=bottom && left<=right){
                for(int i=top;i<=bottom;i++){
                    result.add(matrix[i][right]);
                }
                right--;
            }
            //bottom
            if(top<=bottom && left<=right){
                for(int i=right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //left
            if(top<=bottom && left<=right){
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}