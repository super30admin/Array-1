
 // Time Complexity : O(n*m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        int left =0;
        int right = n-1;
        int top = 0;
        int bottom =m-1;
        while(top<=bottom && left<=right){
            
            //print first row 
            for(int i=left;i<=right;i++){
                res.add(matrix[top][i]);
            }
            top ++;
           //last col
            if(top<=bottom && left<=right){
                 for(int i=top; i<=bottom;i++){
              res.add(matrix[i][right]);
          }
            }
         
           right--;
          //last row
             if(top<=bottom && left<=right){
                 for(int i=right;i>=left;i--){
             res.add(matrix[bottom][i]);
         }
            }
        
        bottom --;
         //first col
             if(top<=bottom && left<=right){
                 for(int i=bottom; i>=top;i--){
            res.add(matrix[i][left]);
        } 
            }
      
            
         left++;   
            
        }
        return res;
    }
}