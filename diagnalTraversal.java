// Time Complexity : O(n * m)
// Space Complexity :O(1) 
public class diagnalTraversal {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null || mat.length==0) return new int[] {};
        int m=mat.length;
        int n=mat[0].length;
        int[] ans=new int[m*n];
        int dir=1;
        int index=0, i=0, j=0;
        //dir=1 for up, dir=-1 for down
        while(index<m*n){
            ans[index++] = mat[i][j];
            if(dir==1){
                if(j==n-1){
                    dir=-1;
                    i++;
                }else if(i==0){
                    dir=-1;
                    j++;
                }else{
                    i--;
                    j++;
                }
            }else{
                if(i==m-1){
                    dir=1;
                    j++;
                }else if(j==0){
                    dir=1;
                    i++;
                }else{
                    i++;
                    j--;
                }
            }
        }
        return ans;
    }
}
