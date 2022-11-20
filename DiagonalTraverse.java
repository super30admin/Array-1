import java.util.Arrays;

public class DiagonalTraverse {
    //https://leetcode.com/problems/diagonal-traverse/description/

    //TimeComplexity = O(m*n)
    //Space COmplexity =O(1)
    /*To traverse diagonally the fundamental thing is to find out the directions in which the matrix is getting traversed.
    * While travelling upward row value decrements and column increments. While travelling downward row value increments and
    * column value increments.
    * */
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(findDiagonalOrder(matrix)));
    }
    public static int[] findDiagonalOrder(int[][] mat) {
        int n =mat[0].length;
        int m = mat.length;
        int[] result = new int[m*n];
        int index =0;
        int dir=1;
        int top =0,bottom=0;
        while (index<m*n){
            result[index]=mat[top][bottom];
            index++;
            if(dir==1){
                if(bottom==n-1){
                    dir=-1;top++;
                } else if (top==0) {
                    dir=-1;bottom++;
                }
                else {
                    top--;bottom++;
                }
            }
            else{
                if (top==m-1){
                    dir=1;bottom++;
                } else if (bottom==0) {
                    dir=1;top++;
                }
                else {
                    top++;bottom--;
                }

            }


        }

        return result;
    }
}
