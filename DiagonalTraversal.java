import java.util.*;

//Time Complexity : O(r*c)
//Space Complexity : O(Min(r,c))
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return new int[0];
        }
        int N = matrix.length;
        int M = matrix[0].length;
        int k=0;
        int finalDiagonal[] = new int[M*N];
        ArrayList<Integer> diagonal = new ArrayList<Integer>();

        int r=0,c=0;

        for(int d=0;d<M+N-1;d++){
            r = d<M?0:d-M+1;
            c = d<M?d:M-1;

            diagonal.clear();

            while(r<N && c>-1){
                diagonal.add(matrix[r][c]);
                r++;
                c--;
            }
            if(d%2==0){
                Collections.reverse(diagonal);
            }
            for(int i=0;i<diagonal.size();i++){
                finalDiagonal[k++] = diagonal.get(i);
            }
        }
        return finalDiagonal;
    }
}
