//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : None


import java.util.ArrayList;
import java.util.List;

class Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
        	return new ArrayList<>();
        
        List<Integer> result = new ArrayList<>();
        
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        
        while(left <= right && top <= bottom)
        {
        	if(left <= right && top <= bottom)
        	{
	        	for(int i = left; i <= right; i++)
	        	{
	        		result.add(matrix[top][i]);
	        	}
	        	top++;
        	}
        	
        	if(left <= right && top <= bottom)
        	{
	        	for(int i = top; i <= bottom; i++)
	        	{
	        		result.add(matrix[i][right]);
	        	}
	        	right--;
        	}
        	
        	if(left <= right && top <= bottom)
        	{
	        	for(int i = right; i >= left; i--)
	        	{
	        		result.add(matrix[bottom][i]);
	        	}
	        	bottom--;
        	}
        	
        	if(left <= right && top <= bottom)
        	{
	        	for(int i = bottom; i >= top; i--)
	        	{
	        		result.add(matrix[i][left]);
	        	}
	        	left++;
        	}
        }
        return result;
    }
    public static void main(String[] args)
    {
    	int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
    	Spiral_Matrix SPMatrix = new Spiral_Matrix();
    	List<Integer> recivedList = new ArrayList<>();
    	recivedList = SPMatrix.spiralOrder(matrix);
    	for(int i : recivedList)
    		System.out.print(i + " ");
    }
}
