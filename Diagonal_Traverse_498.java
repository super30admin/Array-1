//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : None


class Diagonal_Traverse_498 {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
        	return new int[0];
        
        int row = matrix.length;
        int col = matrix[0].length;
        int[] resultArray = new int[row*col];
        int index = 0;
        int i = 0;
        int j = 0;
        int direction = 1; // 1: Upward direction, -1: Downward direction
        while(index < row*col)
        {
        	resultArray[index] = matrix[i][j];
        		if(direction == 1) // Upward
        		{
	        		if(j == col-1)
	        		{
	        			i++;
	        			direction = -1;
	        		}
	        		else if(i == 0)
	        		{
	        			j++;
	        			direction = -1;
	        		}
	        		else
	        		{
	        			i--;
	        			j++;
	        		}
        		}
        	else // Downward
        	{
        		if(i == row-1)
        		{
        			j++;
        			direction = 1;
        		}
        		else if(j == 0)
        		{
        			i++;
        			direction = 1;
        		}
        		else
        		{
        			i++;
        			j--;
        		}
        	}
        	
        	index++;
        }
        return resultArray;
    }
    
    public static void main(String[] args)
    {
    	int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
    	Diagonal_Traverse_498 DT = new Diagonal_Traverse_498();
    	int[] recivedArray = new int[matrix.length * matrix[0].length];
    	recivedArray = DT.findDiagonalOrder(matrix);
    	for(int i : recivedArray)
    		System.out.print(i + " ");
    }
}
