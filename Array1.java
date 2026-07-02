// Approach:
// 1. Create an answer array to store the prefix products.
// 2. Traverse from left to right and store the product of all elements before the current index.
// 3. Traverse from right to left while maintaining a suffix product.
// 4. Multiply the prefix product with the suffix product to get the final answer.
// 5. This avoids using division and computes the result in one extra pass.

// Time Complexity: O(n)
// Space Complexity: O(1) (excluding the output array)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i]=nums[i-1]*ans[i-1];
        }
        int res=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=res*ans[i];
            res*=nums[i];
        }
        return ans;
    }
}
//problem 2
// Approach:
// 1. Start from the top-left cell of the matrix.
// 2. Traverse diagonally upward when (row + col) is even.
// 3. Traverse diagonally downward when (row + col) is odd.
// 4. Whenever a boundary is reached, change the direction accordingly.
// 5. Continue until all matrix elements are added to the result array.

// Time Complexity: O(m * n)
// Space Complexity: O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int [] result=new int[m*n];
        int row=0,col=0;
        int idx=0;
        while(idx<m*n){
            result[idx++]=mat[row][col];
            if((row+col)%2==0){
                if(col==n-1){
                    row++;
                }else if(row==0){
                    col++;
                }else{
                    row--;
                    col++;
                }
            } else{
                if(row==m-1){
                    col++;
                }else if(col==0){
                    row++;
                }else{
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
}
//problem 3
// Approach:
// 1. Maintain four boundaries: top, bottom, left, and right.
// 2. Traverse from left to right, then move the top boundary down.
// 3. Traverse from top to bottom, then move the right boundary left.
// 4. If rows remain, traverse from right to left and move the bottom boundary up.
// 5. If columns remain, traverse from bottom to top and move the left boundary right.
// 6. Repeat until all elements are visited.

// Time Complexity: O(m * n)
// Space Complexity: O(1) (excluding the output list)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;
        while(left<=right && top<=bottom){
        for(int i=left;i<=right;i++){
            res.add(matrix[top][i]);
        }top++;
        for(int i=top;i<=bottom;i++){
            res.add(matrix[i][right]);
        }right--;
        if(top<=bottom){
        for(int i=right;i>=left;i--){
            res.add(matrix[bottom][i]);
        }
        bottom--;
        }
        if(left<=right){
        for(int i=bottom;i>=top;i--){
            res.add(matrix[i][left]);
        }left++;
        }
        }
        return res;
    }
}
