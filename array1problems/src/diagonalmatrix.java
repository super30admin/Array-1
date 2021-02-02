class diagonalmatrix {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null || matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }
        //initializing n,m,array matrix, dir
        int n = matrix.length;
        int m= matrix[0].length;

        int[] output = new int[n * m];
        int index=0;

        int i=0; int j=0; int dir=1;
        // loop starts from here
        while(index < n*m){
            output[index]= matrix[i][j];
            index+=1;
            //dir =1(upwards)    dir=-1(downwards)
            if(dir==1){
                if(j==m-1){
                    dir=-1;
                    i+=1;
                }
                else if(i==0){
                    dir=-1;
                    j+=1;
                }
                else{
                    i-=1;
                    j+=1;
                }
            }

            else{
                if(i==n-1){
                    dir=1;
                    j+=1;
                }
                else if(j==0){
                    dir=1;
                    i+=1;
                }
                else{
                    i+=1;
                    j-=1;
                }

            }
        }
        return output;
    }
}

//Time complexity = o(n*m)
//space complexity =o(n*m)
