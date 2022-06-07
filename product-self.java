class Solution {
    public int[] productExceptSelf(int[] nums) {
    //tc: O(n) sc: O(n)
        int[] result=new int[nums.length];
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int prod=1;
        left[0]=1;
        for(int i=1;i<nums.length;i++){
            prod=prod*nums[i-1];
            left[i]=prod;
        }
        
        prod=1;
        right[right.length-1]=1;
        for(int j=nums.length-2;j>=0;j--){
            prod=prod*nums[j+1];
            right[j]=prod;
        }
        for(int i=0;i<nums.length;i++){
            result[i]=left[i]*right[i];
        }
        return result;
    }
}
