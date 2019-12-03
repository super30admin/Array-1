//product of array except self

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int length = nums.size();
        vector<int>answer(length);

        if(answer.empty() || answer.size() == 0) return answer;


        answer[0] = 1; // because there is no element to the left of index '0'

        for (int i = 1; i < length; i++){
            answer[i] = nums[i - 1] * answer [i -1];    //product on the left side of index i
        }

        int right = 1;  // to store product of all elements to the right; no element to the right of index length-1, so right = 1

        for(int i = length-1; i >= 0; i--){
            answer[i] = answer[i] * right;
            right *= nums[i];        // updating right by multiplying it with current nums[i]
        }


        return answer;

    }
};

//Time complexity: O(N)
//Space complexity:O(1)
