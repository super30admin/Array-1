//product of array except self
//leetcode solution accepted
//time complexity:O(n*n) where n is the size of nums array 
//space complexity:O(n)
//approach :run two loops one from start to end other from end to start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;//initalizing n to the size of nums array
        int [] output = new int [N];
        output[0]=1;//10000000....
        for(int i =1;i<N;i++){//traversing from left to right
            output[i]=nums[i-1]*output[i-1];//value except self
        }
        int R = 1;//initalizing a right integer for running sum
        for(int i = N-1;i>=0;i--){
            output[i]=output[i]*R;
            R=R*nums[i];
        }
        
    return output;    
        
    }
    
}