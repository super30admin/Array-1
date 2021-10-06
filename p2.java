class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0 || mat[0].length == 0){
            return new int[0];
        }
        int n = mat.length;
        int m = mat[0].length;

        int[] newarray = new int[n*m];

        int i = 0;
        int j = 0;

        int index = 0;
        int dir = 1;



        while(index < n*m){
            newarray[index] = mat[i][j];
            index++;

            if(dir == 1){
                if(j == m - 1){
                    dir = -1;
                    i++;

                }
                else if(i == 0){
                    dir = -1;
                    j++;
                }

                else{
                    i--;
                    j++;
                }
            }

            else{
                if(i == n - 1){
                    dir = 1;
                    j++;

                }
                else if(j == 0){
                    dir = 1;
                    i++;

                }
                else{
                    i++;
                    j--;
                }
            }
        }return newarray;
    }
}