//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int products[]=new int[nums.length];
        int temp=1;
        for (int i=0; i<nums.length;i++){
            products[i]=temp;
            temp=temp*nums[i];
        }
        temp=1;
        for (int j=nums.length-1; j>=0;j--){
            products[j]=products[j]*temp;
            temp=temp*nums[j];
        }
        return products;
    }
}
