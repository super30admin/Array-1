// linear time - o(m*n) and linear space - new array
class Solution{
    public int[] arr(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        List<integer>li = new ArrayList<>();

        while(left <= right && top <= bottom){
            for(int j = left; j <= right;j++){
                li.add(matrix[top][j]);

            }
            top++;
            for(int i = top;i<= bottom;i++){
                li.add(matrix[i][right]);
            }
            right--;

            if(left > right && top > bottom){
                break;
            }
            for(int j = right;j >= left;j--){
                li.add(matrix[bottom][j]);
            }
            bottom--;
            for(int i = bottom;i >= left;i++){
                li.add(matrix[i][left]);
            }
            left--;

        }
        return li;
    }
}