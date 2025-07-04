class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> s=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int top=0,left=0,bottom=n-1,right=m-1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){ //left to right
                s.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){ //top to bottom
                s.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){//right to left
            for(int i=right;i>=left;i--){
                s.add(matrix[bottom][i]);
            }
            bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    s.add(matrix[i][left]);
                }
                left++;
            }

             
        }
        return s;
    }
}