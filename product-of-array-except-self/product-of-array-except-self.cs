public class Solution {
    public int[] ProductExceptSelf(int[] nums) {
        
        int length = nums.Length;
        int[] answer = new int[length];
        
        answer[0]=1;
        
        for(int i=1;i<length;i++)
        {
            answer[i] = nums[i-1] * answer[i-1];
        }
        
        int r=1;
        for(int j=length-1;j>=0;j--)
        {
            answer[j] = answer[j] *r;
            r*= nums[j];
        }
        
        return answer;
    }
}
