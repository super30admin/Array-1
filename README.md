# Array-1

## Problem 1: Product of Array Except Self

```Java
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
//Explanation: This approach is when we want to get the output in O(n) time and O(1) space. A result[] is for storing
//             the elements on the left side (call it left pass). Once we calculate left pass, we declared a variable
//             runningProduct which in initialiased to 1 and we then calculate the running product from right side (i.e n-2)
//             for right pass and update the array for left pass. Hence, instead of using 2 arrays, we were able to solve it 
//             using single array.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        //null check
        if(nums == null || n == 0)
            return result;

        int runningProduct = 1;
        result[0] = 1;

        //left pass
        for(int i=1; i<n; i++){
            runningProduct *= nums[i-1];
            result[i] = runningProduct;
        }

        //right pass
        runningProduct = 1;
        for(int i=n-2;i>=0;i--){
            runningProduct *= nums[i+1];
            result[i] = result[i] * runningProduct;
        }
        return result;
    }
}
```
## Problem 2: Diagonal Traverse

```Java
// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        //null check
        if(mat == null || mat.length == 0)
            return new int[]{};
        
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int r=0, c=0, dir=1;
        int idx = 0;
        
        while(idx<result.length){ //check if we covered all the elements
            result[idx] = mat[r][c];
            idx++;
            
            //up direction
            if(dir == 1){
                if(c == n-1){
                    r++;
                    dir = -1;
                }
                else if(r == 0){
                    c++;
                    dir = -1;
                }
                else{
                    r--;
                    c++;
                }
            }
        
            //down direction
            else{
                if(r == m-1){
                    c++;
                    dir = 1;
                }
                else if(c == 0){
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
```
## Problem 3: Spiral Matrix

```Java
// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = n - 1;
        int top = 0, bottom = m - 1;

        List<Integer> result = new ArrayList<>();

        while (top <= bottom && left <= right) {
            //top row
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            //right wall
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            //bottom wall
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
            }
            bottom--;

            //left wall
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
            }
            left++;

        }
        return result;
    }
}
```
