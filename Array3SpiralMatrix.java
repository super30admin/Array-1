// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
	public List<Integer> SpiralArray(int[][] nums){
		int m=nums.length; 
		int n=nums[0].length;
		int left=0; int right=n-1; int bottom=m-1; int top=0;
		List<Integer> result=new ArrayList<>();
		while (top<=bottom && left<=right){
			for(int j=left; j<=right;j++){ //top row
				result.add(nums[top][j]);
			}
			top++;
			if(top<=bottom && left<=right){ // check base conditions of while loop again as you are changing the variable of while loop
				for(int i=top;i<=bottom;i++){//right column
					result.add(nums[i][right]);
				}
			}
			right--;
			if(top<=bottom && left<=right){
				for(int j=right;j>=left;j--){//bottom row
					result.add(nums[bottom][j]);
				}
			}
			bottom--;
			if(top<=bottom && left<=right){
				for(int i=bottom;i>=top;i--){//left column
					result.add(nums[i][left]);
				}
			}
			left++;
		}
		return result;
	}
}