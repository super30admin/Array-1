// Time Complexity :O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
public class DiagonalMatrix {
	public int[] findDiagonalOrder(int[][] mat) {
        int direction=1;
        int[] result=new int[mat.length*mat[0].length];
        int row=0;
        int column=0;
        int i=0;
        while(i<mat.length*mat[0].length){
            result[i++]=mat[row][column];
            if(direction==1){
                
                if(column==mat[0].length-1){
                    row++;
                    direction=0;
                }else if(row==0){
                    column++;
                     direction=0;
                }else{
                    row--;
                    column++;
                }
             
                
            }else{
                if(row==mat.length-1){
                    column++;
                     direction=1;
                }else if(column==0){
                    row++;
                     direction=1;
                }else{
                    row++;
                    column--;
                }
               
            }
        }
        
        return result;
    }
}
