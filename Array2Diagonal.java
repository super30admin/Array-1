// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
public int[] Diagonal(int[][] nums){
	if(nums==null || nums.length==0) return new int[][];
	int m=nums.length;
	int n=nums[0].length;
	int [] result=new int[m*n];
	int r=0;
	int c=0;
	int dir=1;
	int idx=0;
	while(idx<result.length){
		result[idx]=nums[r][c];
		idx++;
	if(dir==-1){ //when traversing in up direction
		if(c==n-1){
			r++;
			dir=-1;
		}
		else if(r==0 && c!-n-1){
			c++;
			dir=-1;
		}
		else{
			r--;
			c++;
		}
	}
	else{ //when traversing in down direction
		if(r==n-1){
			r++;
			dir=1;
		}
		else if(c==0 && r!=n-1){
			r++;
			dir=1;
		}
		else{
			c--;
			r++;
		}
	}
	} return result;
}
}
