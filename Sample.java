//Problem-1
// Time Complexity :O(n)
// Space Complexity :O(n) we use only auxilary(the space on which only calculations are made) memory for the space complexity.
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english /* Here the basic idea is to maintain left product and the right
// product at that index. We compute the left product and right product at that index  and store that to  result.*/

// Your code here along with comments explaining your approach:/*calculate left product and store it to the leftproduct
//array and maintain the rightproduct variable and store to the result at that specific index by taking lp at that index
//and rightproduct variable.
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int [] leftProduct= new int[nums.length];
        leftProduct[0]=1;
        for(int i=1;i<leftProduct.length;i++){
            leftProduct[i]=leftProduct[i-1]*nums[i-1];
        }
        int rightProduct=1;
        int []result=new int[nums.length];
        for(int i=result.length-1;i>=0;i--){
            result[i]=rightProduct*leftProduct[i];
            rightProduct=rightProduct*nums[i];
        }
        return result;

    }
}
//Problem-2
// Time Complexity :O(mn)
// Space Complexity :O(1) we use only auxilary(the space on which only calculations are made) memory for the space complexity.
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english /* We need to traverse diagonally through all the elements of the
// 2d array.For this the main conditions to take care of direction change and if the index is at zero row and last row.
// Zero colum and last column*/

// Your code here along with comments explaining your approach:Here for this approach for the upward traversal we need to
//increase column and decrease row but when row is zero we can't decrease as it goes out of the bounds. so in that case
//increase column and change direction.If we have the column is equal to last column then increase row and change direction.
//We will do the vice versa for the other direction too.

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int index=0;
        int [] arr=new int[m*n];
        int i=0;
        int j=0;
        int dir=1;
        if(mat==null) return new int[0];
        while(index<m*n){
            arr[index]=mat[i][j];
            index++;
            if(dir==1){
                if(i==0 && j!=n-1){
                    j++;
                    dir=-1;
                }
                else if(j==n-1){
                    i++;
                    dir=-1;

                }
                else{
                    i--;
                    j++;
                }
            }
            else{
                if(j==0 && i !=m-1){
                    i++;
                    dir=1;

                }
                else if(i==m-1){
                    j++;
                    dir=1;
                }
                else{
                    i++;
                    j--;
                }
            }
        }
        return arr;

    }
}

//Problem-3
// Time Complexity :O(mn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english /* we need to print the outer elements first and and inner elements
// like this it goes nested. We maintain four variables left,right,top,bottom. For every row or column we fininshed we
// decrement or increase the value as per requirement.
//*/

// Your code here along with comments explaining your approach:Here intially we start left and top from zero and right from
// last column and bottom from last row. If we finish taking all the elements we increase top by 1 and if we take all the values
//of last column we decrement the right value , In the same way if we take all values of the bottom row, we decrement the
//value by 1. and if we print the first row values then we increase left by 1.At each and every time we are making sure that
//left <=right and top<=bottom.
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        int top=0;
        int bottom= matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        while(top<=bottom && left<= right){

            for(int j=left;j<=right;j++){
                res.add(matrix[top][j]);
            }
            top++;
            if(top<=bottom && left<= right){
                for(int i=top;i<=bottom;i++){
                    res.add(matrix[i][right]);
                }
                right--;
            }
            if(top<=bottom && left<= right){
                for(int j=right;j>=left;j--){
                    res.add(matrix[bottom][j]);
                }
                bottom--;}
            if(top<=bottom && left<= right){
                for(int i=bottom;i>=top;i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}