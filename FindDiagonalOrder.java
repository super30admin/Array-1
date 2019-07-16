//Time complexity of this function: O(n) 
//Space Complexity of this function: O(m*n)  new array of size m *n created to store output .

//Did this code successfully run on Leetcode : yes
//Any problem you faced while coding this:yes
public class FindDiagonalOrder {

	public static int[] diagonalOrder(int[][] matrix) {
		// TODO Auto-generated method stub
        if (matrix.length == 0) return new int[0];
        //initializing r means row , c means column to 0.
        // m is initilaized to row end and n is initilazed to column end
        int r = 0, c = 0, m = matrix.length, n = matrix[0].length, arr[] = new int[m * n];
        
        //iterate throught 2D array  and store values in  outputarray arr
        for (int i = 0; i < arr.length; i++) {
            arr[i] = matrix[r][c];
            //if row+column is divisible by 2 then move up otherwise move down
            //move up has two edge condition: 1)if row is 0 then read columns.c++
            //                                2)if column is reached at end then read rows.r++
            							//otherwise for middle element just reduce row and increase column to go up
            
            //move down has two edge condition : 1)if row is reached at end then read columns c++
                                          //       2)if columns is 0 then read row.row++
            							// otherwise for other element just increase row and and reduce column to come down.
            
            if ((r + c) % 2 == 0) { // moving up
                if      (c == n - 1) { r++; }
                else if (r == 0)     { c++; }
                else            { r--; c++; }
            } else {                // moving down
                if      (r == m - 1) { c++; }
                else if (c == 0)     { r++; }
                else            { r++; c--; }
            }   
        }   
        return arr;
    }
	
	public static void main(String[] args) {
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}}; 
		int[] result =diagonalOrder(arr);
		System.out.print("result is");
	
			for(int i= 0;i<result.length;i++) 
				System.out.print(","+result[i] );
			}
	
	}

	


