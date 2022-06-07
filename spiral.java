class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      //tc:O(mn) sc:O(1) 
        List<Integer> result =new ArrayList<>();
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            if(left<=right && top<=bottom)
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            
            if(left<=right && top<=bottom)
            for(int i=right;i>=left;i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
            if(left<=right && top<=bottom)
            for(int i=bottom;i>=top;i--){
                result.add(matrix[i][left]);
            }
            left++;
        
            }           return result;
    }
    }
