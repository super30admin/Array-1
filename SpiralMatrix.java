class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if(matrix == null || matrix.length == 0){
            return list;
        }
        
        int left = 0;
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        
        int size = matrix.length * matrix[0].length;
        
        while(list.size() < size){
            for(int i=left; i<=right && list.size() < size; i++){
                list.add(matrix[top][i]);
            }
            
            top++;
                
            for(int i=top; i<=bottom && list.size() < size; i++){
                list.add(matrix[i][right]);
            }
            
            right--;
            
            for(int i=right; i>=left && list.size() < size; i--){
                list.add(matrix[bottom][i]);
            }
            
            bottom--;
            
            for(int i=bottom; i>=top && list.size() < size; i--){
                list.add(matrix[i][left]);
            }
            
            left++;
        }
        
        return list;
    }
}