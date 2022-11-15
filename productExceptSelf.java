// Time Complexity : O(n)
// Space Complexity :O(1) 
public class productExceptSelf {
    public int[] solution(int[] nums) {
        int[] ans=new int[nums.length];
        ans[0] = 1;
        int rsum=1;
        //first multiply and store the elements to left of curr element
        for(int i=1;i<nums.length;i++){
            rsum= rsum * nums[i-1];
            ans[i] = rsum;
        }
        
        rsum=1;
        // multiply and store the elements to right of curr element
        for(int i=nums.length-2;i>=0;i--){
            rsum= rsum * nums[i+1];
            ans[i]= ans[i] * rsum;
        }
        return ans;
    }
}
