public class DiagonalMatrix {
    public int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int dir= 1;
        int r=0;
        int c=0;
        int[] res = new int[m*n];
        int i =0;
        if(matrix == null || matrix.length==0)
        {
            return res;
        }
        while(i< m * n)
        {
            res[i] = matrix[r][c];
            if(dir == 1){
                if(c == n-1)
                {
                    dir=-1;
                    r++;

                }
                else if(r == 0)
                {
                    dir = -1;
                    c++;
                }
                else
                {
                    r--;
                    c++;
                }
            }

            else
            {
                if(r==m-1)
                {
                    c++;
                    dir=1;
                }
                else if(c==0)
                {

                    r++;
                    dir=1;
                }
                else
                {
                    r++;
                    c--;
                }
            }

            i++;
        }
        return res;
    }

}

//time complexity is O(m*n)
//space complexity is O(1).
