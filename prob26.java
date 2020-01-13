// S30 Big N Problem #26 {Medium}
// 498. Diagonal Traverse
// Time Complexity :O(m*n)
// Space Complexity :No extra space
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :None


// Your code here along with comments explaining your approach
// direction flag
// 3 cases for each direction; two edges and comman 
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        //edge case
        if(matrix==null ||matrix.length==0) return new int[]{};
        int m=matrix.length;
        int n=matrix[0].length;
        int[] result=new int[m*n];
        int r=0;
        int c=0;
        int i=0;
        int dir=1;
        while(i < m*n){
            result[i] = matrix[r][c];
            if(dir==1){
                //order matters
                //1 2 3
                //4 5 6
                //7 8 9
                if(c==n-1){//case where the index reaches 3 {r==0 and c==n-1}
                    r++;
                    dir=-1;
                }else if(r==0){
                    c++;
                    dir=-1;
                }else{
                    r--;
                    c++;
                }
            }else{
            	//order matters
                if(r==m-1){
                    c++;
                    dir=1;
                }else if(c==0){
                    r++;
                    dir=1;
                }else{
                    r++;
                    c--;
                }
            }
            i++;
        }
        
        return result;
    }
}