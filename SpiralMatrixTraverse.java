// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No

//Time Complexity : O(m * n) since we are iterating through the dp matrix 
//Space Complexity: O(1) since we are not using extra space except resultList 

public List<Integer> spiralOrder(int[][] matrix) {
      ArrayList<Integer> returnList = new ArrayList<>();
      if(matrix == null || matrix.length == 0) return returnList;
      int left = 0;
      int right = matrix[0].length - 1;
      int top = 0;
      int bottom = matrix.length - 1;
        
      while(left <= right && top <= bottom){
          
          //Left to right iteration
          for(int i = left; i <= right; i++){
              returnList.add(matrix[top][i]);
          }
          //Squeeze the top
          top++;
          
          // Top to Bottom Iteration
          for(int i = top; i <= bottom; i++){
              returnList.add(matrix[i][right]);
          }
          
          //Squeeze right
          right--;
          
          // Recheck the condition since top is modified after squeeze
          if(top <= bottom){ 
            // Right to Left Iteration
            for(int i = right; i >= left; i--){
              returnList.add(matrix[bottom][i]);
            }   
          }          
          //Squeeze bottom
          bottom--;
          
          //Recheck this condition since the right is modified after squeeze
          if(left <= right){
              //Bottom to Top iteration
              for(int i = bottom; i >= top; i--){
                  returnList.add(matrix[i][left]);
              }
          }
          //Squeeze Left
          left++;          
      }
        
      return returnList;
}