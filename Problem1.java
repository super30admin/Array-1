// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

//Use running sum to calculate the product of elements to the right of each array
//and store it into another array. similary create an array which stores the products
//to the left of each element. Find the product of each index of both the array to get
//the resultant array which would give the answer

// Your code here along with comments explaining your approach
class Problem1 {
    public int[] productExceptSelf(int[] nums) {
        int rp = 1;
        int[] leftArr = new int[nums.length];
        leftArr[0] = 1;
        for(int i=0 ; i<nums.length-1; i++){
            rp *= nums[i];
            leftArr[i+1] = rp;
        }
        rp =1;
        for(int i=nums.length-1; i>0;i--){
            rp *= nums[i];
            leftArr[i-1] *= rp;
        }

        return leftArr;
    }

}
