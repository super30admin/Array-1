// Time Complexity :o(n);
// Space Complexity :o(m*n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :yes got different outputs many times.


// Your code here along with comments explaining your approach:- traversing diagnolly has only two directions either left or down if it is up setting  dir to 1 and if reached top most row changing direction by incrementing j if it reached to right most column again changing direction or else row to be decremented and column to be incremented.

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if((mat==null)||(mat.length==0)||(mat[0].length==0)){
            return null;
        }
        int n=mat.length;
        int m=mat[0].length;
        int[] a=new int[m*n];
        int dir=1;
        int index=0;
        int i=0;
        int j=0;
        while(index<m*n){
            a[index]=mat[i][j];
             index=index+1;
            if(dir==1){
                if(j==m-1){
                    dir=-1;
                    i++;
                
                    
                }
                 else if(i==0){
                    dir=-1;
                    j++;
                 
                } else{
                    i--;
                    j++;
                }
            }else{
                if(i==n-1){
                   dir=1;
                   j++; 
                   
                }
                 else if(j==0){
                    
                    dir=1;
                    i++;
                   
                } else{
                    i++;
                    j--;
                }
            }
            
             
        }
                
                
            
           

   return a; }
}