//TC = O(N)
//SC = O(1) --> we are allowed to use an output array as per Q
//Running Product/Prefix/Suffix product

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int size = nums.size();
        vector<int> result(size);
        result[0]=1;
        result[1]=nums[0];
        for(int i=2;i<size;i++){
            result[i] = nums[i-1] * result[i-1];
        }
   
        int product = nums[size-1];
        for(int j=size-2;j>=0;j--){
            result[j] = result[j]*product;
            product = product * nums[j];
        }
        return result;
    }
};
