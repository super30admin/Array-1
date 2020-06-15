//Time compleity for the below solution is O(m * n) and the space complexity is O(1)
class Solution {
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> al = new ArrayList<>();
    if(matrix.length == 0)
      return al;
    int m = matrix.length, n = matrix[0].length;
    int left =0, right = n-1, top=0,bottom=m-1;

    while(top <= bottom && left<=right){
      if(top <= bottom && left<=right){
        for(int i=left;i<=right;i++){
          al.add(matrix[top][i]);
        }
        top++;
      }
      if(top <= bottom && left<=right){
        for(int i=top;i<=bottom;i++){
          al.add(matrix[i][right]);
        }
        right--;
      }
      if(top <= bottom && left<=right){
        for(int i=right;i>=left;i--){
          al.add(matrix[bottom][i]);
        }
        bottom--;
      }
      if(top <= bottom && left<=right){
        for(int i=bottom;i>=top;i--){
          al.add(matrix[i][left]);
        }
        left++;
      }

    }
    return al;
  }
}