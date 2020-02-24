import java.util.Arrays;

/**
 * 
 */

/**
 * @author aupadhye
 *
 */

//Space and time complexity would be O(n) for traversal and O(n) for maintaining list.
public class Diagonal_traversal {

	/**
	 * @param args
	 */
	
	  public static  int[] findDiagonalOrder(int[][] matrix) {
	        if(matrix == null || matrix.length == 0)return new int[]{};
	        int rEnd = matrix.length;
	        int cEnd = matrix[0].length;
	        int[]diagonal = new int[cEnd*rEnd];
	        boolean goingUp = true;
	        int r=0,c=0;
	        int index=0;
	        while(index<rEnd*cEnd){//added all the elements
	            diagonal[index++] = matrix[r][c];//add the current element
	            if(goingUp){
	                if(r-1 >=0 && c+1 < cEnd ){//decrease the row and increment the column
	                    r = r-1;
	                    c = c+1;
	                }else{
	                    //going up not possible ..reached limit
	                    goingUp = false;
	                    if(c+1 < cEnd)c=c+1; //increment the column if not reached the limit
	                    else r=r+1; //else increment the row
	                }
	            }else{
	                if(r+1 < rEnd && c-1 >= 0 ){
	                    r = r+1;
	                    c = c-1;
	                }else{
	                    //going down not possible ..reached limit
	                    goingUp = true;
	                    if(r+1 < rEnd)r=r+1;//increment the row if not reached the limit
	                    else c=c+1;//increment the column
	                }
	            }
	        }
	        return diagonal;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[][] M = new int[][]{{1, 2, 3, 4}, 
                 {5, 6, 7, 8}, 
                 {9, 10, 11, 12}, 
                 {13, 14, 15, 16}, 
                 {17, 18, 19, 20}, 
                }; 
	
                
              int[] res =  findDiagonalOrder(M);
              System.out.println(Arrays.toString(res));
		
	}

}
