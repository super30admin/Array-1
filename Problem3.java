// Spiral Matrix

// Time Complexity : O(n) n = total number of elements in input matrix
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
// Any problems faced while solving this problem? No

import java.util.ArrayList;
import java.util.List;
public class Problem3 {
    public List<Integer> Problem3(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(matrix.length==0) return ans;
        int r1=0,r2=matrix.length-1,c1=0,c2=matrix.length-1;
        while(r1<=r2 && c1<=c2) {
            for(int c=c1;c<=c2;c++) ans.add(matrix[r1][c]); // top layer
            for(int r=r1+1;r<=r2;r++) ans.add(matrix[r][c2]); // right side layer
            if(r1<r2 && c1<c2) {
                for(int c=c2-1;c>c1;c--) ans.add(matrix[r2][c]); //bottom layer
                for(int r=r2;r>r1;r--) ans.add(matrix[r][c1]); // left side layer
            }
            //move to next inner layer
            r1++; 
            r2--;
            c1++; 
            c2--;
        }
        return ans;
    }
}