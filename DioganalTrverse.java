//Time Complexity :O(MN) where M,N is row and column of the matrix
//Space Complexity :O(1) Because the extra space we are using is the result itself so it
//will not count
//Did this code successfully run on LeetCode :Yes
//Any problem you faced while coding this : No 

public class DioganalTrverse {
	 public int[] findDiagonalOrder(int[][] mat) {
	        
	        int row = mat.length;
	        int col = mat[0].length;
	        int[] arr = new int[row * col];
	        
	        int r =0,c=0;
	        boolean up = true;
	        int idx =0;
	        
	      while(idx < row * col){
	          if(up) {
	              arr[idx] = mat[r][c];
	              
	                  if(c==col-1){
	                    r++;
	                      up = false;
	                  }
	                 else if(r == 0){
	                    c++;
	                     up = false;
	                }
	                else{
	                    r--;
	                    c++;
	                }
	             }
	        else {
	         
	            arr[idx] = mat[r][c];
	              
	                 if(r==row-1){
	                    c++;
	                    up = true;
	                  }
	                 else if(c == 0){
	                    r++;
	                    up = true;
	                }
	                else{
	                    r++;
	                    c--;
	                }
	        } 
	          
	         idx++; 
	      }
	        
	  
	   
	        return arr;
	    }
	    
}
