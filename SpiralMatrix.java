class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        //base case
        if(matrix == null || matrix.length == 0) return new ArrayList<Integer>();

        //define boundaries
        int top=0, left=0, right = matrix[0].length-1, bottom = matrix.length-1;
        List<Integer> result = new ArrayList<>();

        //continue till right crosses left and top crosses bottom
        while(top<=bottom && left<=right){
            //travel from left to right in the top row and increment top
            for(int i=left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            //travel from top to bottom in the right col and decrement right
            for(int i=top; i<=bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;

            //since top & right are changed previously, and left right boundary is checked in for loop, check only for top bottom boundary
            if(top<=bottom) {
                //travel from right to left in the bottom row and decrement bottom
                for(int i=right; i>=left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //since top, right & bottom are changed previously, and top bottom boundary is checked in for loop, check only for left right boundary
            if(left<=right) {
                //travel from bottom to top in the left col and increment left
                for(int i=bottom; i>=top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}