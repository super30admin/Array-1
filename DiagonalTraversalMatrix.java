public class DiagonalTraversalMatrix {
    public int[] findDiagonalOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] result = new int[rows*cols];

        int rowIndex =0, colIndex =0;
        boolean upwardDirection = true;

        for(int index =0; index < result.length; index++){
            result[index] = matrix[rowIndex][colIndex];
            if(upwardDirection){
                if(colIndex == cols -1){
                 upwardDirection = false;
                 rowIndex++;
                }else if(rowIndex == 0){
                    upwardDirection = false;
                    colIndex++;
                }else{
                    rowIndex--;
                    colIndex++;
                }
            }else{
               if(rowIndex == rows -1){
                 upwardDirection = true;
                 colIndex++;
                }else if(colIndex == 0){
                    upwardDirection = true;
                    rowIndex++;
                }else{
                    rowIndex++;
                    colIndex--;
                } 
            }
        }

        return result;
        
    }
}
