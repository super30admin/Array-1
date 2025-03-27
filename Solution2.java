class Solution2 {
    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int r = 0;
        int c = 0;
        boolean direction = true;
        int[] result = new int[m*n];


        for(int i = 0; i < result.length; i++)
        {
            if(direction)
            {
                if(r == 0 && c != n-1){
                    result[i] = mat[r][c];
                    c++;
                    direction = false;
                }
                else if(c == n-1){
                    result[i] = mat[r][c];
                    r++;
                    direction = false;
                }
                else{
                    result[i] = mat[r][c];
                    r--;
                    c++;
                }

            }
            else
            {
                if(c==0 && r != m-1){
                    result[i] = mat[r][c];
                    r++;
                    direction = true;
                }
                else if( r == m-1){
                    result[i] = mat[r][c];
                    c++;
                    direction = true;
                }
                else{
                    result[i] = mat[r][c];
                    r++;
                    c--;
                }

            }

        }
        return result;

    }
}
