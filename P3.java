
//time- o (m*n)
//space- o(1)
//passed in leetcode- yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
 
        if(matrix == null || matrix.length == 0) return result;//edge case
 
        int m = matrix.length;
        int n = matrix[0].length;
 
        int x=0; 
        int y=0;
 
        while(m>0 && n>0){
 
            //if one row/column left, just print as is, as no circle can be formed
            if(m==1){
                for(int i=0; i<n; i++){
                    result.add(matrix[x][y++]);
                }
                break;
            }else if(n==1){
                for(int i=0; i<m; i++){
                    result.add(matrix[x++][y]);
                }
                break;
            }
 
            //Otherwise process a circle
 
            //from top - move right
            for(int i=0;i<n-1;i++){
                result.add(matrix[x][y++]);
            }
 
            //from right - move down
            for(int i=0;i<m-1;i++){
                result.add(matrix[x++][y]);
            }
 
            //from bottom - move left
            for(int i=0;i<n-1;i++){
                result.add(matrix[x][y--]);
            }
 
            //from left - move up
            for(int i=0;i<m-1;i++){
                result.add(matrix[x--][y]);
            }
 
            x++;
            y++;
            m=m-2;
            n=n-2;
        }
 
        return result;
    }
}