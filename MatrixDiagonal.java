//time comlpexity:  o(m*n)
//space complexity: o(1)
// In this program, we are traversing 2D array into a single array, considering upward and downward directions.


class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new int[]{};
        // m stands for row number, n standas for column number
        int m = matrix.length;
        int n = matrix[0].length;
        // initialized new result array with m rows and n columns
        int[] result= new int[m*n];
        // rows and columns initialized to 0, it will always start with [0,0] position.
        int r =0, c=0;
        // index is initialized to 0
        int index = 0;
        // upward direction = 0, downward direction = 1
        int dir = 1;
        // loop traverse till product of rows into columns

        while(index<m*n){

            result[index]  = matrix[r][c];
            // next element
            index++;

            if(dir==1){
                // to avoid column out of bound exception
                if(c==n-1){
                    dir = -1;
                    r++;
                }
                else if(r==0){
                    dir = -1;
                    c++;
                }

                else{
                    r--;
                    c++;
                }
            }
            else{
                // to avoid row out of bound condition
                if(r==m-1){
                    dir = 1;
                    c++;
                }
                else if(c==0){
                    dir =1;
                    r++;

                }

                else{
                    r++;
                    c--;
                }
            }
        }
        return result;
    }

}

public class MatrixDiagonal{
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 34, 12, 5, 6};
        Solution solu = new Solution();
        int[] res = solu.productExceptSelf(new int[]{1, 2, 3, 4});

        for(int value : res){
            System.out.print(value +",");
        }
    }
}