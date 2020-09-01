import java.util.*;

//Time Complexity : O(n) 
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList();
        if(matrix.length==0 || matrix[0].length==0) return list;
        int row=0, col=0, rlen=matrix.length-1, clen=matrix[0].length-1;
        int matlen = matrix.length*matrix[0].length;

        while(list.size()<matlen){
            if(list.size()<matlen){
                for(int i=col;i<=clen;i++){
                    list.add(matrix[row][i]);
                }
            }
            row++;

            if(list.size()<matlen){
                for(int i=row;i<=rlen;i++){
                    list.add(matrix[i][clen]);
                }
            }
            clen--;

            if(row<=rlen){
                for(int i=clen;i>=col;i--){
                    list.add(matrix[rlen][i]);
                }
            }
            rlen--;

            if(col<=clen){
                for(int i=rlen;i>=row;i--){
                    list.add(matrix[i][col]);
                }
            }
            col++;
        }
        return list;
    }
}
