public class productOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        res[0]=1;
        int rp=1;
        for(int i=1; i<n; i++){
            rp=rp*nums[i-1];
            res[i]=rp;
        }

        rp=1;
        for(int j=n-2; j>=0;j--){
            rp=rp*nums[j+1];
            res[j]=res[j]*rp;
        }
        return res;

    }
}
