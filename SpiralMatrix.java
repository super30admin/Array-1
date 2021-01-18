// Time Complexity : 0(m*n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        if(matrix == null || matrix.length == 0)
            return list;
        if(matrix[0].length == 0)
            return list;

        int top = 0, bottom = matrix.length-1;
        int left = 0, right = matrix[0].length-1;

        while(top<=bottom && left<=right){

            //top row left to right
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;

            //right col top to bottom
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;

            //bottom row right to left
            if(top<=bottom){ //bcoz top might have increased after case 1
                for(int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
            }
            bottom--;

            //left col bottom to top
            if(left<=right){ //bcoz right might have decreased after case 2
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
            }
            left++;
        }
        return list;
    }
}