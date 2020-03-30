//TimeComplexity: O(n) where n is number of elements in matrix. 
//Space Complexity: O(1)

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
      
        if(matrix==null || matrix.length==0 || matrix[0].length==0) return result; 
        
        int left=-1, right=matrix[0].length, up = -1, down = matrix.length;
        int direction = 1;
        int i=0, j=0;
        while(j>left && j<right && i>up  && i < down)
        {
            result.add(matrix[i][j]);
            switch(direction)
            {
                case 1:
                    if (j+1 < right)
                    {
                        j++;
                    }
                    else
                    {
                        up++;
                        direction = 2;
                        i++;
                    }
                    break;
                case 2: 
                    if(i+1 < down)
                    {
                        i++;
                    }
                    else
                    {   right--;
                        direction = 3;
                        j--;
                    }
                    break;
                case 3: 
                    if(j-1 > left)
                    {
                        j--;
                    }
                    else
                    {   
                        down--;
                        direction = 4;
                        i--;
                    }
                    break;
                case 4:
                    if (i-1 > up)
                    {
                        i--;
                    }
                    else
                    {
                        left++;
                        direction = 1;
                        j++;
                    }
                    break;  
                
                default:
                    break;
                }
            }
    return result;
    }
}