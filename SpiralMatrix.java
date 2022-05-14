// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// I'm using direction variable to traverse through matrix in spiral mode
// If it reach boundary then change direction and shrink boundary

import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int right = c-1;
        int left = 0;
        int down = r-1;
        int up = 1;
        char direction = 'r';
        List<Integer> res = new LinkedList<>();
        int index =0;
        int i =0;
        int j =0;
        while(index < r*c){
            res.add(matrix[i][j]);
            index++;
            switch(direction){
                case 'r':if(j == right){
                    direction = 'd';
                    right--;
                    i++;
                }else{
                    j++;
                }
                    break;
                case 'd': if(i == down){
                    direction = 'l';
                    down--;
                    j--;
                }else{
                    i++;
                }
                    break;
                case 'l': if(j == left){
                    direction = 'u';
                    left++;
                    i--;
                }else{
                    j--;
                }
                    break;
                case 'u': if(i == up){
                    direction = 'r';
                    up++;
                    j++;
                }else{
                    i--;
                }
                    break;
            }
        }
        return res;
    }
}
