// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
import java.util.*;
public class SpiralMatrix {
    static  List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, bottom = m-1, left = 0, right = n-1;
        ArrayList<Integer> list = new ArrayList<>();

        while(top < bottom+1 && left < right+1) {

            for(int i = left; i < right+1; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i < bottom+1; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            if(top < bottom+1) {
                for(int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left < right+1) {
                for(int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
        ArrayList<Integer> sol = (ArrayList<Integer>) spiralOrder(mat);
        System.out.println(sol);
    }
}
