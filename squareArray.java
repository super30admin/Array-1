// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public class squareArray {

    public int[] productExceptSelf(int[] nums) {
        
        int[] result= new int[nums.length];
        
        if(nums.length==0 || nums==null)
            return result;
        
        int running=1; 
        result[0]=1;
        for( int i=1; i<nums.length;i++){
             
            running*= nums[i-1];
            result[i]=running;
            
        }
        
        running=1;
        
        for( int i=nums.length-2; i>=0;i--){
             
            running*= nums[i+1];
            result[i]= result[i]*running;
            
        }
        
        return result;
    }
    
}
