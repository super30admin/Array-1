// linear time o(m*n) and linear space
class Solution{
    public int[] diag(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        boolean dir = true;
        int []result = new int[m*n];
        int idx = 0;
        int i = 0; int j = 0;
        while(idx < m*n){
            result[idx] = matrix[m][n];
            idx++;
            if(dir){
                if(i==0 && j != n-1){
                    j++;
                    dir = false;

                else if(j == n){
                    i++;
                    dir = false;

                else{
                    i--;j++;
                }

                
                }
            else{
                if(j==0 && i != n-1){
                    i++;
                    dir = true;

                else if(i == m-1){
                    j++;
                    dir = true;

                else{
                    j--;i++;
                }

            }
            }

        }
        return result;

    }
}
