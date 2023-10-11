// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Your code here along with comments explaining your approach

// # Array-1

// ## Problem 1

// Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1;
        result[0] = 1;
        //calculating the left sub array - calculating the product left to the element
        for(int i=1; i<nums.length; i++){
            product = product * nums[i-1];
            result[i] = product;
        }
        //calculating the right sub array - calculating the product right to the element
        product = 1;
        for(int i=nums.length-2; i>=0; i--){
            product = product * nums[i+1];
            result[i] = result[i] * product;
        }

        return result;

    }
}

//## Problem 2
// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

//Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        //no of rows
        int m = matrix.length;
        //no of columns
        int n = matrix[0].length;
        //one dimentional array
        int[] result = new int[m*n];
        int index = 0;
        int i = 0;
        int j = 0;
        boolean dir = true;
        while(index < m*n){
            //upward direction
            result[index] = matrix[i][j];
            index++;
            if(dir){
                if(i == 0 && j!=n-1){
                    j++; dir = false;
                }else if(j== n-1){
                    i++; dir = false;
                }else{
                    i--; j++;
                }
            //downward direction
            }else{
                if(j == 0 && i!=m-1){
                    i++; dir = true;
                }else if(i== m-1){
                    j++; dir = true;
                }else{
                    j--; i++;
                }
            }
        }
        return result;
            
        }
}

// ## Problem 3
// Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0; int right = n-1;
        int top = 0; int bottom = m-1;
        List<Integer> list = new ArrayList<>();
        while(left <= right && top <= bottom){
            //top
            for(int j=left; j<=right; j++){
                list.add(matrix[top][j]);
            }
            top++;
            if(left <= right && top <= bottom){
            //bottom
                for(int i=top; i<=bottom; i++){
                    list.add(matrix[i][right]);
                }
                right--;
            }
            //right
            if(left <= right && top <= bottom){
                for(int j=right; j>=left; j--){
                    list.add(matrix[bottom][j]);
                }
                bottom--;
            }
            //left
            if(left <= right && top <= bottom){
                for(int i=bottom; i>=top; i--){
                list.add(matrix[i][left]);
            }
            left++;
            }
            
        }
        return list;
    }
}