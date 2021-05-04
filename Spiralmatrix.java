// Time Complexity : O(rowscount*columnscount) - Since we are iterating over whole matrix
// Space Complexity : O(1) - No auxiliary space used
// Did this code successfully run on Leetcode : Yes

// I am using 4 pointers-> Top,Bottom,left,right.
// The idea is to go left to right, top to bottom, right to left, bottom to up. 
// After adding left to right elements, top is increased by 1
// After adding top to bottom, right is decreased by 1
// After adding right to left, bottom is decreased by 1
// After adding bottom to top, left is increased by 1

class Spiralmatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int top=0;
        int bottom = matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        while(top<=bottom && left<=right){
        
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);            
            }
            top++;
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom && left<=right){
            for(int i=right;i>=left;i--){
                result.add(matrix[bottom][i]);}
            bottom--;
            
     
        for(int i=bottom;i>=top;i-- ){
            result.add(matrix[i][left]);
        }
            left++;
            }
    }
         return result;
        }
       
    }