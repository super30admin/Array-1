// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Keep 4 pointers left,right,top,bottom. 
// Traverse from Left to right direction. Add elements to result list.Then increase the top variable to lower it in matrix.
// Traverse from Up to Down direction. Add elements to result list.Then decrease the right variable to move left it in matrix.
// Traverse from Right to left direction. Add elements to result list.Then decrease the bottom variable to go up  in matrix.
// Finally do it for left variable. Keep adding elements until list size is equal to matrix elements count.

// Your code here along with comments explaining your approach

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        if(matrix==null || matrix.length==0) return new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;
        List<Integer>result=new ArrayList<>();
        
        int left=0,right=col-1,top=0,bottom=row-1;
        
        while(left<=right && top<=bottom){
            
            for(int i=left;i<=right && result.size()<row*col;i++){
                result.add(matrix[top][i]);
            }
            top++;
            
            for(int i=top;i<=bottom && result.size()<row*col;i++){
                result.add(matrix[i][right]);
            }
            right--;
            
            for(int i=right;i>=left && result.size()<row*col;i--){
                //System.out.println(matrix[bottom][i]);
                result.add(matrix[bottom][i]);
            }
            bottom--;
            
            for(int i=bottom;i>=top && result.size()<row*col;i--){
                //System.out.println(matrix[i][left]);
                result.add(matrix[i][left]);
            }
            left++;
            
                
            
        }
    
        
        return result;
        
    }
}