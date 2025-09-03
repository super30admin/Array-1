// TC: O(m * n) SC: O(1)
// Ran on leetcode - Yes
/*
Traverse left to right, Traverse top to bottom, Traverse right to left and Traverse bottom to top from outside in recursively till there are no elements left
*/
class Solution3 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        List<Integer> re = new ArrayList<>();

        // Check the base condition is still valid
        while(left <= right && bottom >= top){

            //Traverse left to right
            if(left <= right && bottom >= top){
                for(int i = left; i <= right; i++){
                    re.add(matrix[top][i]);
                }
                top++;
            }

            //Traverse top to bottom
            if(left <= right && bottom >= top){
                for(int i = top; i <= bottom; i++){
                    re.add(matrix[i][right]);
                }  
                right--;  
            }

            //Traverse right to left
            if(left <= right && bottom >= top){
                for(int i = right; i >= left; i--){
                    re.add(matrix[bottom][i]);
                }   
                bottom--;     
            }

            //Traverse bottom to top
            if(left <= right && bottom >= top){
                for(int i = bottom; i >= top; i--){
                    re.add(matrix[i][left]);
                }   
                left++; 
            }
        }

        return re;
    }
}