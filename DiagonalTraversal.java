// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
class DiagonalTraversal {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length ==0) return new int[0];
        int[] result = new int[matrix.length*matrix[0].length];
        int dir = 1, i=0, j=0;

        for(int k=0;k<result.length;k++){
            //System.out.println(i + " "+j);
            result[k] = matrix[i][j];
            if(dir==1){
                if(j==matrix[0].length-1){
                    i++;
                    dir=-1;
                }else if(i==0) {
                    j++;
                    dir=-1;
                }
                else{
                    i--;j++;
                }

            }else{
                if(i==matrix.length-1){
                    j++;
                    dir=1;
                }
                else if(j==0) {
                    i++;
                    dir=1;
                }else{
                    i++;j--;
                }
            }                
        }

        return result;
    }
}