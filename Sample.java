
//Spiral Matrix
//Time Complexity o(mn) m- no of rows, n - noof columns
//Space 0(1)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // res list
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0)
            return res;
        
        int Left = 0,Right = matrix[0].length-1;
        int Top = 0, Bottom = matrix.length-1;
        
        while (Left<=Right && Top<=Bottom){
            
            //first row
            for(int i=Left;i<=Right;i++){
                res.add(matrix[Top][i]);
            }
            Top++;
            
            //Last column
            for(int i=Top;i<=Bottom;i++){
                res.add(matrix[i][Right]);
            }
            Right--;
            
            //Last row
            if(Top<=Bottom){
                for(int i=Right;i>=Left;i--){
                    res.add(matrix[Bottom][i]);
                }
                Bottom--;
            }
            
            //first column
            if(Left<=Right){
                for(int i=Bottom;i>=Top;i--){
                    res.add(matrix[i][Left]);
                }
                Left++;
            }
        }
        return res;
    }
}

//Diagnol traverse matrix
//Time o(mn) m - no of rows, n - no of columns
//space o(1)

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        //edge cases
        if(matrix == null || matrix.length == 0)
            return new int[0];
        
        int m = matrix.length; //row length
        int n = matrix[0].length; //column length
        int[] res = new int[m*n];
        int row=0, col=0;
        int idx = 0, dir = 1;
        
        while(idx < m*n){
            res[idx] = matrix[row][col];
            //upward direction
            if(dir == 1){
                if(col == n-1){
                    row++;
                    dir = -1;
                }
                else if(row == 0){
                    col++;
                    dir = -1;
                }
                else{
                    row--;
                    col++;
                }
            }
            else if(dir == -1){
                if(row == m-1){
                    col++;
                    dir = 1;
                }
                else if(col == 0){
                    row++;
                    dir = 1;
                }
                else{
                    row++;
                    col--;
                }
            }
            idx++;
        }
        return res;
        
    }
}

// product of numbers except itself
//Time o(n) n - size of i/p array
//Space o(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0)
            return new int[0];
        
        int rp=1, temp = 1;
        int[] res = new int[nums.length];
        
        //left side product
        for(int i=0;i<nums.length;i++)
        {
            rp = rp*temp;
            temp = nums[i];
            res[i] = rp;
        }
        
        //right side product
        rp =1; temp =1;
        for(int i=nums.length-1;i>=0;i--){
            rp = rp*temp;
            temp = nums[i];
            res[i]= res[i]*rp;
        }
        return res;
    }
}