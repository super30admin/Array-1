// TC: O(N *M) where N represents the number of row element and M represents number of column elements in matrix
// SC: O(M*N) to store each element in the Arraylist

// We are just moving ahead column wise so that we form a spiral, once we move ahead column, we need come down, so reduce the row index, to move backwards
// again move from right to left, upwards from bottom. So, basically we are moving the row and column indices in the spiral order.

import java.util.*;

public class SpiralMatrix {
	
	public void Spiral(int[][] A) {
		
		int r1 = 0;
		int c1 = 0;
		int r2 = A.length-1;
		int c2 = A[0].length-1;

		List<Integer> list = new ArrayList();
		while(r1<=r2 && c1<=c2) {
			
			
			for(int c = c1;c<c2;c++) {
				list.add(A[r1][c]);
			}
			
			for(int r=r1;r<=r2;r++) {
				list.add(A[r][c2]);
			}
		
			
			if(r1<r2 && c1<c2) { // if there is only one column and many rows.
				
				for(int c = c2-1;c>c1;c--) {
					list.add(A[r2][c]);
				}
				
				for(int r = r2;r>r1;r--)
					list.add(A[r][c1]);
				
			}
			r1++;
			r2--;
			c1++;
			c2--;
			
		}
		
		for(int l: list)
			System.out.print(l+" ");
	}
	
	public static void main(String[] args) {
		
		SpiralMatrix sp = new SpiralMatrix();
		int[][] A = { {1,2,3},{4,5,6},{7,8,9
			}  };
		sp.Spiral(A);
	}

}
