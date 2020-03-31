// Time Complexity : O(n)
// Space Complexity : 2. O(n), 3. O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Getting to the technique was a bit difficult in the beginning


// Your code here along with comments explaining your approach
//1.Edge case
//A. if nums size is zero or one return empty vector

//2. Calculate the product value: two functions are written 
//A. Using left hand side and right hand side array for calculation
//B. Calculate left hand side 
//C.  Calculate right hand side 
//D  Calculate result

//3  Without extra space
//A. Calculate left hand side 
//B. Calculate right hand side 
//C.  Calculate result

class Solution {
    vector<int> product_calculation_with_extra_space(vector<int>& nums){
        
        vector<int> left_hand_side_product(nums.size(),1);
        vector<int> right_hand_side_product(nums.size(),1);
        vector<int> result(nums.size(),1);
        
        //2.B
        for(int i=1; i<nums.size(); i++){
            left_hand_side_product[i] = left_hand_side_product[i-1] * nums[i-1];
        }
        //2.C
       for(int i=nums.size()-2; i>=0; i--){
            right_hand_side_product[i] = right_hand_side_product[i+1] * nums[i+1];
        }
        //2.D
         for(int i=0; i<nums.size(); i++){
           result[i] = left_hand_side_product[i] * right_hand_side_product[i] ;
        }
        return result;
    }
    
    
    
     vector<int> product_calculation_without_extra_space(vector<int>& nums){
        
        vector<int> result(nums.size(),1);
        
        //3.A
        for(int i=1; i<nums.size(); i++){
            result[i] = result[i-1] * nums[i-1];
        }
         int right_hand_side  =1;
         //3.C
        for(int i=nums.size()-1; i>=0; i--){
           //3.B
           result[i] = result[i] * right_hand_side ;
            //3.C
           right_hand_side *= nums[i];
        }
        return result;
    }
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        //1.A
        if(nums.size()==0 || nums.size()==1){
            vector<int> result(1,0);
            return result;
        }
        // if(nums.size()==1){
        //     vector<int> result(1,0);
        //     return result;
        // }
        //2.A
       // return product_calculation_with_extra_space(nums);
        //3.A
       return product_calculation_without_extra_space(nums);
    }
};
