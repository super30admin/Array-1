//Time complexity:O(mn)
//Space Complexity:O(1)

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null || matrix.length == 0) return new int[0];
        int m=matrix.length;
        int n=matrix[0].length;
        int dir=0;
        int i=0;
        int j=0;
        int[] result=new int[matrix.length*matrix[0].length];
        int c=0;
        while(c<result.length){
            result[c]=matrix[i][j];
            //up
            if(dir==0){
                if(j==n-1){
                    i++;
                    dir=1;
                }
                else if(i==0){
                    j++;
                    dir=1;
                }
                else{
                    i--;
                    j++;
                }
            }
            else{
                if(i==m-1){
                    j++;
                    dir=0;
                }
                else if(j==0){
                    i++;
                    dir=0;
                }
                else{
                    i++;
                    j--;
                }
            }
            c++;
        }
        return result;
    }
}