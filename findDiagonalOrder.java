// Time Complexity :O(m+n) touching each element exactly once.
// Space Complexity :O(1); returning the array of m*n
// Did this code successfully run on Leetcode : yes
/*Approach: Here we have considered two directions dir==1 for the forward direction and dir==-1 for the
downward direction(reverse dir) */
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
       int m=mat.length;
       int n=mat[0].length;
        int[] out=new int[m*n];
        int dir=1;
        int index=0,i=0,j=0;
        while(index<m*n){
            out[index++]=mat[i][j];
            if(dir==1){
                if(j==n-1){dir=-1;i++;}
                else if(i==0){dir=-1;j++;}
                else{i--;j++;}

            }
            else
            {
                if(i==m-1){dir=1;j++;}
                else if(j==0){dir=1;i++;}
                else{i++;j--;}
            }
        }
        return out;

    }
}