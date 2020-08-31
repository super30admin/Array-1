// TC: O(m*n) where m represents the row length and n represents the column length. sinnce we traverse through each element in the matrix
// SC: O(1) since we are not using any extra data structure.

// If we know that the sum of row and column is even, we know that the pointer for row or column is on odd pointer, so we need to move from top to bottom.
// To move top to bottom, we need to move one row ahead and come back one column,(r++, c--) we are checking for edge cases if incase we reach end of row 
// or we are at start of the column array(since we are reducing columns and increasing rows).  We will implement similarly when we are at even row and column, 
// so to move up, we move row up and one column ahead(r--, c++)

public class DiagonalPrint {
	
	public void Diagonal(int[][] A) {
		  if(A==null || A.length==0)
	            System.out.println("null");
		  
		int r= 0;
		int c = 0;
		
		int n = A.length;
		int m = A[0].length;
		int[] res = new int[n*m];
	
		for(int i=0;i<res.length;i++) {
			
				res[i] = A[r][c];
				if((r+c)%2==0) { // move up
					if(c==m-1) {
						r++;
					}else if(r==0)
					{
						c++;
					}
					else {
						r--;
						c++;
					}
				}else { // move down
					if(r==n-1) {
						c++;
					}else if(c==0) {
						r++;
					}else {
						r++;
						c--;
					}
				}
			}
		
		for(int l: res)
			System.out.print(l+" ");	
		}
	
	
	public static void main(String[] args) {
		DiagonalPrint dp = new DiagonalPrint();
		int[][] A  = {{1,2,3}, {4, 5, 6}, {7, 8, 9} };
		dp.Diagonal(A);
	}
	

}
