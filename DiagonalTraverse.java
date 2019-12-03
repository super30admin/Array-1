
public class DiagonalTraverse {
	public int[] findDiagonalOrder(int[][] matrix) {
		
		//	Time:  O(m*n) 
		//	Space O(m*n)
		//	LeetCode: yes

		int m = matrix.length;
		if(matrix == null || m == 0) return new int[0];
		int n = matrix[0].length;
		int [] result = new int[m*n];
		int rows = 0;
		int cols = 0;
		int i = 0;
		int dir = 1;
		while(i < m*n){
			result[i] = matrix[rows][cols];
			//Csae 1 - going in forward direction
			if(dir == 1){
				//if last column is reached,going in reverse direction
				if(cols==n-1) {
					rows++;
					dir = -1;
					//if pointer at first row, going in reverse direction        
				} else if (rows==0) {
					cols++;
					dir = -1;
				} else{
					rows--;
					cols++;
				}
			//case 2- going in backward direction	
			} else {
				//if last row is reached, going in forward direction 
				if(rows == m-1) {
					cols++;
					dir = 1;
					//if pointer at first row , going in forward direction             
				} else if(cols==0) {
					rows++;
					dir = 1;
				} else {
					rows++; 
					cols--;
				}
			}
			i++;
		}
		return result;
	}

}
