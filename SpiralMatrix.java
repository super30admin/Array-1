// Time Complexity : O(mn)
// Space Complexity : O(mn)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//Here I have used 4 pointer approach. everytime after traversal I am updating L/R/TOP/BOTTOM.


import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int top = 0; int bot = row-1;
        ArrayList<Integer> list = new ArrayList<>(row*col);
        int l = 0; int r = col-1;
        while(l<=r && top<=bot) {

            if(top<=bot) {
                for(int i=l; i<=r; i++){
                    list.add(matrix[top][i]);
                }
                top++;
            }

            if(l<=r){
                for(int i=top; i<=bot; i++){
                    list.add(matrix[i][r]);
                }
                r--;
            }

            if(top<=bot){
                for(int i=r; i>=l; i--){
                    list.add(matrix[bot][i]);
                }
                bot--;
            }

            if(l<=r){
                for(int i=bot; i>=top; i--){
                    list.add(matrix[i][l]);
                }
                l++;
            }
        }
        return list;
    }
}
