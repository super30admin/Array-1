// time complexity : O(m*n)
// space complexity : O(1)
// Did this code successfully run on Leetcode : Yes
import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> l = new ArrayList<>();
        int left = 0, r = n-1, top = 0, bottom = m-1;
        while(left<=r && top<=bottom){
                // top row
                for(int i=left;i<=r;i++){
                    l.add(matrix[top][i]);
                }
                top++;
                // last coulmn
                for(int i = top ; i<= bottom ; i++){
                       l.add(matrix[i][r]);
                }
              
                r--;
                //last row
                if(top <= bottom){
                    for(int i=r; i>=left ; i--){
                        l.add(matrix[bottom][i]);
                     }
                }
                bottom --;
            
                // first column 
                if(left <= r){
                        for(int i=bottom ; i>= top ; i--){
                            l.add(matrix[i][left]);
                         }
                }
                left++;
            
        }
        return l;
    }
}