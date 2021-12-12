//Time complexity:O(N)
//Space complexity:O(N)
// Did this code successfully run on Leetcode :YES
// Three line explanation of solution in plain english
// we maintain a running product of left side and right of an element  and add that to the resultant array.

public class ProductExceptSelf{
    
        public int[] productExceptSelf(int[] nums) {
                if(nums.length==0 ||nums==null){
                    return new int[] {};
                }
                int result[]=new int[nums.length];
                int rp=1;
                result[0]=rp;
                for(int i=1;i<result.length;i++){
                    rp=rp*nums[i-1];
                    result[i]=rp;
                }
            rp=1;
            for(int i=result.length-2;i>=0;i--){
                rp=rp*nums[i+1];
                result[i]=result[i]*rp;
            }
            return result;
        }
    
    public static void main(String args[]){
        ProductExceptSelf obj=new ProductExceptSelf();
        int nums[]={1,2,3,4};
        int res[]=obj.productExceptSelf(nums);
        for(int x:res){
            System.out.print(x+" ");
        }
    }
}