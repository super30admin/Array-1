
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n= nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];
        for(int i=0;i< n; i++){
            if(i==0){
                left[i]=nums[i];
            }
        else{ left[i]=left[i-1]*nums[i];
            
        }        }
        for(int i=n-1; i>=0; i--){
            if(i==n-1){
                right[i]=nums[i];
            }
        else{ right[i]=right[i+1]*nums[i];
        }
        }
        
        
        for(int i=0; i<n;i++){
            if(i==0){ ans[i]= right[i+1];}
            else if(i==n-1) {ans[i] = left[i-1];}
                else{ ans[i]=right[i+1]* left[i-1];}
        }
        return ans;
    }
}