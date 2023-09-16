//TC O(m*n)
//SC O(m*n)


public class DiagonalTraversal {
    public int[] findDiagonalOrder(int[][] mat) {
       
        if(mat == null || mat.length == 0){
            return new int[]{};
        }

        int rows = mat.length;
        int cols = mat[0].length;
        int[] result = new int[rows*cols];
        //moving from bottom to top if -1 moving from top to bottom
        int direction = 1;

        int index = 0;
        int row = 0, col =0;

        //loop

        while(index <= rows*cols -1 ){
            if(direction == 1){
                result[index] = mat[row][col];
                // System.out.println("Up" +result[index]);
                if(col == cols-1){
                    direction = -1;
                    row++;
                }
                else if(row == 0){
                    direction = -1;
                    col++;
                }else{
                    row--;
                    col++;
                }

            }else if(direction == -1){
                result[index] = mat[row][col];
                 //System.out.println("down"+result[index]);
                if(row == rows-1){
                    direction = 1;
                    col++;
                }
                else if(col == 0){
                    direction = 1;
                    row++;
                }else{
                    row++;
                    col--;
                }

            }
            index++;
        }

        return result;
    }
    public static void main(String[] args) {
        DiagonalTraversal diagonalTraversal = new DiagonalTraversal();
        
        int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] result1 = diagonalTraversal.findDiagonalOrder(mat1);
        System.out.println("Diagonal Traversal 1:");
        printArray(result1);

        int[][] mat2 = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        int[] result2 = diagonalTraversal.findDiagonalOrder(mat2);
        System.out.println("Diagonal Traversal 2:");
        printArray(result2);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
