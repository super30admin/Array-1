// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class DiagonalTraversal {
    boolean goingUp; //up
    int rows;
    int cols;
    public int[] findDiagonalOrder(int[][] mat) {

        if(mat == null || mat.length <1){
            return null;
        }

        rows = mat.length;
        cols = mat[0].length;
        int[] result = new int[rows*cols];
        int i=0, j =0;
        goingUp = true;

        result[0] = mat[0][0];
        for(int k=1; k<result.length; k++){
            boolean toggle = false;
            if(goingUp){
                boolean topEnd=false, rightEnd=false;
                if ( i - 1 < 0 ) topEnd=true;
                if ( j + 1 >= cols ) rightEnd=true;
                toggle = true;

                if ( ! topEnd && !rightEnd ) {
                    i = i- 1;
                    j = j + 1;
                    toggle=false;
                } else if ( topEnd && rightEnd ) {
                    i = 1;
                    j = cols - 1;
                } else if ( topEnd ) {
                    i = 0;
                    j = j + 1;
                } else {
                    i = i + 1;
                    j = cols - 1;
                }

            }else{
                boolean bottomEnd=false, leftEnd=false;
                if ( i + 1 >= rows ) bottomEnd=true;
                if ( j - 1 < 0  ) leftEnd=true;
                toggle = true;

                if ( !bottomEnd && !leftEnd ) {
                    i = i+1;
                    j = j-1;
                    toggle=false;
                } else if ( bottomEnd && leftEnd ) {
                    i = rows - 1;
                    j = 1;
                } else if ( bottomEnd ) {
                    i = rows - 1;
                    j = j + 1;
                } else {
                    i = i + 1;
                    j = 0;
                }

            }
            if(toggle){
                goingUp =!goingUp;
            }

            result[k] = mat[i][j];
        }
        return result;
    }
}