import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
	public List<Integer> spiralOrder(int[][] matrix) {
		//Approach: 1. To move sprially in a matrix, we use 4 pointers - top, bottom, left and right. So while there are no cross over between top and bottom, and left and right we keep going.
		//2. Here we start with left, go till right pointer adding elements to output, once done we increment top pointer since we will nto be visiting the same row again.
		//3. Then we go from top to bottom adding elements to output, and once done, we will decrement right pointer so as to move left, and start adding elements from right to left psoition, 
		//decrementing bottom pointer and then we will add elements from bottom to left incrementing left pointer. 
		//4. We will be checking for cross boundaries in between to make sure we are inside the matrix. Finally will return the result.
        List<Integer> spiralList = new ArrayList<Integer>();
        if(matrix == null || matrix.length == 0)
            return spiralList;
        int top = 0, left = 0 , bottom = matrix.length-1, right = matrix[0].length-1;
        
        while(top <= bottom && left <= right )
        {
            for(int i=left; i<= right;i++)
                spiralList.add(matrix[top][i]);
            top++;
            
            if(top > bottom || left > right)
                break;
            
            for(int i=top; i<= bottom;i++)
                spiralList.add(matrix[i][right]);
            right--;
           
            if(top > bottom || left > right)
                break;
            
            for(int i=right; i >= left;i--)
                spiralList.add(matrix[bottom][i]);
            bottom--;           
            
            for(int i=bottom; i >= top;i--)
                spiralList.add(matrix[i][left]);
            left++;
        }
        return spiralList;
    }
}
//Time Complexity : O(m*n) where m and n are row lengtha and column length of matrix
//Space Complexity : O(m*n) where m and n are row lengtha and column length of matrix
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this :