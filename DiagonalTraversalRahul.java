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

        for(int k=0; k<result.length;){
            System.out.println(k);
            result[k++] = mat[i][j];

            boolean toggle = false;
            if(goingUp){
                do {
                    System.out.println("Going up " + k + " : " + mat[i][j]);
                    result[k++] = mat[i][j];

                } while ( ( --i >= 0  &&  ++j < cols) ) ;
                boolean topEnd=false, rightEnd=false;
                if ( i < 0 ) topEnd=true;
                if ( j >= cols ) rightEnd=true;

                if ( topEnd && rightEnd ) {
                    i = 1;
                    j = cols - 1;
                } else if ( topEnd ) {
                    i = 0;
                } else {
                    i = i + 2;
                    j = cols - 1;
                }
                toggle = true;

            }else{
                do {
                    System.out.println("Going down "  + k + " : " + mat[i][j]);
                    result[k++] = mat[i][j];
                } while ( ( ++i < rows  &&  --j >= 0 ) );
                boolean bottomEnd=false, leftEnd=false;
                if ( i >= rows ) bottomEnd=true;
                if ( j < 0  ) leftEnd=true;
                toggle = true;
                if ( bottomEnd && leftEnd ) {
                    i = rows - 1;
                    j = 1;
                } else if ( bottomEnd ) {
                    i = rows - 1;
                    j = j + 1;
                } else {
                    j = 0;
                }

            }
            if(toggle){
                goingUp =!goingUp;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        DiagonalTraversal obj = new DiagonalTraversal();
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat2 = {{1,2},{3,4}};
        int[][] mat3 = {{2, 5, 8},{4,0,-1}};
        int[][] mat4 = {{1,2,3,4,5,6}};
        int[] result = obj.findDiagonalOrder(mat);
        for(int i =0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}