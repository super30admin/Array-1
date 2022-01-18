//To travel diagonally, the border limitations are taken into account;
//TC: O(m*n);
//SC: O(1)
//Since not using any intermediary array to store the result as such;

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
//         int 
        
//         if(mat==null || mat.length==0){
//             return new int[0,0,0];
//         }
        
        int m=mat.length;
        int n=mat[0].length;
        
        int res[]=new int[m*n];
        
        //System.out.println(diagonalele.length);
        int dir=1;
        int index=0;
        int i=0,j=0;
        
        while(index<m*n){
            res[index]=mat[i][j];
            System.out.println(res[index]);
            index++;
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
                    j++;
                    dir=+1;
                }else if(j==0){
                    i++;
                    dir=+1;
                }else{
                    i++;
                    j--;
                }
            }
        }
        
        
        return res;
    }
}
