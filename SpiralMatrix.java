class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // maintain pointer for each direction

        ArrayList<Integer> res = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int l = 0 ; int r = n-1; int t = 0; int b = m-1;

        while( l<=r && t<=b ){

            // start filling left to right

            for( int i = l ; i <= r; i++ ){
                res.add(matrix[t][i]);
            }
            // coming to next row from top to bottom hence increase top pointer
            t++;

            if( l<=r && t<=b ){
                for( int i = t ; i <= b; i++ ){
                    res.add(matrix[i][r]);
                }
                r--;
                // now moving from right to left
            }


            if( l<=r && t<=b ){
                for( int i = r ; i >= l ; i-- ){
                    res.add(matrix[b][i]);
                }
                // now new bottom , decrease for inner spiral
                b--;
            }


            if( l<=r && t<=b ){
                for( int i = b ; i >= t ; i-- ){
                    res.add(matrix[i][l]);
                }
                l++;
            }





        }

        return res;
    }
}