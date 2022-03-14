class Solution {
  #time complexity = O(m*n)
  #space complexity = O(1)
  
  public List<Integer> spiralOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        List<Integer> res = new ArrayList<>();
        int left =0; int right = m-1;
        int top =0; int bot = n-1;
        while(left<=right && top<=bot){
            
            for(int i = left; i<=right; i++){
                res.add(mat[top][i]);
            }
            top++;
            if(left<=right){
                for(int i = top; i<=bot; i++){
                    res.add(mat[i][right]);
                }
                right--;
            }
            if(top<=bot){
                for(int i = right; i>=left; i--){
                    res.add(mat[bot][i]);
                }
                bot--;
            }
            if(left<=right){
                for(int i = bot; i>=top; i--){
                res.add(mat[i][left]);
                }
                left++;
            }
            
        }
        return res;
    }
}
