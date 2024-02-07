// 238. Product of Array Except Self
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// firstly iterating through the input array backwards, calculating the product of elements from the 
// current position to the end and storing them in the result vector. and then iterating through the input array again,
// and updating the result vector by multiplying the product of elements before the current position with the 
//product of elements after the current position.


// Your code here along with comments explaining your approach
vector<int> productExceptSelf(vector<int>& nums) {
    int n = nums.size(), rp = 1; 
    vector<int> ans(n);
    ans[n-1] = nums[n-1];
    for(int i = n-2; i >= 0; i--)
        ans[i] = nums[i] * ans[i+1];
    for(int i = 0; i < n - 1; i++)
    {
        ans[i] = rp * ans[i+1];
        rp = rp*nums[i];
    }
    ans[n-1] = rp;
    return ans;
}
