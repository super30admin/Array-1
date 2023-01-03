// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//we will take product for every element from left side and also right side with 1 element less
//we consider result array and run two for loops for multiplication from left side and right side

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        //left
        int rp = 1;
        result[0] = 1;
        for(int i = 1; i<nums.length; i++){
            rp*= nums[i-1];
            result[i] = rp;
        }
        rp = 1;
        for(int i = nums.length-2; i>=0; i--){
            rp*= nums[i+1];
            result[i] *= rp;
        }
        return result;
    }
}

// Time Complexity :O(mn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Using flag we determine the direction of the traversing
// we use r and c variable for actual traversing
// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return new int[] {} ;
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int r = 0;
        int c = 0;
        boolean flag = true;
        for(int i = 0; i< result.length; i++){
            result[i] = mat[r][c] ;
            if(flag){ 
            if(r == 0 && c!= n-1){
            flag = false; c ++;
        }
        else if(c == n-1){
            flag = false; r++;
        }
        else{
            r--;
            c++;
        }
        }else{
            if(c == 0 && r!= m-1){
            flag = true; r++;
        }
        else if(r == m-1){
            flag = true;
            c++;
        }
        else{
            c--;
            r++;
        }

        }
        }

        return result;
        } 
    
}

// Time Complexity :O(mn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// We maintain four pointers namely left right top bottom
// We increment/decrement pointers accordingly after using them for traversing/printing purpose
// Any pair of pointer crosses each other and we stop

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList <Integer> result = new ArrayList<>();
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        while(top <= bottom && left <= right){
            for(int j = left; j<= right; j++){
                result.add(matrix[top][j]);
            }
            top++;
        if(top <= bottom && left <= right){
            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
        }
        if(top <= bottom && left <= right){
            for(int j = right; j >= left; j--){
                result.add(matrix[bottom][j]);
            }
            bottom--;
        }
        if(top <= bottom && left <= right){
            for(int i = bottom; i >= top; i--){
                result.add(matrix[i][left]);
            }
            left++;
        }
    }
        return result;
    }
}