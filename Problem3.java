// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes

// I used four variables to keep the track of direction to move in



class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> arrList=new ArrayList<>();
        int top=0;
        int bottom=matrix.length-1;
        System.out.println("bottom "+bottom);
        int right=matrix[0].length-1;
        int left=0;;
        
        while(top<=bottom && left<=right){
            if(top<=bottom){
                for(int i=left;i<=right;i++){
                arrList.add(matrix[top][i]);
            }
            top++;
            }
            
            if(top<=bottom && left<=right){
                for(int i=top;i<=bottom;i++){
            arrList.add(matrix[i][right]);
            }
            right--;
            }
            
            if(top<=bottom && left<=right){
                for(int i=right;i>=left;i--){
                arrList.add(matrix[bottom][i]);
            }
            bottom--;
            }
            
            if(top<=bottom && left<=right){
                for(int i=bottom;i>=top;i--){
                arrList.add(matrix[i][left]);
                
            }
            left++;
            }
            
            
            
            
            
            
            

        }
        
        
        return arrList;
        
    }
}