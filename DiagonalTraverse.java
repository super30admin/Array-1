// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
//Maintain Direction variable that helps to check conditions
//For each direction, Checking edge conditions and changing row and column values accordingly


public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int[] res = new int[mat.length * mat[0].length];
        int m = mat.length;
        int n = mat[0].length;
        int r =0;
        int c =0;
        int direction = 1;
        int i =0; // index of res
        while(i < m*n){
            res[i] = mat[r][c];
            i++;
            //Move to the Next Element
            if(direction ==1){
                if(c == n-1){
                    direction = -1;
                    r++;
                }else if(r == 0){
                    direction = -1;
                    c++;
                }
                else{
                    r--;
                    c++;
                }
                
            }
            else{
                if( r== m-1){
                    direction = 1;
                    c++;
                }else if(c == 0){
                    direction = 1;
                    r++;
                }
                else{
                    c--;
                    r++;
                }
            }
        }
        return res;
    }
}
