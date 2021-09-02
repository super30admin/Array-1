// Time Complexity : O(mn) n is length rows and m in length of columns
// Space Complexity : O(n) n is length of array using additional array to store the result
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
1. take left right top bottom pointer and keep pushing inwards 
2. use recursive call 


// Your code here along with comments explaining your approach

class Solution {
    ArrayList<Integer> arr = new ArrayList<>();
    public List<Integer> spiralOrder(int[][] matrix) {
       if(matrix.length ==1)
       {
           for(int cl =0 ;cl < matrix[0].length ; cl++ )
           {
               arr.add(matrix[0][cl]);
           }
           return arr;
       }
        else if (matrix[0].length ==1)
        {
             for(int cl =0 ;cl < matrix.length ; cl++ )
           {
               arr.add(matrix[cl][0]);
           }
           return arr;
        }
     
        int top = 0;
        int bottom = matrix.length -1; // 3
        int left = 0;
        int right = matrix[0].length -1; //3
         sprial(matrix,top,bottom, left, right);
    
        return arr;
    }
    
    private void sprial(int[][]matrix , int top, int bottom, int left, int right)
    {
       if(right < left || top > bottom)
           return;
        
        else
        {
            // read top
            for(int col = left; col <= right; col++ )
            {
                arr.add(matrix[top][col]);
            }
            top++;
            
            if(right < left || top > bottom)
           return;
            // read right
             for(int row = top; row <= bottom; row++ )
            {
                arr.add(matrix[row][right]);
            }
            right--;
            
            if(right < left || top > bottom)
           return;
            //read bottom
            for(int col = right; col >= left; col-- )
            {
                arr.add(matrix[bottom][col]);
            }
            bottom--;
            
            if(right < left || top > bottom)
           return;
            //read left
            for(int row = bottom; row >= top; row-- )
            {
                //if(left >0 && row >= 0)
                arr.add(matrix[row][left]);
            }
            left++;
            if(right < left || top > bottom)
           return;
            sprial(matrix,top,bottom, left, right);
        }
    }
    } 