               // Product of Array except self

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//1. traverse whole array and keep track of left product for each element.
//2. traverse whole array in  reverse direction and keep track of right product for each element 
// 3. multiply left and right product for each element.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int product = 1;

        arr[0] = 1;
        for(int i=1;i<nums.length;i++){
            product *= nums[i-1];
            arr[i] = product;
        }

        product = 1;
        for(int i=nums.length-2;i>=0;i--){
            product *= nums[i+1];
            arr[i] *= product;
        }
        return arr;
    }
}


               // Diagnol Traverse

// Time Complexity : O(m * n)  ... m , n = dimensions of 2D array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {

    private boolean isValid(int m, int n, int row, int col){
        if(row >= 0 && row < m && col >= 0 && col < n)
            return true;
        return false;
    }

    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;        
        int[] arr = new int[mat.length * mat[0].length];
        int index = 0;
        int dir = 1;
        int row = 0, col = 0;

        while(index < arr.length){
            if(!isValid(m, n, row, col))
                break;
            arr[index++] = mat[row][col];
            if(dir == 1){
                if(col == n-1){
                    row++;
                    dir = -1;
                } else if(row == 0){
                    col++;
                    dir = -1;
                } else {
                    row--;
                    col++;
                } 
            } else {
                if(row == m-1){
                    col++;
                    dir = 1;
                } else if(col == 0){
                    row++;
                    dir = 1;
                } else {
                    row++;
                    col--;
                }
            }
        }
        return arr;
    }
}

               // Spiral Matrix

// Time Complexity : O(m * n)  ... m , n = dimensions of 2D array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList();
        int m = matrix.length;
        int n = matrix[0].length;                                           
        int top = 0;
        int left = 0;
        int bottom = m - 1;
        int right = n - 1;

        while(list.size() < m * n){
            // left to right
            if(top <= bottom && left <= right){
                for(int i=left;i<=right;i++)
                    list.add(matrix[top][i]);
                top++; 
            }                                                   

            // top to bottom
            if(top <= bottom && left <= right){
                for(int i=top;i<=bottom;i++)
                    list.add(matrix[i][right]); 
                right--;
            }
            

            // right to left
            if(top <= bottom && left <= right){
                for(int i=right;i>=left;i--)
                    list.add(matrix[bottom][i]);
                bottom--;
            }

            // bottom to top
            if(top <= bottom && left <= right){
                for(int i=bottom;i>=top;i--)
                    list.add(matrix[i][left]);
                left++;
            }
        }
        return list;
    }
}
