Time Complexity : O(N*M)
Space Complexity : O(N)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length<1) return new ArrayList<>();
        
        int top = 0;
        int bottom = matrix.length-1;
        
        int left = 0;
        int right = matrix[0].length-1;
        
        int n =0;
        
        int M = matrix.length;
        int N = matrix[0].length;
        
        List<Integer> list = new ArrayList<>();
        
        while(n<M*N && bottom>=top && left<=right){
            
            for(int i = left; i<=right; i++){
                list.add(matrix[top][i]);
                n++;
            }
            top++;
            
            if(top<=bottom){
                for(int i = top; i<=bottom; i++){
                    list.add(matrix[i][right]);
                    n++;
                }
                right--;
            }
            else{
                break;
            }
            
            
            if(right>=left){
                for(int i = right; i>=left; i--){
                    list.add(matrix[bottom][i]);
                    n++;
                }
                bottom--;
            }else{
                break;
            }
            
            if(bottom>=top){
                for(int i = bottom; i>=top; i--){
                    list.add(matrix[i][left]);
                    n++;
                }
                left++;
            }else{
                break;
            }            
            
        }
        return list;
    }
}