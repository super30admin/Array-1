//Time Complexicity = O(n)
//Space Complexicity = O(1)
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
      
         int n = nums.size(); int rp = 1; int temp = 1;
            vector<int>result(n);
        
        //left pass
        for(int i = 0; i < n; i++){
            rp = rp * temp;
            result[i] = rp;
            temp = nums[i];
        }
        
        //right pass
        rp =1; temp = 1;
        for(int i = n-1; i>=0;i--){
            rp = rp*temp;
            result[i] = result[i] * rp;
            temp = nums[i];
        }
        return result;
    }
};