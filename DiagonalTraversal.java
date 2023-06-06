// Time Complexity : O(m*n)
// Space Complexity :O(1) as the output array will not be taken into consideration here
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class DiagonalTraversal {
    public int[] findDiagonalOrder(int[][] mat) {

        if(mat == null || mat.length <1){
            return null;
        }
        int rows = mat.length;;
        int cols  = mat[0].length;
        boolean goingUp = true; //up

        int[] result = new int[rows*cols];
        int i=0, j =0;


        for(int k=0; k<result.length;){
            if(goingUp){
                do {
                    result[k++] = mat[i--][j++];
                } while ( ( i >= 0  &&  j < cols) ) ;


                if ( i < 0 ) {
                    if ( j >= cols ) {
                        i = 1;
                        j = cols - 1;
                    } else {
                        i = 0;
                    }
                } else {
                    i = i + 2;
                    j = cols - 1;
                }
            }else{
                do {
                    result[k++] = mat[i++][j--];
                } while ( ( i < rows  &&  j >= 0 ) );

                if ( ( i >= rows )  ) {
                    if (j < 0 ){
                        i = rows - 1;
                        j = 1;
                    } else {
                        i = rows - 1;
                        j = j + 2;
                    }
                } else {
                    j = 0;
                }
            }
            goingUp =!goingUp;
        }
        return result;
    }
}