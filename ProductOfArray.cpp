// Time Complexity : O(n) n-> number of elements)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        if(nums.size()==0){
		return {};  //return an empty array
	}
        vector<int> result(nums.size(),0);
        int rp=1; //running product
        result[0]=1; //final resultant vector
        
	//from left to right
        for(int i=1; i<=nums.size()-1; i++){
            rp=rp*nums[i-1]*1;
            result[i]=rp;
        }
        
	//from right to left
        rp=1; 
        for(int i=nums.size()-2;i>=0;i--){
            rp=rp*nums[i+1];
            result[i]=rp*result[i];
        }
        return result;
        
    }
};

