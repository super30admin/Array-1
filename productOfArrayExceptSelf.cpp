// Time Complexity : O(N)
// Space Complexity :O(2N)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n=nums.size();
        vector<int> answer;
        if (n==0) return answer;
        
        vector<int> left(n,0);
        vector<int> right(n,0);
        
        left[0]=1;
        //calculate the left product array
        for(int i=1;i<n;i++){
            left[i]=nums[i-1]*left[i-1];
        }
        
        right[n-1]=1;
        //calculate the right product array
        for(int j=n-2;j>=0;j--){
            right[j]=right[j+1]*nums[j+1];
        }
        
        
        //calculate the total product array
        for(int i=0;i<n;i++){
            answer.push_back(left[i]*right[i]);
        }
        return answer;
    }
};