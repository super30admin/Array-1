# Array-1

## Problem 1

Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input: [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


// Your code here along with comments explaining your approach
class Solution {
    //Time Complexity: O(N)
    //Space Complexity: O(1)
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);
        
        int i=0;
        int j= nums.length-1;
        int leftProd =1;
        int rightProd=1;
        while(i< nums.length -1)
        {
            leftProd *= nums[i];
            result[i+1] = leftProd;
            i++;
        }
        
        while(j >=1)
        {
            rightProd *= nums[j];
            result[j-1] *= rightProd;
            j--;
            
        }
        
        return result;
    }
}


## Problem 2

Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

Example:

Input:

[

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

]

Output: [1,2,4,7,5,3,6,8,9]
// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes

// Your code here along with comments explaining your approach
class Solution {
    //O(M*N) - TIME and constant space
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if( matrix == null || matrix.length == 0)
        {
            return new int[0];
        }
        
        
        int M = matrix.length;
        int N = matrix[0].length;
        int direction =1;
        int row =0; int col =0;
        int[] result = new int[N*M];
        
        int i=0;
        while(i < M *N)
        {
            result[i] = matrix[row][col];
            i++;
            if(direction ==1)
            {
                //could shoot out from the last column
                if ( col == N-1) 
                {
                    //go to the next row 
                    row++; direction = -1;
                }
                //could shoot out from the top row 
                else if( row == 0)
                {
                    col++; direction = -1;
                }
                else
                {
                    row--; col++;
                }
               
            }
            else
            {
                
                //could shoot out from the last row 
                if( row == M-1)
                {
                    col++; direction = 1;
                }
                //could shoot out from the first column
                else if ( col == 0) 
                {
                    //go to the next row 
                    row++; direction = 1;
                }
                else
                {
                    row++; col--;
                }
               
            }
        }
        
        return result;
    }
}

## Problem 3
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:

[

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:

Input:

[

[1, 2, 3, 4],

[5, 6, 7, 8],

[9,10,11,12]

]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
// Time Complexity : O(M*N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes


// Your code here along with comments explaining your approach
class Solution {
    //Time Complexity: O(M*N)
    //Space Complexity: O(1)
    public List<Integer> spiralOrder(int[][] matrix) {
        
            ArrayList<Integer> result = new ArrayList<Integer>();
                    
            int top = 0; 
            int bottom = matrix.length -1;
            int left = 0;
            int right = matrix[0].length -1;
            
            
            while( top <= bottom && left <= right)
            {
                
                //Going left to right in the top row 
                for(int j=left; j <= right; j++ )
                {
                    result.add(matrix[top][j]);
                }
                top++;
                
                //Going top to bottom in the right column 
                if(left <= right)
                {
                    for(int i=top; i <= bottom; i++ )
                    {
                        result.add(matrix[i][right]);
                    }
                    right--;
                }
                
                //Going right to left in the bottom row 
                if(top <= bottom)
                {
                    for(int j=right; j >= left; j-- )
                    {
                        result.add(matrix[bottom][j]);
                    }
                    bottom--;
                }
                
                //Going bottom to top in the left column
                if(left <= right)
                {
                    for(int i=bottom; i >= top; i-- )
                    {
                        result.add(matrix[i][left]);
                    }
                    left++;
                }
                
            }
        
        return result;
        
    }
}