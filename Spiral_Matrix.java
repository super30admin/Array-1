import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author aupadhye
 *
 */
public class Spiral_Matrix {

	/**
	 * @param args
	 */
	
	public static List<Integer> spiralMat(int[][] mat,int R,int C){
		List<Integer> result = new ArrayList<Integer>();
		int M = mat.length;
		int N = mat[0].length;
		int K = 0;
		int L = 0;
		
		while(K<M && L<N) {
		for(int i=L;i<N;i++) {//Print the first row.
			
			result.add(mat[K][i]);
			
		}
		K++;
		
		
		for(int i=K;i<M;i++) {//Print the last column and subtract the last column number
			
			result.add(mat[i][N-1]);
			
		}
		N--;
		
		if(K < M)
		{
		for(int i=N-1;i>=L;i--) {
									//Print last row elements and switch above last row 
			result.add(mat[M-1][i]);
			
		}
		M--;
		}
		
		if(L < N) {
		for(int i=M-1;i>=K;i--) {
										//Print first row from downward direction and move to next column
			result.add(mat[i][L]);
			
		}
		L++;
		}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		   int a[][] = new int[][]{ { 1, 2, 3, 4, 5, 6 }, 
                   { 7, 8, 9, 10, 11, 12 }, 
                   { 13, 14, 15, 16, 17, 18 } }; 
		   
		  List<Integer> result = spiralMat(a,a.length,a[0].length);
		  System.out.println(result); 
		  
	}

}
