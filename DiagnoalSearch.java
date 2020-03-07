//time o(m*n) space o(1)
//passed all leetcode cases
//used approach discussed in class
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int[] result = new int[matrix.length*matrix[0].length];
        int m = matrix.length; int n = matrix[0].length;
        //edge
        if(matrix==null||matrix.length==0) return new int[0];
        int r=0;int c=0;
        int i=0;
        int dir = 1;
        while(i<m*n){
            result[i]=matrix[r][c];
            if(dir==1){
                if(c==n-1){
                    dir=-1;r++;
                } else if(r==0){
                    dir = -1;c++;
                }else {
                    r--;c++;
                }
            }else{
                if(r==m-1){
                    dir=1;c++;
                }else if(c==0){
                    dir =1;r++;
                }else{
                    c--;r++;
                }

            }
            i++;

        }
        return result;
    }
}