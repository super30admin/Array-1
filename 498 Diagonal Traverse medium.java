class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int count = 0;
        if(matrix.length == 0)
            return new int[0];
        int[] ans = new int[matrix[0].length * matrix.length];
        int i = 0;
        int j = 0;
        while(count < matrix[0].length * matrix.length){
        //upperslop
        while (i >= 0 && j < matrix[0].length){
            ans[count++] = matrix[i][j];
            i = i - 1;
            j = j + 1;
        }
        i++;
        j--;
        //check right index
        if(j+1 < matrix[0].length){
            j = j + 1;
        }
        else{
            i = i + 1;
        }
        //getting to last index
        //lower slop
        while (j >= 0 && i < matrix.length){
            ans[count++] = matrix[i][j];
            i = i + 1;
            j = j - 1;
        }
        i--;
        j++;
        //getting last index
        if(i+1 < matrix.length){
            i++;
        }
        else{
            j++;
        }
        
        }
        return ans;
    }
}