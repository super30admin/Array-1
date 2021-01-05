// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

//Below is the brute force solution.
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count=0;
        int product=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count=count+1;
            }else{
                product=product*nums[i];
            }
        }
        
        if(count==nums.length){
            return nums;
        }
        if(count==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    nums[i]=product;
                }else{
                    nums[i]=0;
                }
            }            
        }else if(count>1){
            for(int i=0;i<nums.length;i++){
                    nums[i]=0;

            }   
        }else{
            for(int i=0;i<nums.length;i++){
                 nums[i]=product/nums[i];
             }
        }
        return nums;
        
    }
}

//the appproach with extra space
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length==0 || nums==null) return nums;
        if(nums.length==1) return nums;
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        left[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            left[i]=nums[i]*left[i-1];
        }
        //System.out.println(Arrays.toString(left));
        right[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            right[i]=nums[i]*right[i+1];
        }
        //System.out.println(Arrays.toString(right));
        nums[0]=right[1];
        nums[nums.length-1]=left[left.length-2];
        for(int i=1;i<nums.length-1;i++){
            nums[i]=left[i-1]*right[i+1];
        }
        return nums;
        
    }
}
//