// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english: Initially we are calculating the product of adjacent elements and then we are again traversing form the last and updating the same array with product of adjacent.

class ProductOfArrayExceptItself {
    public int[] productExceptSelf(int[] nums) {

        int[] result=new int[nums.length];
        int  product=1;
        result[0]=1;
        for(int i=1;i<nums.length;i++){
            product=product*nums[i-1];
            result[i]=product;
        }
        product=1;
        for(int i=nums.length-2;i>=0;i--){
            product=product*nums[i+1];
            result[i]=product*result[i];
        }

        return result;
    }

}