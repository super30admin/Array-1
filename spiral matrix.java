time complexity: O(m*n)
space complexity: O(1)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>(); //creating a result list 
    if(matrix==null||matrix.length==0||matrix[0].length==0) //initial check
        return result;
 
    int m = matrix.length; //number of rows
    int n = matrix[0].length; //number of columns
 
    int left=0; //initialising all borders
    int right=n-1;
    int top = 0;
    int bottom = m-1;
 
    while(result.size()<m*n){ 
        for(int j=left; j<=right; j++){ //adding all the elements based on the condition check in spiral order
            result.add(matrix[top][j]); 
        }
        top++;
 
        for(int i=top; i<=bottom; i++){ 
            result.add(matrix[i][right]);
        }
        right--;
 
        //to prevent duplicate row
        if(bottom<top)
            break;
 
        for(int j=right; j>=left; j--){
            result.add(matrix[bottom][j]);
        }
        bottom--;
 
        // to prevent duplicate column
        if(right<left)
            break;
 
        for(int i=bottom; i>=top; i--){
            result.add(matrix[i][left]);
        }
        left++;
    }
 
    return result;
    }
}