//TC O(m*n)
//SC O(1)
//works in leetcode

//determine Right,Down,Left,Up movement
class MatrixSpiralOrder {

    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> result = new ArrayList<>();

        int rowStart=0;
        int colStart=0;
        int colEnd= n-1;
        int rowEnd= m-1;

        while(result.size()< m*n){

            //Right
            for(int j=colStart;j<= colEnd;j++ ){
                result.add(matrix[rowStart][j]);
            }
            rowStart++;

            //Down
            for(int i=rowStart;i<=rowEnd;i++){
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            //Left
            if(rowStart <= rowEnd){
                for(int j=colEnd; j>=colStart;j--){
                    result.add(matrix[rowEnd][j]);
                }
                rowEnd--;
            }

            //Up
            if(colStart <= colEnd){
                for(int i=rowEnd;i>=rowStart;i--){
                    result.add(matrix[i][colStart]);
                }
                colStart++;
            }


        }
        return result;

    }



    public static void main(String [] args){
        int [][] matrix ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        List<Integer> out = spiralOrder(matrix);
        System.out.println(out);


    }
}