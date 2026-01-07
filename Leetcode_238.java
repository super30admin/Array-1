//way1
//linear-o(n^2)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;

        int[] ans=new int[n];

        for(int i=0;i<n;i++){
            int p=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    p*=nums[j];
                }
            }
            ans[i]=p;
        }

        return ans;
    }
}

//way2
//for every index:
//identify left product--leftproduct array
//identify right product--right product array
//multiply leftproduct and right product
//TC: O(3n)--> 3 constant; SC: O(n)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;

        //left product array
        int[] leftp=new int[n];
        leftp[0]=1;
        int p=1;

        for(int i=1;i<n;i++){
            p=p*nums[i-1];
            leftp[i]=p;
        }

        //right product array
        int[] rightp=new int[n];
        rightp[n-1]=1;
        p=1;

        for(int i=n-2;i>=0;i--){
            p=p*nums[i+1];
            rightp[i]=p;
        }

        //product at every place
        int[] ans=new int[n];

        for(int i=0;i<n;i++){
            ans[i]=(leftp[i]*rightp[i]);
        }

        return ans;
    }
}

//way3
//for every index:
//identify left product--leftproduct array
//identify right product--right product array
//multiply leftproduct and right product
//TC: O(2n)--> 2 constant; SC: O(n)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;

        //left product array
        int[] leftp=new int[n];
        leftp[0]=1;
        int p=1;

        for(int i=1;i<n;i++){
            p=p*nums[i-1];
            leftp[i]=p;
        }

        //right product array--instead of this, let's go with a constant product variable
        // int[] rightp=new int[n];
        // rightp[n-1]=1;
        // p=1;

        // for(int i=n-2;i>=0;i--){
        //     p=p*nums[i+1];
        //     rightp[i]=p;
        // }

        //product at every place
        int[] ans=new int[n];
        int pd=1;
        ans[n-1]=leftp[n-1];

        for(int i=n-2;i>=0;i--){
            pd=pd*nums[i+1];
            ans[i]=(leftp[i]*pd);
        }

        return ans;
    }
}
