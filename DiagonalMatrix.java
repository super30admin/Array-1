// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Traversing the matrix diagonlally with updward direction as 1 and downward direction as -1
// Checking boundary conditions for row and column as well and incrementing and decrementing counters
// accordingly 

// Your code here along with comments explaining your approach

class DiagonalMatrix{
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[0];
        }
        int r=mat.length;
        int c=mat[0].length;
        int [] res=new int[r*c];
        int dir=1;
        int i=0;
        int j=0;
        int k=0;
        while(i<r && j<c){
            res[k]=mat[i][j];
            if(dir==1){
                if(j==c-1){
                    i++;
                    dir=-1;
                }else if(i==0){
                    dir=-1;
                    j++;
                }else{
                    i--;
                    j++;
                }
            }else if(dir==-1){
                if(i==r-1){
                    dir=1;
                    j++;
                }else if(j==0){
                    i++;
                    dir=1;
                }else{
                    i++;
                    j--;
                }
            }
            k++;
        }
        return res;
    }
}