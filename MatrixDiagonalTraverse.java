import java.util.Arrays;

// Time Complexity : O(n*m); where m=rows and n=cols in matrix
// Space Complexity : O(1); constant as input and output array don't count towards space complexity
class MatrixDiagonalTraverse {
	public int[] findDiagonalOrder(int[][] mat) {
    	if(mat==null || mat.length==0) return new int[0];
    	
    	int m= mat.length;//rows
    	int n= mat[0].length; //cols
    	int[] result= new int[m*n];
    	
    	boolean dir=true; //true = up and false = down  	  	
    	int i=0; 
    	int j=0;
    	
    	for(int idx=0; idx<m*n; idx++) {
    		result[idx]=mat[i][j];
    		
    		//Moving Up
    		if(dir) {
    			if(j==n-1) {//right wall
    				i++;
    				dir=false;
    			} else if(i==0) {//top wall
    				j++;
    				dir=false;
    			} else {    				
    				i--;
    				j++;
    			}    			
    		}else { //Moving Down
    			if(i==m-1) {//bottom wall
    				j++;
    				dir=true;
    			} else if(j==0) {//left wall
    				i++;
    				dir=true;
    			} else {    				
    				i++;
    				j--;
    			}
    		}
    	}
    	
    	return result;
    }
    
    // Driver code to test above 
    public static void main(String args[]) { 
    	MatrixDiagonalTraverse ob = new MatrixDiagonalTraverse();  
    	int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};  
    	//int[][] mat= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};  
        System.out.println("Matrix diagonal traversal is : "+Arrays.toString(ob.findDiagonalOrder(mat)));
    } 
}
