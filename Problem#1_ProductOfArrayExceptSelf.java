class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Traverse array from both ends gradually
        int factor = 1;
        int[] result = new int[nums.length];//First traversing from left
        result[0] = 1;
        //Going from left to right
        for(int i=1; i<nums.length; i++){
            //select the previos element for product
            result[i] = factor*nums[i-1];
            factor *= nums[i-1]; // update factor to current * 
            System.out.print(" "+result[i]);
        }
        //reset factor as new traversal starts
        factor = 1; 
        
        //Traversing from right now
        for(int j=nums.length-2;j>=0; j--){
            factor *=nums[j+1];
            result[j] *= factor; 
        }
        // System.out.println(result);
        return result;
    }
}