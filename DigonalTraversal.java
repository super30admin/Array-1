// Time Complexity : O(m * n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
import java.util.Arrays;
public class DigonalTraversal {
    static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m*n];

        int i = 0;
        int j = 0;

        boolean flag = true;
        for(int k = 0; k < m*n; k++) {
            res[k] = mat[i][j];
            if(flag) {
                if(j == n-1) {
                    i++;
                    flag = false;
                } else if(i == 0){
                    j++;
                    flag = false;
                } else {
                    i--;
                    j++;
                }
            } else {
                if(i == m-1) {
                    j++;
                    flag = true;
                } else if(j == 0){
                    i++;
                    flag = true;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
        // 1    2   3
        // 4    5   6
        // 7    8   9
        System.out.println("Digonal traversal " + Arrays.toString(findDiagonalOrder(mat)));
    }
}
