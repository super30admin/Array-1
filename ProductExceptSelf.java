// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Traverse the array twice from left to right and right to left.
// In first traversal store the element as running product of starting element to previous element(left side)
// In second traversal store the element as previous value multiplied by running product of last element to previous elemet(right side)
// Return the computed array

// Your code here along with comments explaining your approach
// a[i] = a[0]*a[1]*...*a{i-1]*a[i+1]*...a[n]
// 1st traversal r[i] = a[0]*....*a[i-1]
// 2nd traversal r[i] = r[i] * a[n] * ....* a[i+1]
// return array r

class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return new int[]{};
        int[] result = new int[nums.length];
        int rp = 1;
        int temp = 1;
        for(int i = 0; i < nums.length; i++){
            rp = rp * temp;
            temp = nums[i];
            result[i] = rp;            
        }
        
        rp = 1;
        temp = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            rp = rp * temp;
            temp = nums[i];
            result[i] *= rp;     
        }
        
        return result;
        
    }
}