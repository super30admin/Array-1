public class Solution{
      public int[] product(int[] nums){
           int[] finalResult= new int[nums.length];
           finalResult[nums.length-1]=nums[nums.length-1];
           for(int i=nums.length-2;i>=0;i--){
               finalResult[i]=finalResult[i+1] * nums[i];
           }
           for(int i=1;i< nums.length;i++){
               nums[i]=nums[i-1] * nums[i];
           }

           for(int i=0;i< nums.length;i++){
               if(i==0) finalResult[i]=finalResult[i+1];
               else if(i==nums.length-1) finalResult[i]=nums[i-1];
               else finalResult[i]=nums[i-1]*finalResult[i+1];
           }
           
           return finalResult;
       }

}
