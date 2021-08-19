public class ProductNumbersExceptItself {
        public int[] productExceptSelf(int[] nums) {
    
    
            if(nums==null || nums.length==0)
            {
                return new int[]{};
            }
    
            int res[] = new int[nums.length];
    
            int runProduct =1;
    
            res[0]=1;
            for(int i=1;i<nums.length;i++)
            {
                runProduct*=nums[i-1];
                res[i]=runProduct;
    
            }
    
            runProduct=1;
    
    
            runProduct =1;
            for(int i=nums.length-2;i>=0;i--)
            {
                runProduct*=nums[i+1];
                res[i]*=runProduct;
            }
    
            return res;
        }
    }