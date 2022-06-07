class Solution {
    //Time complexity:O(m*n)
    //Space complexity: O(1)
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> res=new ArrayList<>();
        int left=0,right=n-1,top=0,bottom=m-1;
        while(left<=right && top<=bottom){
            for(int j=left;j<=right;j++){
                res.add(matrix[top][j]);
            }
            top++;
            if(left<=right && top<=bottom){
                for(int i=top;i<=bottom;i++){
                    res.add(matrix[i][right]);
                }
            }
            right--;
            if(left<=right && top<=bottom){
                for(int j=right;j>=left;j--){
                    res.add(matrix[bottom][j]);
                }
            }
            bottom--;
            if(left<=right && top<=bottom){
                for(int i=bottom;i>=top;i--){
                    res.add(matrix[i][left]);
                }
            }
            left++;
        }
        return res;
    }
}