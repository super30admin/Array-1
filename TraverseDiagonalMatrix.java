/**
 * #Idea: 
 * 1. (i+j) is even - upward traversal. (i+j) is odd downward traversal.
 * 2. Upward -> row-1 and col+1; Downward -> row+1 and col-1
 * 3. When hitting edge cases attend to special cases and move accordingly.
 * # Time Complexity : O(n) - number of elements. (X*Y -> X rows, Y cols)
 * # Space Complexity : O(n) - result array
 */
class TraverseDiagonalMatrix {
    
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0) return new int[0];

        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0;
        int c = 0;
        int[] diagonalArray = new int[m * n];

        for(int i=0;i<m*n;i++){
            diagonalArray[i] = matrix[r][c];
            if((r+c) % 2 == 0){
                if(c == n - 1)
                    r++;                
                else if(r == 0) 
                    c++;
                else {
                    r--;
                    c++;
                }                
            }
            else {
                if(r == m - 1) 
                    c++;                
                else if(c == 0) 
                    r++;
                else {
                    r++;
                    c--;
                }
                
            }
        }

        return diagonalArray;
    }
    
    public static void main(String[] args){
        System.out.println("TraverseDiagonalMatrix");
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        TraverseDiagonalMatrix obj = new TraverseDiagonalMatrix();
        obj.traverseMatrix(mat, mat.length);
        int[] result = obj.findDiagonalOrder(mat);

        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}