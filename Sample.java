//Product of array except self
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english:when getting the output for particualr index, we consider left half of the array and right ha
// half and then multiply them together.

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length==0 || nums==null)
            return new int[0];
        int product =1;
        int a[]= new int[nums.length];
        int b[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            
            a[i]=product;
            product=product*nums[i];
        }
       product=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            b[i]=product;
            product=product*nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            a[i]=a[i]*b[i];
        }
        
        return a;
    }
       
}
//Spiral matrix
// Time Complexity :O(n*m)
// Space Complexity :O(n*m)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english:

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0|| matrix[0].length==0)
            return new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        List<Integer> output= new ArrayList<>();
        int top=0; int left=0;
        int right=m-1;
        int bottom=n-1;
        while(top<=bottom && left<=right)
        {
            //top left->right
            for(int i=left;i<=right;i++)
            {
                output.add(matrix[top][i]);
            }
            top +=1;
            //right top->bottom
            for(int i=top;i<=bottom;i++)
            {
                output.add(matrix[i][right]);
            }
            right -=1;
            //bottom right->left
            if(top<=bottom){
            for(int i=right;i>=left;i--)
            {
                output.add(matrix[bottom][i]);
            }
            }
            bottom -=1;
            //left bottom->top
            if(left<=right){
            for(int i=bottom;i>=top;i--)
            {
                output.add(matrix[i][left]);
            }
            }
            left +=1;
                
        }
        return output;
    }
}
//Diagonal matrix
// Time Complexity :O(n*m)
// Space Complexity :O(n*m)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english:

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null|| matrix.length==0||matrix[0].length==0)
            return new int[0];
        int n=matrix.length;
        int m=matrix[0].length;
        int i=0; int j=0;
        int dirs=1;
        int[] output= new int[m*n];
        int index=0;
        while(index< n*m)
        {
            output[index]=matrix[i][j];
            
            index +=1;
            //upwards
            if(dirs==1)
            {
                if(j==m-1)
                {
                    dirs=-1;
                    i+=1;
            
                }else if(i==0){
                    dirs = -1;
                    j +=1;
                }else{
                    i-=1;
                    j+=1;
                }
                
            } else{
                if(i==n-1)
                {
                    dirs=1;
                    j+=1;
            
                }else if(j==0){
                    dirs = 1;
                    i +=1;
                }else{
                    i+=1;
                    j-=1;
                }
                
            }
        }
        return output;
    }
}
