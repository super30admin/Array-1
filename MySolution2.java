class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int dir = 1;
        int i = 0;
        int j = 0;
        int x = 0;
        while (x < result.length){
            result[x] = mat[i][j];
            if(dir == 1){
                if (j == n-1){

                    i++;
                    dir = -1;
                }
                else if (i == 0){

                    j++;
                    dir = -1;
                }

                else{

                    i--;
                    j++;;
                }
            }

            else{
                if (i == m-1){

                    j++;
                    dir = 1;
                }
                else if (j == 0){

                    i++;
                    dir = 1;
                }
                else{

                    i++;
                    j--;
                }
            }
            x++;
        }
        return result;
    }
}