//Accepted on LT
//The idea was to have 2 arrays one maintaing the left product of corresponding element and one maintaining the right product and if we multiply both we will get output
//Time should be 2n which is O(N)

class Solution {
    int lp = 1;
    public int[] productExceptSelf(int[] nums) {
        int[] p = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            if(i==0){
                p[i] = 1;
                continue;
            }
            else{
                p[i] = nums[i-1]*p[i-1];
            }
            

        }
        for(int j= nums.length-1;j>=0;j--){

            
            if(j==nums.length-1){
                continue;
            }
            else{
                p[j] = nums[j+1] * lp *p[j];
                lp = nums[j+1] * lp;
            }
        }

        return p;
        
    }
}