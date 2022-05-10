import java.util.ArrayList;
import java.util.List;

//Product of Array Except Self
//Time Complexity : O(2N)-->O(N)
//Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        //resultant array
        int[] result = new int[nums.length];
        //running product initialised to 1
        int rp =1;
        //considering 1st element as just 1 because we do multiply
        result[0]=1;
        //traverse from 2nd element of array left-->right
        for(int i = 1; i < result.length; i++ ){
            //multiply rp with previous element
            rp = rp*nums[i-1];
            result[i]= rp;
        }
       rp=1;
        //traverse from last but one element of array right-->left
        for(int i = result.length-2; i>=0; i--){
            //multiply rp with previous element
            rp=rp*nums[i+1];
            //result multiply the new rp to old rp from result
            result[i]=result[i]*rp;
        }
        return result;
    }
}

//Diagonal Traverse
//Time Complexity : O(N)
//Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 
class Solution1 {
    public int[] findDiagonalOrder(int[][] mat) {
        //if matrix is null
          if(mat==null) return new int[0];
        
        int m = mat.length;
        int n = mat[0].length;
        //resultant array
        int [] result = new int [m*n];
        //row,column,direction specifies to up(1) or down(-1),i-->index of resultant array
        int r = 0;
        int c = 0;
        int dir = 1;
        int i = 0;
        while(i < m*n){
            result[i] = mat[r][c];
            i++;
            if(dir == 1){
                //if its last column change direction
                if(c == n-1)
                {  
                    r++;
                    dir=-1;
                    
                }
                //if row is 0 move up and next column element
                else if(r==0)
                {
                     c++;
                     dir = -1;
                }
                
                else{
                    r--;
                    c++;
            }
            }
            else{
                //if last row goto next column and change direction
                if( r== m-1)
                { 
                    c++;
                    dir = 1;

                }
                //if first column move to next row change direction
                else if(c == 0 ){
                    r++;
                    dir = 1;
                    
                }
                else{
                    r++;
                    c--;
                   
                }
            }
         
        }
        return result;
    }
}

//Spiral Matrix
//Time Complexity : O(m*n)
//Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 
class Solution2 {
    public List<Integer> spiralOrder(int[][] matrix) {  
        int m = matrix.length;
        int n = matrix[0].length;
        //resultant array
       List<Integer> list = new ArrayList<>();
        //if matrix is null
        if(matrix==null) 
        {
              list.add(0);
              return list;
        }
        int left =0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;
        //traverse until both left and right  & top and bottom cross each other
        while(left <= right && top <= bottom){
            //copy top row elements to list
            for(int j = left ; j <= right; j++){
                list.add(matrix[top][j]);
            }
             top++;
            //copy right column elements to list
            for(int j = top; j<=bottom ; j++ ){
                list.add(matrix[j][right]);
            }
            right--;
            if(top <= bottom){
            //copy bottom row elements to list
            for(int j = right; j>=left ; j--){
                list.add(matrix[bottom][j]);
            }
            bottom--;
            }
            if(left <= right){
            //copy left column elements to list
            for(int j = bottom; j >= top; j--){
                list.add(matrix[j][left]);
            }
            left++;
            }
        }
        return list;
    }
}