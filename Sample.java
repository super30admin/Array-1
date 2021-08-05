//Diagnol traversal
// Time Complexity :O(mn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat[0].length;
        int n=mat.length;
        int result[]=new int[n*m];
        
        int row=0;
        int col=0;
        int i=0;
        int dir=1;
        //if dir=1, then we are moving upwards, else downwards.
        
        while(i<n*m){
            result[i]=mat[row][col];
            if(dir==1){
                if(col==m-1){
                    dir=-1;
                    row++;
                    
                }
                else if(row==0){
                    dir=-1;
                    col++;
                    
                    
                }
                else{
                    row--;
                    col++;
                    
                }
                
            }else{
                if(row==n-1){
                    dir=1;
                    col++;
                    
                }
                else if(col==0){
                    dir=1;
                    row++;
                    
                }
                else{
                    row++;
                    col--;
                    
                }
                
            }
            i++;
            
        }
        return result;
        
    }
}


//spiral traversal
//TC O(mn)
//SC O(1)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int first_row=0;
        int first_col=0;
        int last_row=matrix.length-1;
        int last_col=matrix[0].length-1;
        List<Integer> list=new ArrayList<Integer>();
        
        while(first_row<=last_row && first_col<= last_col){
            
            for(int i=first_col;i<=last_col;i++){
                list.add(matrix[first_row][i]);
            }
            first_row++;
            for(int i=first_row;i<=last_row;i++){
                list.add(matrix[i][last_col]);
            }
            last_col--;
            if(first_row<=last_row){
                for(int i=last_col;i>=first_col;i--){
                    list.add(matrix[last_row][i]);
                }
                last_row--;
            }
            if(first_col<=last_col){
                for(int i=last_row;i>=first_row;i--){
                    list.add(matrix[i][first_col]);
                }
                first_col++;
            }
            
        }
        return list;
        
    }
}

//Product of array except self
//TC:- O(n)
//SC: O(n)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        
        left[0]=1;
        right[right.length-1]=1;
        for(int i=1;i<left.length;i++){
            left[i]=left[i-1]*nums[i-1];
            
        }
         for(int i=right.length-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
            
        }
        
        for(int i=0;i<nums.length;i++){
            nums[i]=left[i]*right[i];
        }
        return nums;
    }
}