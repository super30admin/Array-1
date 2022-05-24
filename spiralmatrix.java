//time complexity:O(mn)
//space complexity:O(1)
class Solution {
    List<Integer> list;
    public List<Integer> spiralOrder(int[][] matrix) {
        list=new ArrayList();
        if(matrix==null || matrix.length==0){
            return list;
        }
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        int dir=0;
        while(top<=bottom && left<=right){
            if(dir==0){
                for(int i=left;i<=right;i++){
                    list.add(matrix[top][i]);
                    
                }
                top++;
                dir=1;
            }
            else if(dir==1){
                for(int i=top;i<=bottom;i++){
                    list.add(matrix[i][right]);
                }
                    right--;
                    dir=2;
            }
            else if(dir==2){
                for(int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                    
                }
                bottom--;
                dir=3;
            }
            else if(dir==3){
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
                dir=0;
            }
        }
        return list;
    }
}