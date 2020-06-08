//https://leetcode.com/problems/product-of-array-except-self/
// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : No, Time Limit Exceeded
// Three line explanation of solution in plain english

/* Brute Force solution
Traversing the array nums for each element and finding product excluding the value at that index
*/
// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[] = new int[nums.length];
        int product=1;
        for(int i=0;i<nums.length;i++) // to keep track of the num for which we are finding product
        {
            for(int j=0;j<nums.length;j++) // to traverse the whole array
            {
                if(i!=j) // excluding the current index 
                    product *= nums[j];
            }
            arr[i] = product; // storing in arr i.e output data structure
            product =1;
        }
        return arr;
    }
}

// Time Complexity :O(n)
// Space Complexity : O(n) right is the auxillary data structure used
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
finding the left product by using a running product and temp value. To exclude the current value we used
a dummy value and find product till that value and store in left array
then finding the right product by the same technique starting from the end of the array
 and multiplying the left and right rpoduct arrays made. It basically multiplies the values on left and right
 without including the current one
*/
// Your code here along with comments explaining your approach

class Solution {
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        
        //finding left product
        int rprod = 1;// dummy
        int temp = 1;
        
        for(int i=0;i<nums.length;i++)
        {
            rprod *= temp; // finding running prod by multiplying the rprod with the temp (prev value)
            left[i] = rprod; // adding running product to left array
            temp=nums[i]; // assigning current value to temp to be used in next running prod (not including current value)
        }
        
        //finding right product
         rprod = 1;
         temp = 1;
        
        for(int i=nums.length-1; i>=0; i--) // staring from back
        {
            rprod *= temp;
            right[i] = rprod;
            temp=nums[i];
            
        }
        
        for(int i=0;i<left.length;i++)
        {
            left[i] *= right[i]; // multiplying left and right
        }
       
        return left;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
same technique as above just multiplied the right product directly to the left array so that space is saved
*/
// Your code here along with comments explaining your approach

class Solution {

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left[] = new int[nums.length];
        
        //finding left product
        int rprod = 1;
        int temp = 1;
        
        for(int i=0;i<nums.length;i++)
        {
            rprod *= temp;
            left[i] = rprod;
            temp=nums[i];
        }
        
        //finding right product
         rprod = 1;
         temp = 1;
        
        for(int i=nums.length-1; i>=0; i--)
        {
            rprod *= temp;
            left[i] *= rprod; // multiplying right running product to left and storing in left 
            temp=nums[i];
            
        }
       
        return left;
    }
}

//https://leetcode.com/problems/diagonal-traverse/
// Time Complexity : O(n*m)
// Space Complexity : O(1) as no auxillary data structure used
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
Seperate case for going in upward direction and downward direction
For dir=1
If we overflow the array from last column then we should change direction and increase row.
If we overflow the array from first column then we should change direction and increase.
Then we need to increase columns. 
If we are not overflowing then increase column by 1 and decrease row by 1.

Repeat the same for dir = -1
*/
// Your code here along with comments explaining your approach

class Solution {

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
      if(matrix==null || matrix.length==0)
          return new int[0];
          
        int n = matrix.length;
        int m = matrix[0].length;
        int result[] = new int[n*m];
        
        int dir=1;
        int r=0;
        int c=0;
        int i=0; // to track result array
        
        while(i<n*m)
        {
            result[i] = matrix[r][c];
            if(dir==1)
            {
                //If we make a check on row == 0 before column == last. 
//In that case we will end up increasing column by 1 and it might end up taking us to last column.
                if(c==m-1) // if column is going to exceed last column
                {
                    r++; //increment row
                    dir=-1;  // change direction
                }
               else if(r==0) // if row is going to become less than o
               {
                    c++; // increase column
                    dir=-1;// change direction
               }
               else
                {
                    r--; // go to next by decreasing row and increasing column
                    c++;
                }
            }  
           else if(dir==-1)
            {
                if(r==n-1)
                {
                    c++;
                    dir=1; 
                }
               else if(c==0)
               {
                    r++;
                    dir=1;
               }
               else
                {
                    r++;
                    c--;
                }
            }
            
            i++;
        }
        
       return result;
    }
}

//https://leetcode.com/problems/spiral-matrix
// Time Complexity : O(m*n) visiting each cell once
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
    Left, Right, Top, Bottom are four pointers kept
    Go from left - right on top row. Increase top row index.
    Go from top - bottom on last column. Decrease right index.
    Go from right - left on bottom column. Decrease bottom pointer.  Top and bottom pointers may have crossed each other so check since top has moved 
    Go from bottom - top. Increase left pointer.Left and right pointers may have crossed each other so check since right has moved 
     Go till left does not cross right and top does not cross bottom
*/
// Your code here along with comments explaining your approach

class Solution {

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        
        if(matrix==null || matrix.length==0)
            return list;
        
        int n=matrix.length;
        int m=matrix[0].length;
        
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=m-1;
        
       
        while(top<=bottom && left<=right)
        {
            //top row
            for(int i=left;i<=right;i++)
            {
                list.add(matrix[top][i]);  
            }
            top++;
            
            //right column
            for(int i=top;i<=bottom;i++)
            {
                 list.add(matrix[i][right]);
               
            }
             right--;
            
            //bottom row
            if(top<=bottom)
            {
                 for(int i=right;i>=left;i--)
                     list.add(matrix[bottom][i]);
              
            }
             bottom--;
            
            //left column
            if(left<=right)
            {
               for(int i=bottom;i>=top;i--)
                 list.add(matrix[i][left]);
            }
            left++;  
           
        }
        return list;
    }
}

// Time Complexity : O(m*n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
same approach*/
// Your code here along with comments explaining your approach

class Solution {
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(matrix==null || matrix.length==0)
            return list;
        
        int n=matrix.length;
        int m=matrix[0].length;
        
     return helper(matrix, list, 0, n-1, 0, m-1);
    }
    
    private ArrayList<Integer> helper(int[][] matrix, ArrayList<Integer> list, int top, int bottom, int left, int right)
    {
        if(top>bottom && left>right)
        {
            return list;
        }
            //top row
        if(top<=bottom)
        {
            for(int i=left;i<=right;i++)
            {
                list.add(matrix[top][i]);  
            }
        }
            top++;
            
            //right column
         if(left<=right)
         {
            for(int i=top;i<=bottom;i++)
            {
                 list.add(matrix[i][right]);
               
            }
         }
             right--;
            
            //bottom row
            if(top<=bottom)
            {
                 for(int i=right;i>=left;i--)
                     list.add(matrix[bottom][i]);
              
            }
             bottom--;
            
            //left column
            if(left<=right)
            {
               for(int i=bottom;i>=top;i--)
                 list.add(matrix[i][left]);
            }
            left++;  
          
            helper(matrix, list, top, bottom, left , right);
        return list;
    }
       
    
}