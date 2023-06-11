class Solution {
    public int[] productExceptSelf(int[] nums) {
//Time Complexity is:- O(n);// Because we need to travese through all the element
//Space Complexity is:- O(1); // Becuase auxiliary memory(input and ouput memory)doesn't count; 


        //null check
        if(nums==null || nums.length==0) return new int[0];
        //Taking a resultent array
        //Taking the length of the given array
        int len = nums.length;
        int[] result = new int[len];
        result[0]=1;
        int n = nums.length;

        //left side of the element Product
        //temp variable to store the resultant product or product of the previous element
        int temp = 1; //Doing multiplication that's y 1
        for(var i=1;i<n;i++){
                temp = temp * nums[i-1];
                result[i]=temp;
        }
        //right side of the element Product
        int temp2 = 1;
        for(var i=n-2;i>=0;i--){
                temp2 = (temp2 * nums[i+1]);
                result[i] = temp2 * result[i];
        }
        return result;
    }
}