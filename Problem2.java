// Time Complexity - O(m*n)
// Space Complexity - O(1)
// This Solution worked on LeetCode
// This is a ziz zag diagonal order problem. So, I need both forward and backward traversal in diagonal order.
I have inserted in the output array while traversing in forward and backward direction and changing the direction when the boundry conditions are met. 


class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
	        if(matrix == null || matrix.length==0 || matrix[0].length ==0) return new int[0];
            int m = matrix.length;
	        int n = matrix[0].length;
	        int[] out = new int[m*n]; 
	        int row=0,column=0;
	        //out[0] = matrix[0][0];
	        int i=0;
	        boolean forward = true;
	        while(i < m*n){
	        	out[i++] = matrix[row][column];       //Insert in the output array
	            if(forward){                      //forward
	            	if (column==n-1) {              //In Forward check column boundry condition first because column is increasing otherwise
	                	row++;
	                	forward = false;           //Change direction if boundry is achieved
	                }
	            	else if(row==0) {
	                	column++;
	                	forward = false;         //Change direction if boundry is achieved
	                }
	                else{
	                	row--;
	                	column++;
	                }     
	            }
	            else{                                   //Backward
                   if(row == m-1) {                 //In Backward check row boundry condition first because row is increasing otherwise
                    column++;
                    forward = true;                //Change direction if boundry is achieved
	            	}
	            	else if(column == 0) {
	            		row++;
	            		forward = true;                    //Change direction if boundry is achieved
	            	}	
	            	else {
	            		row++;
	            		column--;
	            	}	
	            }
	        }
	        return out;
    }
}
