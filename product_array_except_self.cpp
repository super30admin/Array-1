Time Complexity-O(n) 
Space Complexity-O(1)
Did the code run on Leetcode? Yes

#include <iostream>
#include<vector>
using namespace std;

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int i;
        vector<int>ans;
        ans.push_back(1);
        for(i=1;i<nums.size();i++)
        {
            ans.insert(ans.begin()+i,ans[i-1]*nums[i-1]);
        }
        int a=1;
        for(i=nums.size()-1;i>=0;i--)
        {
            ans[i]=ans[i]*a;
            a=a*nums[i];
        }
        return ans;
    }
};

int main() {
	vector<int>m={1,2,3,4};
	vector<int>res;
	Solution soln;
	res=soln.productExceptSelf(m);
	for(int i=0;i<res.size();i++)
	{
	    cout<<res[i]<<" ";
	}
	
	return 0;
}