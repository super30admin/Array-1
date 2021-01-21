// Time Complexity : O(n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes




class Problem1 {
    public int[] productExceptSelf(int[] nums) {
        int product[]=new int[nums.length];
        
        if(nums.length==0 || nums==null){
            return product;
        }
        
        int leftpass[]=new int[nums.length];
        int rightpass[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            int temp=1;
            
            if(i==0)
            {
                leftpass[i]=1;
            }
            else{
                leftpass[i]=leftpass[i-1]*nums[i-1];
            }

        }
        for(int i=nums.length-1;i>=0;i--){
            int temp=1;
            
            if(i==nums.length-1)
            {
                rightpass[i]=1;
            }
            else{
                rightpass[i]=rightpass[i+1]*nums[i+1];
            }

        }
        System.out.println(Arrays.toString(leftpass));
        System.out.println(Arrays.toString(rightpass));
         for(int i=0;i<nums.length;i++){
             
             product[i]=leftpass[i]*rightpass[i];
        
         
         }
        

        
        return product;
    }
    


}