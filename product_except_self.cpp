//Time complexity - O(n^2)
//Space complexity - O(n)
//Ran sucessfully on leetcode

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n=nums.size();
        vector<int>L(n);
        vector<int>R(n);
        L[0]=1;
        R[n-1]=1;
        for(int i=1;i<n;i++)
            L[i]=nums[i-1]*L[i-1];
        for(int i=n-2;i>=0;i--)
        {
            R[i]=nums[i+1]*R[i+1];            
        }
        for(int i=0;i<n;i++)
           L[i]=L[i]*R[i];
        return L;
    }
};