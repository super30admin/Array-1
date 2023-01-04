// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//Approach : In this approach we keep a flag for going up and down. For up the flag is true and for going down the flag is false.
// we check the edge conditions in the matrix and increment or decrement the row and column accordingly. We add the elements in a result array.

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0)return new int[]{};

        int m = mat.length;    
        int n = mat[0].length;

        int []result = new int[m*n];
        int r =0; 
        int c=0;
        boolean flag = true;

        for(int i=0;i<result.length;i++){
            result[i] = mat[r][c];
            if(flag){
                if(r == 0 && c!=n-1){
                    flag = false;
                    c++;
                }else if(c == n-1){
                    flag = false;
                    r++;
                }else{
                    r--;
                    c++;
                } 
            }else{
                if(c == 0 && r!=m-1){
                    flag = true;
                    r++;
                }else if(r == m-1){
                    flag = true;
                    c++;
                }else{
                    c--;
                    r++;
                }
            }
            
        }

        return result;
    }
}
