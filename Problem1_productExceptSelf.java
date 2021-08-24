class Solution {
    public int[] productExceptSelf(int[] nums) {
     //Brute Force
        //Time Complexity=O(n^2)
        //Space Complexity=O(1)
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j)
                    product*=nums[j];
            }
            result[i]=product;
        }
        return result;
    }
}

//Optimized(Time)
//Time Complexity: O(n)
//Space Complexity: O(n)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int end=1;
        int[] stProd=new int[nums.length];
        int[] endProd=new int[nums.length];
        int[] resProd=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0)
                stProd[i]=1;
            else{
                stProd[i]=nums[i-1]*stProd[i-1];
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1)
                endProd[i]=1;
            else{
                endProd[i]=nums[i+1]*endProd[i+1];
            }
        }
        for(int i=0;i<nums.length;i++){
            resProd[i]=endProd[i]*stProd[i];
        }
        return resProd;
    }
}

//Optimized(Time & Space) Solution 
//Time Complexity:o(n)
//Space Complexity=o(1)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int rp=1;
        int[] start=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                start[i]=rp;
            }
            else{
                rp=rp*nums[i-1];
                start[i]=rp;
            }
        }
        rp=1;
        for(int j=nums.length-1;j>=0;j--){
            if(j!=nums.length-1){
                rp=rp*nums[j+1];
                start[j]=rp*start[j];
            }
            else{
                start[j]=rp*start[j];
            }
        }
        return start;
    }
}