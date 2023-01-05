// Time Complexity : 0(mn)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Approach: The diagram shows which element should be traversed in which direction. So the element marked with upward arrow is traversed to the element
// which is diagonally to the right i.e. move r--,c++.
// For element marked with downward arrow, traverse diagonally downwards i.e. r++,c--.
// When you hit the corners or the edges of the matrix, you change direction.


class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        
        int[] result=new int[m*n];
        int r=0,c=0; boolean flag=true; //up
        
        for(int i=0;i<result.length;i++){
           
            result[i]=mat[r][c];
            // System.out.println("Loop"+i+"/ "+result[i]);
        
            //if going up
            if(flag){
                if(r==0 & c!=n-1){ //1st row but not last col
                    flag=false;c++;
                } else if(c==n-1){ //last col
                    flag=false;r++;
                } else {
                    r--;c++;
                }
            } else {
                if(c==0 & r!=m-1){
                    flag=true;r++;
                } else if(r==m-1){
                    flag=true;c++;
                } else {
                    r++;c--;
                }
            }
            // System.out.println("Loop"+i+"/ "+ "r: "+r+ " c:" + c);
        }
        return result;
        
        
    }
}