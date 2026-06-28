
class ProductArraySelf {
    public int[] productArrayself(int[] nums) {
        int[] ans = new int[nums.length];
        int rProduct = 1;
        ans[0] = 1;
        for (int i=1; i<nums.length; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }
        for (int j=nums.length-2; j>=0; j--){
            rProduct = rProduct * nums[j+1];
            ans[j] = rProduct * ans[j];
        }
        return ans;
    }
    
}