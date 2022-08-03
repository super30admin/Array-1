// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution{
	public int[] Array(int[] nums ){
		int[] result=new int[];
		int n=nums.length;
		int rp=1;
		result[0]=1;
		for(int i=1;i<=n;i++){
			rp=rp*nums[i];
			result[i]=rp;
		}
		rp=1;
		for(int j=2;j>n;j--){ //why is it n-2?
			rp=rp*nums[j];
			result[j]=result[j]*rp;
		}
		return result;
	}
}
