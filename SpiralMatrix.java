// Time Complexity :O(mn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Three line explanation of solution in plain english
// in this solution we maintain boundary variables and proceed further to get the elements in spiral order.

import java.util.*;

public class SpiralMatrix {
        public List<Integer> spiralOrder(int[][] matrix) {
            if(matrix.length==0 || matrix==null){
                return new ArrayList<Integer>();
            }
            List<Integer> res=new ArrayList<>();
            int m=matrix[0].length;
            int n=matrix.length;
            int top=0;
            int left=0;
            int right=m-1;
            int bottom=n-1;
            while(top<=bottom && left<=right){
                for(int j=left;j<=right;j++){
                    res.add(matrix[top][j]);
                }
                top++;
                for(int i=top;i<=bottom;i++){
                    res.add(matrix[i][right]);
                }
                right--;
                if(top<=bottom){
                        for(int i=right;i>=left;i--){
                        res.add(matrix[bottom][i]);
                    }
                    bottom--;
                }
                if(left<=right){
                         for(int j=bottom;j>=top;j--){
                            res.add(matrix[j][left]);
                         }
                    left++;
                }
               
            }
            return res;
        }
    
    public static void main(String args[]){
        SpiralMatrix obj=new SpiralMatrix();
        int [][]mat={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> res=obj.spiralOrder(mat);
        for(int x: res){
            System.out.print(x+" ");
        }
    }
}
