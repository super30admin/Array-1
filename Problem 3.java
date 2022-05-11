class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m= matrix.length; int n= matrix[0].length;
        List<Integer> result = new ArrayList<>(); //initalize a array list

        int top=0 ;int left=0; int right= n-1; int bottom = m-1; //four pointers
        while(left<=right && top<=bottom){ //while condition for iterations
            //top row
            for(int j=left; j<=right; j++){ //for top row
                result.add(matrix[top][j]);
            }
            top++;
            if(left<=right && top<=bottom){ //for right column, condition again so that while condition sometimes fail if there are more than one conditions inside
            //right column
                for(int i=top; i<=bottom; i++){
                    result.add(matrix[i][right]);
                }
            }
            right--;
            if(left<=right && top<=bottom){ //same as top conditons
            //bottom row
            for(int j=right; j>=left; j--){
                result.add(matrix[bottom][j]);
                }
            }    
            bottom--;
            if(left<=right && top<=bottom){
            //left column
            for(int i=bottom; i>=top; i--){
                result.add(matrix[i][left]);
            }
        }
            left++;
        }
        return result;
}
}
