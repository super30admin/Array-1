package s30.arrays.array1;


// Time Complexity: O(m*n) // As we are traversing through every element of the matrix.
// Space COmplexity: O(1) // We are not using any auxilory space.

public class DiagonalTraverse {


    public static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        boolean up = true;

        int[] res = new int[m * n];
        int index=0;
        int rowIndex =0;
        int colIndex = 0;


        while(index != m*n){

            res[index++] = mat[rowIndex][colIndex];

            if(up){

                if(colIndex == n-1){
                    rowIndex++;
                    up = false;
                }
                else if(rowIndex ==0){
                    colIndex++;
                    up = false;
                }
                else{
                    rowIndex--;
                    colIndex++;
                }
            }
            else {
                if(rowIndex == m-1){
                    colIndex++;
                    up = true;
                }
                else if (colIndex ==0){
                    rowIndex++;
                    up = true;
                }
                else {
                    rowIndex++;
                    colIndex--;
                }

            }


        }


        return res;
        }
    public static void main(String[] args) {
        System.out.println(findDiagonalOrder(new int[][]{   {1,2,3},
                                                            {4,5,6},
                                                            {7,8,9}}));
    }
}
