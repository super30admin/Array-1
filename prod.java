/*Time Complexity:O(N)
Space Complexity:O(1)
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length==0){
            return null;
        }
    int[] left=new int[nums.length];
    int[] right=new int[nums.length];
    left[0]=1;
    for(int i=1;i<nums.length;i++){
        left[i]=left[i-1]*nums[i-1];
    }
    int r=1;
        for(int j=nums.length-1;j>=0;j--){
        left[j]=left[j]*r;
        r=r*nums[j];
    }
        
 return left;
}
}