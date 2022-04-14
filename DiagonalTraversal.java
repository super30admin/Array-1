import java.util.Arrays;

/**
 * Time complexity is O(m*n)
 * Space complexity is O(1)
 * Did this code successfully run on Leet code : Yes
 * Any problem you faced while coding this : No
 */
public class DiagonalTraversal {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int[] result = findDiagonalOrder(mat);
        System.out.println("result : " + Arrays.toString(result));

        int[][] mat1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[] result1 = findDiagonalOrder(mat1);
        System.out.println("result : " + Arrays.toString(result1));
    }
    public static int[] findDiagonalOrder(int[][] mat) {
        //base case
        if(mat == null || mat.length == 0){
            return new int[] {};
        }

        //initialization
        int m = mat.length; //m rows
        int n = mat[0].length; //n columns
        int[] result = new int[m*n]; // result array of size m*n

        int r=0, c=0, index=0; // initializing row 0, column 0 and index in result array to 0
        int dir = 1;

        while(index < m*n){
            result[index] = mat[r][c];
            index++;

            if(dir == 1){
                if(c == n-1){
                    dir = -1;
                    r++;
                }
                else if(r == 0){
                    dir = -1;
                    c++;
                }
                else{
                    r--;
                    c++;
                }
            }
            else{
                if(r == m-1){
                    dir = 1;
                    c++;
                }
                else if(c == 0){
                    dir = 1;
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
