// Time Complexity : O(m*n) m=number of rows and n= number of coloumns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//  Take four pointers each on all four sides run loop for every side and update the pointer everytime, run everything in the while loop to continue until top<=bottom and left<=right
// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();       
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0,bottom=m-1,left=0,right=n-1;
        while(top<=bottom && left<=right){
        for(int i=left;i<=right;i++){
            ans.add(matrix[top][i]);
        }
        top++;
        if(top<=bottom && left<=right){
        for(int i=top;i<=bottom;i++){
             ans.add(matrix[i][right]);
        }
        right--;}
        if(top<=bottom && left<=right){
        for(int i=right;i>=left;i--){
             ans.add(matrix[bottom][i]);
        }
        bottom--;}
        if(top<=bottom && left<=right){
        for(int i=bottom;i>=top;i--){
             ans.add(matrix[i][left]);
        }
        left++;}
             }
        return ans;
    }
}