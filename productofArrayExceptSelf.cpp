//time complexity:O(1)
//space complexity:O(n)
//executed on leetcode: yes
//approach:using array
//any issues faced? no
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n=nums.size();
        vector<int>res(n);
        vector<int>left(n,1);
        vector<int>right(n,1);
        for(int i=1; i<n; i++)
            left[i]=left[i-1]*nums[i-1];
        for(int i=n-2; i>=0; i--)
            right[i]=right[i+1]*nums[i+1];
        for(int i=0; i<n; i++)
            res[i]=left[i]*right[i];
        return res;
    }
};