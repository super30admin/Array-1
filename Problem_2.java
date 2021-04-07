// Time Complexity :O(m*n)
// Space Complexity :O(m*n) if output array is considered
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//check the possible way and figure out the edge cases for matrix to follow the path.
//dir=1 for going up and -1 for going down.
// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0) return new int[] {};
        int m=matrix.length, n=matrix[0].length;
        int[] res = new int[m*n];
        int k=0, dir=1,i=0,j=0;
        
        while(i<=m-1 && j<=n-1){
                res[k] = matrix[i][j];
                if(dir==1){
                    if( j==n-1){
                        i++;
                        dir=-1;
                    }
                    else if(i==0){
                        j++;
                        dir=-1;
                    }else{
                        i--;
                        j++;
                    }
                }else{
                    if( i==m-1){
                        j++;
                        dir=1;
                    }else if(j==0){
                        i++;
                        dir=1;
                    }else{
                        i++;
                        j--;
                    }
                    
                }k++;
            
        }return res;
    }
}