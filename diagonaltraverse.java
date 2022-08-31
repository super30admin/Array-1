/*Time Complexity:O(n*m)
Space Complexity:O(1)
*/
class Solution {
	public int[] findDiagonalOrder(int[][] mat) {
		int rows = mat.length;
		int cols = mat[0].length;
		int[] result = new int[rows * cols];
		int resultIndex = 0;

		int row = 0;
		int col = 0;

		boolean isUp = true;
        
		while (resultIndex < rows * cols) {
    ]
			if (row >= 0 && row < rows && col >= 0 && col < cols) {
				result[resultIndex] = mat[row][col];
				resultIndex++;
			} 
]
			if (isUp) {
				col++;
				row--;
			} else { 
				row++;
				col--;
			}
            
    ]
            if(row < 0){
                row = 0;
                isUp = !isUp;
            }
            if(col < 0){
                col = 0;
                isUp = !isUp;
            }
		}
        
		return result;
	}
}