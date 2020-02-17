//TIme Complexity: O(n)
//Space Complexity: O(1)

//Brute Force 
//Find the product of all elements by traversing once through the list and save in a variable.
//Now mutate the same list-  dividing the product by the current element and storing. 

class Solution{
    public int[] productExceptSelf(int [] nums){
        int var = 1;
        for(int i =0;i<nums.length;i++){
            var = var * nums[i];
        }
        for(int i =0;i<nums.length;i++){
            nums[i] = var/nums[i];
        }
        return nums;
    }
}