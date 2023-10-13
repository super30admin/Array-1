// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
class DiagnalArray {
    public int[] getDiagnalArray(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m*n];
        int index = 0;
        int i = 0;
        int j = 0;
        boolean dir = true;
        while(index < m*n){
            //up
            result[index] = matrix[i][j];
            index++;
            if(dir){
                if(i == 0 && j!=n-1){
                    j++;
                    dir = false;
                }else if(j== n-1){
                    i++;
                    dir = false;
                }else{
                    i--;
                    j++;
                }
                //down
            }else{
                if(j == 0 && i!=m-1){
                    i++;
                    dir = true;
                }else if(i== m-1){
                    j++;
                    dir = true;
                }else{
                    j--;
                    i++;
                }
            }
        }
        return result;

    }
}