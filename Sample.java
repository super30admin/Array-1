// Problem 1

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//Calculate the left product and the right product of the element

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int rp=1; //running product is 1 initially
        
        int[] result= new int[nums.length]; // new result array
        result[0]=1; //add one to the 0th position of the array since the left product will be 1
        
        if(nums==null || nums.length == 0) return result;
        
        for(int i=1; i< nums.length; i++)
        {
            rp= rp*nums[i-1]; //calculate the left running product 
            result[i]= rp; //add it to the result array
        }
        
        rp=1; //reset 
        
        for(int i= nums.length-2; i>=0;i--)
        {
            rp= rp*nums[i+1]; //calculate the right running product 
            result[i]= result[i]*rp; //mutliply it with the result array elements to get the final product
        }
        
        return result; //return result
    }
}

// Problem 2
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes


class Solution {
    
    //Time Complexity= O(m*n)
    //Space Complexity= O(1)
    
    public int[] findDiagonalOrder(int[][] mat) {
        
        if(mat==null || mat.length ==0) return new int[0]; 
        
        int m= mat.length; //matrix row length
        int n= mat[0].length; //matrix column length
        
        int[] result= new int[m*n]; //resultant array
        int i=0; //resultant array index 
        int r=0; //start with first row
        int c=0; //start with first column
        int dir=1; //initially upward direction 
        
        
        
        while(i<m*n) //while we reach the last element 
        {
            result[i]= mat[r][c]; //store the matrix element into the result array
            if(dir==1) //if going upward
            {
                if(c==n-1) //if reached the last column
                {
                    r++; //go to the next row
                    dir=-1; //change direction downward
                }
                else if(r==0) //while the first row
                {
                    c++; //go to the next column 
                    dir=-1; //change the direction 
                }
                else
                {
                    r--; 
                    c++;
                }
            }
            else if(dir==-1) //if going in downward direction 
            {
                if(r==m-1) //if reached the last row
                {
                    c++; //go to the next column
                    dir=1; //change direction 
                }
                else if(c==0) //if reached the first column 
                {
                    r++; //change the row
                    dir=1; //change direction 
                }
                else{
                    r++;
                    c--;
                }
            }
            
            i++; //increment resultant array index
        }
        
        return result; 
    }
}

//Problem 3
// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    
    //Time Complexity = O(m*n)
    //Space Complexity = O(1)
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result= new ArrayList<>(); 
        
        if(matrix==null || matrix.length==0) return result; 
        
        int top=0; //top pointer
        int left=0; //left pointer
        int right=matrix[0].length-1; //right pointer
        int bottom=matrix.length-1; //bottom pointer
        
        while(top<=bottom && left<=right) //while top and bottom does not cross and left and right does not cross
        {
            //top row
            for(int j=left; j<=right; j++) //add the first row to the result
            {
                result.add(matrix[top][j]);
            }
            top++; //move to the next row
             
            //right column
            for(int i=top; i<=bottom;i++) //add the last column to the result
            {
                result.add(matrix[i][right]); 
            }  
            right--; //move to the second last column
            
            //bottom row
            if(top<=bottom){ //check if still our condition holds true
            for(int j=right; j>=left; j--) //add the last row to the result
            {
                result.add(matrix[bottom][j]);
            }
            }
            bottom--; //move to the second last row
            
            //left column
            if(left<=right){
            for(int i=bottom; i>=top; i--) //add the first column to the result
            {
                result.add(matrix[i][left]); 
            }
            }
            left++; //move to the next column
        }
        return result;
    }
}