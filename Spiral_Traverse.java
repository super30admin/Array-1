//TimeComplexity O(m*n)
//SpaceComplexity O(m*n)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0, left = 0, right = matrix[0].length-1, bottom = matrix.length-1;
        List<Integer> list = new ArrayList<>();
        
        while(top<= bottom && left <= right){
        for(int i = left; i <= right ; i++){
        list.add(matrix[top][i]);
        
        }
            top++;
        
        for(int i = top; i <= bottom; i++){
            list.add(matrix[i][right]);
           
        }
             right--;
        if(top <= bottom){
            for(int i = right; i >= left; i--){
            list.add(matrix[bottom][i]);
           
        }
        }
             bottom--;
        if(left <= right){
            for(int i = bottom; i >= top ; i--){
          
            list.add(matrix[i][left]);
           
        }
        }
             left++;
        }
        
       return list;    
    }
}
