// Time Complexity : O(n * m)
// Space Complexity :O(1) 
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        if(matrix==null || matrix.length==0) return ans;        
        int t=0, l=0, r= matrix[0].length-1, b= matrix.length-1;
        while(t<=b && l<=r){
            //left to right
            for(int i=l;i<=r;i++){
                ans.add(matrix[t][i]);
            }
            t++;
            if(l<=r){
                //top to bottom
                for(int i=t;i<=b;i++){
                    ans.add(matrix[i][r]);
                }
                r--;         
            }
            
            if(l<=r && t<=b){ 
                //right to left
                for(int i=r;i>=l;i--){
                    ans.add(matrix[b][i]);
                }
                b--;
            }
            
            if(l<=r){
                //bottom to top
                for(int i=b;i>=t;i--){
                    ans.add(matrix[i][l]);
                }
                l++;    
            }
            
        }
        
        return ans;
    }
}